//Nome do nosso pacote // 
package banco;

//Classes necessárias para uso de Banco de dados //

import Entidades.ConfigBanco;
import java.sql.*;



//Início da classe de conexão//
public class ConexaoMySQL {

    public static String status = "Não conectou...";
   private static String driverName;
   private static         String serverName ;
     private static      String mydatabase ;      

      private static      String url;

     private static      String username;        
     private static       String password;

    
    public ConexaoMySQL() {

    }
    public ConexaoMySQL(ConfigBanco config){
         driverName = config.getDriverName();

            

// Configurando a nossa conexão com um banco de dados//
          serverName = config.getServerName();    //caminho do servidor do BD

        mydatabase = config.getMydatabase();        //nome do seu banco de dados

           url = config.getUrl() + serverName  + mydatabase;

         username = config.getUsername();        //nome de um usuário de seu BD      

          password = config.getPassword();   
    }
    
    
    

//Método de Conexão//
    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;          //atributo do tipo Connection
        System.out.println(url);
        

        try {

// Carregando o JDBC Driver padrão
             //sua senha de acesso
            Class.forName(driverName);
            connection = DriverManager.getConnection(url,username,password);

            //Testa sua conexão// 
            
             if (connection != null) {
                    
                status = ("Conectado com sucesso!");

            } else {
                System.out.println(status);
                status = ("Não foi possivel realizar conexão");

            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado

            status = "O driver expecificado nao foi encontrado.\n"+e.getMessage();

            return null;

        } catch (SQLException e) {

//Não conseguindo se conectar ao banco
          status = "Nao foi possivel conectar ao Banco de Dados.\n"+e.getMessage();

            return null;

        }

    }

    //Método que retorna o status da sua conexão//
    public static String statusConection() {

        return status;

    }

    //Método que fecha sua conexão//
    public static boolean FecharConexao() {

        try {

            ConexaoMySQL.getConexaoMySQL().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

    //Método que reinicia sua conexão//
    public static java.sql.Connection ReiniciarConexao() {

        FecharConexao();

        return ConexaoMySQL.getConexaoMySQL();

    }
    
     public static void closeAll(Connection con, PreparedStatement stmt , ResultSet rs){
        try
        {
            if(rs != null && !rs.isClosed()){
                rs.close();
             //   System.out.println("ResultSet Fechado");
            }
            if(stmt != null && !stmt.isClosed()){
                stmt.close();
            //    System.out.println("PreparedStatement Fechado");
            }
            if(con != null && !con.isClosed()){
                con.close();
              //  System.out.println("Conexão Fechada");
            }


        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

}
