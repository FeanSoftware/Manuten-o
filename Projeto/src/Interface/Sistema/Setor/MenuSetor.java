
package Interface.Sistema.Setor;

import Entidades.*;
import Interface.Cadastro.Setor_Equipamento;
import Interface.Configuracoes.ConfigurarBanco;

/**
 *
 * @author Julio Cesar
 */
public class MenuSetor extends JFrame {

    
    public MenuSetor() {
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
        jTree1 = new JTree().get();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        config = new javax.swing.JMenu();
        Cadastro = new javax.swing.JMenu();
        MenuCadastoSetorEquipamento = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        ConfigConexaoDB = new javax.swing.JMenuItem();
        sobreMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
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

        jMenuItem1.setText("Sem Ocorrencias");
        jMenu7.add(jMenuItem1);

        jMenuItem2.setText("Manutençao Geral");
        jMenu7.add(jMenuItem2);

        jMenu6.add(jMenu7);

        jMenu3.add(jMenu6);

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

        jMenuItem4.setText("Empresa");
        Cadastro.add(jMenuItem4);

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

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            
        }

    }//GEN-LAST:event_jTree1MouseClicked

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
    private javax.swing.JMenuItem MenuCadastoSetorEquipamento;
    private javax.swing.JMenu config;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenu sobreMenu;
    // End of variables declaration//GEN-END:variables
}
