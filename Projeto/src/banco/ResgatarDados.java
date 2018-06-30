package banco;


import Entidades.Equipamentos;
import Entidades.Setor;
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
    
    private static List<Equipamentos> getListE(){
        Equipamentos e = new Equipamentos();
        List<Equipamentos> l = new LinkedList<>();
        for(int i = 0 ; i < 5;i++){
            e.setNome("Nome"+i);
            l.add(e);
            e = new Equipamentos();
        }
        
       return l;
    }
     private static List<Setor> getListsub(){
        Setor e = new Setor();
        List<Setor> l = new LinkedList<>();
        for(int i = 0 ; i < 5;i++){
            e.setNome("Sub"+i);
            e.setEquipamento(getListE());
            l.add(e);
            e = new Setor();
        }
        
       return l;
    }
    
    private static List<Setor> getLists(){
        Setor e = new Setor();
        List<Setor> l = new LinkedList<>();
        for(int i = 0 ; i < 5;i++){
            e.setNome("Setor"+i);
            e.setSubSetor(getListsub());
            l.add(e);
            e = new Setor();
        }
        
       return l;
    }

    public static List<Setor> getAllSetores() {
         List<Setor> e = getLists();
        return e;
    }
    
     
}
