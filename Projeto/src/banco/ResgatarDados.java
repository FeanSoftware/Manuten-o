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

    private static List<Equipamentos> getListE() {
        Equipamentos e;
        List<Equipamentos> l = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            e = new Equipamentos();
            e.setNome("Nome " + i);
            e.setId(i);
            e.setDataUltimaExpesao("30/06/2018");
            l.add(e);

        }
        e = new Equipamentos();
        e.setNome("Nome sdfg");
        e.setId(25);
        e.setDataUltimaExpesao("30/06/2000");
        l.add(e);

        return l;
    }

    private static List<Setor> getListsub() {
        Setor e = new Setor();
        List<Setor> l = new LinkedList<>();
        Color c = Color.BLACK;

        for (int i = 0; i < 5; i++) {
            e.setNome("Sub " + i);
            e.setId(i);
            e.setEquipamento(getListE());
            for (Equipamentos eq : e.getEquipamento()) {
                if (eq.getCor() == (Color.RED)) {
                    System.err.println(eq.getCor() + eq.getNome());
                    c = eq.getCor();

                } 

            }
            e.setCor(c);
            l.add(e);
            e = new Setor();
        }

        return l;
    }

    private static List<Setor> getLists() {

        Setor e = new Setor();
        List<Setor> l = new LinkedList<>();
        Color c = Color.BLACK;

        for (int i = 0; i < 2; i++) {
            System.out.println();
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

            

            //  l.get(0).addSubsetor(e);
        }

        //l.get(0).addSubsetor(e);
        return l;
    }

    public static List<Setor> getAllSetores() {
        return getLists();

    }

}
