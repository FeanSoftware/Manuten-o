package banco;



import Entidades.Equipamento;
import Entidades.Nota;
import Entidades.Setor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InserirDados {


    
    private static int iserirDados(String dados) {
        System.out.println(dados);
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
System.out.println(ex.getMessage());
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

    public static void inserirEquipamento(Equipamento e, int idLocal,int idEmpresa) {
        String sql = "equipamentos (nomeEquipamento, refenciaLocal, dataUltimaInspecao, idEmpresa) "
                + "VALUES ('"+e.getNome()+"','"+idLocal+"','"+e.getDataUltimaExpesao()+"','"+idEmpresa+"');";
        
        int idEquipamento = iserirDados(sql);
        sql = "equipamento_local(idEquipamento, idLocal, idEmpresa) VALUES ('"+idEquipamento+"','"+idLocal+"','"+idEmpresa+"');";
        iserirDados(sql);
        
        JOptionPane.showMessageDialog(null, "Equipamento "+idEquipamento+" Salvo com sucesso","Salvo com sucesso",JOptionPane.OK_OPTION);
        
        
    }

    public static void inserirSetor(Setor e, int id,int idEmpresa) {
       String sql = "local(referenciaLocal, nomeLocal, idEmpresa) VALUES ('"+id+"','"+e.getNome()+"','"+idEmpresa+"');";
       int idTranzaçao = iserirDados(sql);
       JOptionPane.showMessageDialog(null, "Setor "+idTranzaçao+" Salvo com sucesso","Salvo com sucesso",JOptionPane.OK_OPTION);
    }

    public static int inserirInspecao(Nota newNota) {
        String sql = "inspecao(idEquipamento,dataInspecao,dataEfetuadaInspecao, motivoInspecao, idUsuario, idEmpresa) "
                + "VALUES ('"+newNota.getEquipamento().getId()+"',"
                + "'"+newNota.getDateOcorencia()+"',"
                + "'"+newNota.getDateInspecao()+"',"
                + "'"+newNota.getInformacoes()+"',"
                + "'"+newNota.getUser().getId()+"',"
                + "'"+newNota.getEquipamento().getEmpresa().getId()+"')";
       int idTranzaçao = iserirDados(sql);
        sql = "equipamentos SET dataUltimaInspecao = '"+newNota.getDateInspecao()+"' WHERE idEquipamentos = "+newNota.getEquipamento().getId()+"";
        attDados(sql);
       JOptionPane.showMessageDialog(null, "Inspeçao "+idTranzaçao+" Salvo com sucesso","Salvo com sucesso",JOptionPane.OK_OPTION);
       return idTranzaçao;
    }

    public static void inserirEmpresa(Setor empresa) {
         String sql= "empresa(nomeEmpresa, cnpjEmpresa) VALUES ('"+empresa.getNome()+"','"+empresa.getCNPJ()+"')";
         iserirDados(sql);
         JOptionPane.showMessageDialog(null, "Dados salvo com sucesso","Sucesso",JOptionPane.OK_OPTION);
    }

   
}
