/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interface.Sistema.NotaInspesao;
import banco.ResgatarDados;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class JTree extends DefaultTreeCellRenderer {
    
    private static javax.swing.JTree tree;
    
    public static javax.swing.JTree get() {
        return tree;
    }
    
    public JTree() {
        
        TreeNode top = new TreeNode(Internacionalização.getNomeEmpresa());
        top.setColor(Internacionalização.getCorNomeEmpresa());
        List<Setor> empresas = ResgatarDados.getAllEmpresas();
        for (Setor unidade : empresas) {
            TreeNode node = new TreeNode(unidade.getNome());
            
            List<Setor> list = ResgatarDados.getAllSetoresEquipamentos(unidade.getId());
        //    System.out.println("Entidades.JTree.<init>()");
            //node.setColor(VerificaAtrassador(list));
            for (Setor s : list) {
                
                node.add(Inserir(s, 0));
                
            }
            top.add(node);
        }
        tree = new javax.swing.JTree(top);
        
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setShowsRootHandles(true);
        tree.setCellRenderer(new CustomRenderer());
        
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                TreePath path = e.getPath();
                
                TreeNode currentNode = (TreeNode) path.getLastPathComponent();
                //System.out.println(currentNode.getId());
                System.out.println(currentNode.getColor());
                if (currentNode.getTipo() == Internacionalização.getTipoEquipamento()) {
                    if (JOptionPane.showConfirmDialog(null, "Confirmar a aberturar de inspeçao para equipamento: " + currentNode.getNome(), "Confirmar abertura", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        NotaInspesao n = new NotaInspesao(currentNode.getE());
                        n.setVisible(true);
                    }
                    
                }
                
            }
        });
    }
    
    private Color VerificaAtrassador(List<Setor> setor) {
        for (Setor s : setor) {
            VerificaAtrassador(s);
        }
        
        return Color.BLUE;
    }
    
    private void VerificaAtrassador(Setor setor) {
        
        if (!setor.getSubSetor().isEmpty()) {
            
            for (Setor s : setor.getSubSetor()) {
                VerificaAtrassador(s);
                System.out.println(s.getNome());
                if (!s.getEquipamento().isEmpty()) {
                    for (Equipamento e : s.getEquipamento()) {
                        if (e.getCor() == Internacionalização.getCorAtencao()) {
                            s.setCor(e.getCor());
                        }
                    }
                }
                if (s.getCor().equals(Internacionalização.getCorAtencao())) {
                    setor.setCor(s.getCor());
                }
                
            }
        }
        
    }
    
    private TreeNode Inserir(Setor setor, int i) {
        TreeNode nivel = new TreeNode(setor.getNome());
        
        if (setor.getSubSetor() != null) {
            nivel.setId(setor.getId());
            nivel.setTipo(Internacionalização.getTipoSetor());
            for (Setor s : setor.getSubSetor()) {
                TreeNode subNivel = Inserir(s, i + 1);
                subNivel.setColor(subNivel.Color);                
                nivel.setId(s.getId());

                nivel.add(subNivel);
            }
            nivel.setColor(setor.getCor());
        }
        if (setor.getEquipamento() != null) {
            
            setor.getEquipamento().forEach((e) -> {
                TreeNode no = new TreeNode(e.getNome());
                no.setE(e);
                no.setData(e.getDataUltimaExpesao());
                no.setColor(e.getCor());
                no.setId(e.getId());
                no.setTipo(Internacionalização.getTipoEquipamento());

                nivel.add(no);
                
            });
            
        }
        return nivel;
    }
    
}
