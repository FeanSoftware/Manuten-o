package banco;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InserirDados {


    
    private static int iserirDados(String dados) {
        java.sql.Connection con = null;
        int id = 0;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = ConexaoMySQL.getConexaoMySQL();
            pstmt = con.prepareStatement("INSERT INTO " + dados, Statement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            rs = pstmt.getGeneratedKeys();
            while (rs.next()) {
                id = rs.getInt(1);
            }

        } catch (SQLException ex) {

        }

        ConexaoMySQL.closeAll(con, pstmt, rs);

        return id;
    }

    private static void attDados(String sql) {
        try {
            java.sql.Connection con;
        
            PreparedStatement pstmt;
            
            con = ConexaoMySQL.getConexaoMySQL();
            pstmt = con.prepareStatement("UPDATE " + sql);
            pstmt.executeUpdate();
           
            ConexaoMySQL.closeAll(con, pstmt, null);
        } catch (SQLException ex) {
            Logger.getLogger(ResgatarDados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private static void OrdenarBanco(String tabela, String coluna, String modo) {

        java.sql.Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = ConexaoMySQL.getConexaoMySQL();
            pstmt = con.prepareStatement(" Select * from " + tabela + " order by " + coluna + " " + modo, Statement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();

        } catch (SQLException ex) {
 
        }
        ConexaoMySQL.closeAll(con, pstmt, rs);

    }

   
}
