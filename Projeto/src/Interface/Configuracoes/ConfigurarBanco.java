/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Configuracoes;

import Entidades.ConfigBanco;
import banco.ConexaoMySQL;
import java.awt.HeadlessException;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import Entidades.*;

/**
 *
 * @author Julio Cesar
 */
public class ConfigurarBanco extends JFrame {

    /**
     * Creates new form ConfigurarBanco
     */
    public ConfigurarBanco() {
        try {
            centralizarComponente();
        initComponents();
        setItensTela(leitor(System.getProperty("user.dir"), "ConfigBanco.bin"));
       testarConcecao();
        } catch (Exception e) {
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new JPanel();
        jTextDriverName = new javax.swing.JTextField();
        jTextServerName = new javax.swing.JTextField();
        jTextNameDB = new javax.swing.JTextField();
        jTextURLPadrao = new javax.swing.JTextField();
        jTextUserName = new javax.swing.JTextField();
        jTextURLCompleta = new javax.swing.JTextField();
        jPasswordPasswordDB = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelStatusBanco = new javax.swing.JTextPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOpcaoBanco = new javax.swing.JMenu();
        jMenuItemBancoTestar = new javax.swing.JMenuItem();
        jMenuItemBancoSalvar = new javax.swing.JMenuItem();
        jMenuOpcaoSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurar conexao com o banco de dados");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        jTextDriverName.setBorder(javax.swing.BorderFactory.createTitledBorder("Driver Name"));
        jTextDriverName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDriverNameFocusLost1(evt);
            }
        });

        jTextServerName.setBorder(javax.swing.BorderFactory.createTitledBorder("Server name"));
        jTextServerName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextServerNameFocusLost(evt);
            }
        });

        jTextNameDB.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do banco"));
        jTextNameDB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNameDBFocusLost(evt);
            }
        });

        jTextURLPadrao.setBorder(javax.swing.BorderFactory.createTitledBorder("URL padrão"));
        jTextURLPadrao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextURLPadraoFocusLost(evt);
            }
        });

        jTextUserName.setBorder(javax.swing.BorderFactory.createTitledBorder("User name"));
        jTextUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDriverNameFocusLost(evt);
            }
        });

        jTextURLCompleta.setBorder(javax.swing.BorderFactory.createTitledBorder("URL"));

        jPasswordPasswordDB.setBorder(javax.swing.BorderFactory.createTitledBorder("password"));
        jPasswordPasswordDB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDriverNameFocusLost(evt);
            }
        });

        jLabelStatusBanco.setEditable(false);
        jLabelStatusBanco.setBackground(jPanelPrincipal.getBackground());
        jLabelStatusBanco.setToolTipText("");
        jScrollPane1.setViewportView(jLabelStatusBanco);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextURLCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(jTextUserName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextDriverName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextServerName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNameDB, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextURLPadrao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordPasswordDB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jTextDriverName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextServerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextNameDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextURLPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordPasswordDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextURLCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jMenuOpcaoBanco.setText("Banco");

        jMenuItemBancoTestar.setText("Testar");
        jMenuItemBancoTestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemBancoTestarMousePressed(evt);
            }
        });
        jMenuOpcaoBanco.add(jMenuItemBancoTestar);

        jMenuItemBancoSalvar.setText("Salvar");
        jMenuItemBancoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemBancoSalvarMousePressed(evt);
            }
        });
        jMenuOpcaoBanco.add(jMenuItemBancoSalvar);

        jMenuBar.add(jMenuOpcaoBanco);

        jMenuOpcaoSair.setText("Sair");
        jMenuOpcaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuOpcaoSairMousePressed(evt);
            }
        });
        jMenuBar.add(jMenuOpcaoSair);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDriverNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDriverNameFocusLost
        // TODO add your handling code here:
        setURLPrincipal();
    }//GEN-LAST:event_jTextDriverNameFocusLost

    private void jTextDriverNameFocusLost1(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDriverNameFocusLost1
        // TODO add your handling code here:
        setURLPrincipal();
    }//GEN-LAST:event_jTextDriverNameFocusLost1

    private void jTextServerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextServerNameFocusLost
        // TODO add your handling code here:
        setURLPrincipal();
    }//GEN-LAST:event_jTextServerNameFocusLost

    private void jTextNameDBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNameDBFocusLost
        // TODO add your handling code here:
        setURLPrincipal();
    }//GEN-LAST:event_jTextNameDBFocusLost

    private void jTextURLPadraoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextURLPadraoFocusLost
        // TODO add your handling code here:
        setURLPrincipal();
    }//GEN-LAST:event_jTextURLPadraoFocusLost

    private void jMenuItemBancoSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemBancoSalvarMousePressed
        // TODO add your handling code here:
        salvar(System.getProperty("user.dir"),"ConfigBanco.bin");
    }//GEN-LAST:event_jMenuItemBancoSalvarMousePressed

    private void jMenuItemBancoTestarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemBancoTestarMousePressed
        // TODO add your handling code here:
        testarConcecao();
    }//GEN-LAST:event_jMenuItemBancoTestarMousePressed

    private void jMenuOpcaoSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuOpcaoSairMousePressed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Deseja mesmo sair","Deseja mesmo sair ?",JOptionPane.YES_NO_OPTION) == 0){
            this.dispose();
        }
    }//GEN-LAST:event_jMenuOpcaoSairMousePressed

    private void setURLPrincipal() {
       
            jTextURLCompleta.setText(String.valueOf(jTextURLPadrao.getText() + jTextServerName.getText() + jTextNameDB.getText()));
        
        
    }

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
            java.util.logging.Logger.getLogger(ConfigurarBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigurarBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigurarBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigurarBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigurarBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane jLabelStatusBanco;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemBancoSalvar;
    private javax.swing.JMenuItem jMenuItemBancoTestar;
    private javax.swing.JMenu jMenuOpcaoBanco;
    private javax.swing.JMenu jMenuOpcaoSair;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPasswordField jPasswordPasswordDB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextDriverName;
    private javax.swing.JTextField jTextNameDB;
    private javax.swing.JTextField jTextServerName;
    private javax.swing.JTextField jTextURLCompleta;
    private javax.swing.JTextField jTextURLPadrao;
    private javax.swing.JTextField jTextUserName;
    // End of variables declaration//GEN-END:variables

    private ConfigBanco getDadosNewConfig() {
        return new ConfigBanco(jTextDriverName.getText(), jTextServerName.getText(), jTextNameDB.getText(),
                jTextURLPadrao.getText(), jTextUserName.getText(), String.valueOf(jPasswordPasswordDB.getPassword()));
    }

    public void salvar(String path, String nomeArquivo) {
        try {
            ConfigBanco configBanco = getDadosNewConfig();
            Path novo = Paths.get(path);
            Files.createDirectories(novo);
            try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path+"\\"+nomeArquivo))) {
                output.writeObject(configBanco);
                if (output != null) {
                    output.close();
                      JOptionPane.showMessageDialog(null,"Salvo com sucesso","Arquivo salvo com sucesso em"+path,JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao abrir arquivo \n" + path,"Erro ao abrir arquivo \n" + path,JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
        }
      
    }

    public static ConfigBanco leitor(String path, String nomeArquivo) {
        ConfigBanco config = null;

       ObjectInputStream input = null ;
        try{ input = new ObjectInputStream(new FileInputStream(path+"/"+nomeArquivo)) ;
          
            while (true) {
                config = (ConfigBanco) input.readObject();
                
            }
        } catch (EOFException endOfFileException) {
            return config;
        } catch (ClassNotFoundException classNotFoundException) {
             JOptionPane.showMessageDialog(null,"Unable to create object.");
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao abrir arquivo \n" + path + "\n" + ex.getMessage());
        }
        try {
            input.close();
        } catch (IOException ex) {
            Logger.getLogger(ConfigurarBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return config;
    }

    void irURL(String URL) {
        String text, text2;
        text = System.getProperty("os.name");
        text = text.toLowerCase();
        text2 = URL;
        if (text.contains("linux") && !text2.equals("")) {
            try {
                Runtime.getRuntime().exec("nautilus " + URL); // Seu gerenciador de arquivos: konkeror (KDE), dolphin, nautilus (gnome) e etc
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null,"Gerenciador de arquivos não instalado.");
            }
        } else if (text.contains("windows") && !text2.equals("")) {
            try {
                Runtime.getRuntime().exec("explorer.exe " + URL); // A url, que no caso é C:/
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null,"Desculpe, falha na execução dessa função!");
            }
        }
    }

    private void setItensTela(ConfigBanco configBanco) {
        try {
            jTextDriverName.setText(configBanco.getDriverName());
        jTextNameDB.setText(configBanco.getMydatabase());
        jTextServerName.setText(configBanco.getServerName());
        jTextURLPadrao.setText(configBanco.getUrl());
        jTextUserName.setText(configBanco.getUsername());
        jPasswordPasswordDB.setText(configBanco.getPassword());
        setURLPrincipal();
        } catch (Exception e) {
        }
        

    }

    private void testarConcecao(){
        
         java.sql.Connection con;
         ConexaoMySQL c = new ConexaoMySQL(getDadosNewConfig());
        con = ConexaoMySQL.getConexaoMySQL();
        jLabelStatusBanco.setText(c.statusConection());
        c.closeAll(con, null, null);
    }
    
}
