package banco;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
     
}
