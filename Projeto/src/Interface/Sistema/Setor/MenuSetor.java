package Interface.Sistema.Setor;

import Entidades.*;
import Interface.Cadastro.Empresa;
import Interface.Cadastro.Setor_Equipamento;
import Interface.Configuracoes.ConfigurarBanco;
import Interface.Sistema.NotaInspesao;
import Interface.Sistema.SeletorEmpresa;
import javax.swing.JOptionPane;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

/**
 *
 * @author Julio Cesar
 */
public class MenuSetor extends JFrame {
private final Usuario user ;
private static  JTree tree;
//private static javax.swing.JTree Tree;
   
    public static void atualizarArvore(Usuario user) {
       //jTree1.setRootVisible(false);
       tree = new JTree();
       jTree1.setModel(tree.get(user).getModel());
    
    }

    public MenuSetor() {
         user = new Usuario();
         user.setId(1);
         user.setName("JCESAR");
        initComponents();
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        /*
    DefaultTreeModel model = (DefaultTreeModel)jTree1.getModel();
DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
model.insertNodeInto(top, root, root.getChildCount() -1);
//root.add(new DefaultMutableTreeNode(top));
model.reload(root);
         */
        //jTree1.setVisible(true);
        //initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new JTree().get(user);
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        MenuRotinaLancarSemOco = new javax.swing.JMenuItem();
        MenuRotinaLancarManuGeral = new javax.swing.JMenuItem();
        MenuAtualizarEquipamentos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        config = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenu();
        MenuCadastoSetorEquipamento = new javax.swing.JMenuItem();
        menuConfigCadEmpresa = new javax.swing.JMenuItem();
        ConfigConexaoDB = new javax.swing.JMenuItem();
        sobreMenu = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Menu");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );

        jMenu3.setText("Menu");

        jMenu6.setText("Rotinas");

        jMenu7.setText("Lançar");

        MenuRotinaLancarSemOco.setText("Sem Ocorrencias");
        MenuRotinaLancarSemOco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRotinaLancarSemOcoActionPerformed(evt);
            }
        });
        jMenu7.add(MenuRotinaLancarSemOco);

        MenuRotinaLancarManuGeral.setText("Manutençao Geral");
        MenuRotinaLancarManuGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRotinaLancarManuGeralActionPerformed(evt);
            }
        });
        jMenu7.add(MenuRotinaLancarManuGeral);

        jMenu6.add(jMenu7);

        jMenu3.add(jMenu6);

        MenuAtualizarEquipamentos.setText("Atualizar equipamentos");
        MenuAtualizarEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarEquipamentosActionPerformed(evt);
            }
        });
        jMenu3.add(MenuAtualizarEquipamentos);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("Relatorios");
        jMenuBar2.add(jMenu1);

        config.setText("Configuraçoes");

        Cadastro.setText("Cadastro");

        MenuCadastoSetorEquipamento.setText("Setor/Equipamento");
        MenuCadastoSetorEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastoSetorEquipamentoActionPerformed(evt);
            }
        });
        Cadastro.add(MenuCadastoSetorEquipamento);

        menuConfigCadEmpresa.setText("Empresa");
        menuConfigCadEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConfigCadEmpresaActionPerformed(evt);
            }
        });
        Cadastro.add(menuConfigCadEmpresa);

        config.add(Cadastro);

        ConfigConexaoDB.setText("Conexao DB");
        ConfigConexaoDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfigConexaoDBActionPerformed(evt);
            }
        });
        config.add(ConfigConexaoDB);

        jMenuBar2.add(config);

        sobreMenu.setText("Sobre");
        jMenuBar2.add(sobreMenu);

        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SairMousePressed(evt);
            }
        });
        jMenuBar2.add(Sair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastoSetorEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastoSetorEquipamentoActionPerformed
        // TODO add your handling code here:
        Setor_Equipamento e = new Setor_Equipamento();
        e.setVisible(true);

    }//GEN-LAST:event_MenuCadastoSetorEquipamentoActionPerformed

    private void ConfigConexaoDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfigConexaoDBActionPerformed
        // TODO add your handling code here:]
        ConfigurarBanco c = new ConfigurarBanco();
        c.setVisible(true);
    }//GEN-LAST:event_ConfigConexaoDBActionPerformed

    private void MenuAtualizarEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarEquipamentosActionPerformed
        // TODO add your handling code here:
        atualizarArvore(user);
    }//GEN-LAST:event_MenuAtualizarEquipamentosActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
       // atualizarArvore(user);
    }//GEN-LAST:event_formWindowGainedFocus

    private void SairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMousePressed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Deseja encerrar o sistema", "Atençao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_SairMousePressed

    private void menuConfigCadEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConfigCadEmpresaActionPerformed
        // TODO add your handling code here:
        Empresa e = new Empresa();
        e.setVisible(true);
    }//GEN-LAST:event_menuConfigCadEmpresaActionPerformed

    private void MenuRotinaLancarSemOcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRotinaLancarSemOcoActionPerformed
        // TODO add your handling code here:
       
        if (JOptionPane.showConfirmDialog(null, "Confirmar a aberturar de inspeçao sem ocorencia" , "Confirmar abertura", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            SeletorEmpresa se = new SeletorEmpresa( Internacionalização.getIdSemOcorencia(), user);
                            se.setVisible(true);
                            // desktop.add(n);
                        }
    }//GEN-LAST:event_MenuRotinaLancarSemOcoActionPerformed

    private void MenuRotinaLancarManuGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRotinaLancarManuGeralActionPerformed
        // TODO add your handling code here:
       
        if (JOptionPane.showConfirmDialog(null, "Confirmar a aberturar de inspeçao de manutençao geral" , "Confirmar abertura", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            SeletorEmpresa se = new SeletorEmpresa( Internacionalização.getIdManuGeral(), user);
                            se.setVisible(true);
                            // desktop.add(n);
                        }
    }//GEN-LAST:event_MenuRotinaLancarManuGeralActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem ConfigConexaoDB;
    private javax.swing.JMenuItem MenuAtualizarEquipamentos;
    private javax.swing.JMenuItem MenuCadastoSetorEquipamento;
    private javax.swing.JMenuItem MenuRotinaLancarManuGeral;
    private javax.swing.JMenuItem MenuRotinaLancarSemOco;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu config;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTree jTree1;
    private javax.swing.JMenuItem menuConfigCadEmpresa;
    private javax.swing.JMenu sobreMenu;
    // End of variables declaration//GEN-END:variables
}
