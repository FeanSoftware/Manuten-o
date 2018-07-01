package banco;

import Entidades.Equipamentos;
import Entidades.Setor;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.rowset.CachedRowSet;

public class ResgatarDados {

    private static CachedRowSet ResgatarDado(String sql) throws SQLException {
        java.sql.Connection con;
        PreparedStatement pstmt;
        ResultSet rs;
        CachedRowSet wrs = new FixedCachedRowSetImpl();
        con = ConexaoMySQL.getConexaoMySQL();
        pstmt = con.prepareStatement("SELECT " + sql);
        rs = pstmt.executeQuery();
        wrs.populate(rs);
        ConexaoMySQL.closeAll(con, pstmt, rs);
        return wrs;
    }

    private static List<Equipamentos> getListE(int idLocal) {
        Equipamentos e;
        List<Equipamentos> l = new LinkedList<>();
        CachedRowSet rs = null;
        String sql = "* FROM `equipamentos` WHERE idLocal = " + idLocal + ";";

        try {
            
            rs = ResgatarDado(sql);
           // System.out.println(sql + rs.getRow());
            while (rs.next()) {
                
                e = new Equipamentos();
                e.setNome(rs.getString("nomeEquipamento"));
                e.setId(rs.getInt("idEquipamentos"));
                e.setDataUltimaExpesao(String.valueOf(rs.getDate("dataUltimaInspecao")));
                l.add(e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ResgatarDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    private static List<Setor> getListsub(int idSetor) {
        Setor e = new Setor();
        List<Setor> l = new LinkedList<>();
        CachedRowSet rs = null;
        String sql = "* FROM `local` WHERE `referenciaLocal` = "+idSetor+";";
        Color c = Color.BLACK;
        try {
            rs = ResgatarDado(sql);

            while (rs.next()) {
                e.setNome(rs.getString("nomeLocal"));
                e.setId(rs.getInt("idLocal"));
                e.setEquipamento(getListE(rs.getInt("idLocal")));
                e.setSubSetor(getListsub(rs.getInt("idLocal")));
                for (Equipamentos eq : e.getEquipamento()) {
                    if (eq.getCor() == (Color.RED)) {
                        //System.err.println(eq.getCor() + eq.getNome());
                        c = eq.getCor();

                    }

                }
                e.setCor(c);
                l.add(e);
                e = new Setor();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ResgatarDados.class.getName()).log(Level.SEVERE, null, ex);
        }

        return l;
    }

    /*
    private static List<Setor> getLists(int setorInicial) {

        Setor e = new Setor();
        List<Setor> l = new LinkedList<>();
        Color c = Color.BLACK;
        CachedRowSet rs = null;
        String sql = "`local`.* "
                + "FROM `local` "
                + "WHERE `local`.`referenciaLocal` = `" + setorInicial + "`;";

        try {
            rs = ResgatarDado(sql);
            while (rs.next()) {
                e.setNome("Setor " + i);
                e.setId(i);
                e.setSubSetor(getListsub());

                for (Setor eq : e.getSubSetor()) {
                    if (eq.getCor() == (Color.RED)) {
                        System.out.println(eq.getCor() + eq.getNome() + "qwsdas");
                        c = eq.getCor();

                    }

                }
                e.setCor(c);
                l.add(e);
                System.out.println(e.getCor() + e.getNome());
                e = new Setor();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ResgatarDados.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println();

            //  l.get(0).addSubsetor(e);
        }

        //l.get(0).addSubsetor(e);
        return l;
    }
*/
    public static List<Setor> getAllSetores() {
        return getListsub(0);

    }

}
