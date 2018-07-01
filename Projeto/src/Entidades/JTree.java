/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interface.Sistema.Nota;
import java.awt.Color;
import java.util.List;
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
        top.setColor(Color.GREEN);
        List<Setor> list = banco.ResgatarDados.getAllSetores();
        list.forEach((s) -> {
            top.add(Inserir(s, 0));
        });
        
        tree = new javax.swing.JTree(top);
        
        
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setShowsRootHandles(true);
        tree.setCellRenderer(new CustomRenderer());
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                TreePath path = e.getPath();
                
                TreeNode currentNode = (TreeNode) path.getLastPathComponent();
                //System.out.println(currentNode.getId());
                
                Nota n = new Nota(currentNode.getId());
                n.setVisible(true);
            }
        });
    }
  
    
    private TreeNode Inserir(Setor setor, int i) {

        if (setor.getSubSetor() == null) {

            TreeNode sub = new TreeNode(setor.getNome());
            if (setor.getEquipamento() != null) {
                setor.getEquipamento().forEach((e) -> {
                    TreeNode no = new TreeNode(e.getNome());
                    no.setData(e.getDataUltimaExpesao());
                    no.setColor(e.getCor());
                 //   System.out.println(e.getDataUltimaExpesao());
                
                    no.setId(e.getId());
                   
                    sub.add(no);

                });
                sub.setColor(setor.getCor());
            }
            return sub;
        } else {
            TreeNode nivel = new TreeNode(setor.getNome());
            nivel.setId(setor.getId());
            nivel.setColor(setor.getCor());
            for (Setor s : setor.getSubSetor()) {
                nivel.add(Inserir(s, i + 1));
                //nivel.setId(s.getId());
            }
            return nivel;

        }

    }

    private String idIten(TreeNode parent) {
        System.out.println(parent.Nome);
        if (parent.getParent() == null) {
            return parent.Nome;
        }
        return idIten((TreeNode) parent.getParent());
    }


}
