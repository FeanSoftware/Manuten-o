package banco;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CriaBancoDeDados {

    public static void criar() {
        java.sql.Connection con;
        con = ConexaoMySQL.getConexaoMySQL();
        Statement stmt = null;
        try {
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(CriaBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql
                = "CREATE TABLE Conta (\n" +
"    id      INTEGER PRIMARY KEY AUTOINCREMENT\n" +
"                    NOT NULL,\n" +
"    numero  STRING  UNIQUE\n" +
"                    NOT NULL,\n" +
"    saldo   DOUBLE  NOT NULL,\n" +
"    titular STRING  NOT NULL\n" +
");";
        try {
            stmt.executeUpdate(sql);
            // stmt.close();
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CriaBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
                //  System.out.println("PreparedStatement Fechado");
            }
            if (con != null && !con.isClosed()) {
                con.close();
                //   System.out.println("Conexão Fechada");
            }

        } catch (SQLException e) {
        }
    }
}
