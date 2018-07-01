/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interface.Sistema.Nota;
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
                 if(currentNode.getTipo() == Internacionalização.getTipoEquipamento()){
                     if(JOptionPane.showConfirmDialog(null, "Confirmar a aberturar de inspeçao para equipamento: "+currentNode.getNome(),"Confirmar abertura",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
                         Nota n = new Nota(currentNode.getId());
                         n.setVisible(true);
                     }
                      
                 }
               
            }
        });
    }

    private TreeNode Inserir(Setor setor, int i) {
        TreeNode nivel = new TreeNode(setor.getNome());

        if (setor.getSubSetor() != null) {
            nivel.setId(setor.getId()); 
            nivel.setTipo(Internacionalização.getTipoSetor());
            for (Setor s : setor.getSubSetor()) {
              TreeNode  subNivel = Inserir(s, i + 1);
                //subNivel.setColor(subNivel.Color);  
              nivel.setId(s.getId());
              nivel.setColor(subNivel.getColor());
               
             // c = subNivel.getColor();
             nivel.add(subNivel);
            } 
        }
        if (setor.getEquipamento() != null) {
                
                setor.getEquipamento().forEach((e) -> {
                    TreeNode no = new TreeNode(e.getNome());
                    no.setData(e.getDataUltimaExpesao());
                    no.setColor(e.getCor());
                    // System.out.println(e.getNome());
                    no.setId(e.getId());
                    no.setTipo(Internacionalização.getTipoEquipamento());
                    if(nivel.getColor() != Internacionalização.getCorAtencao() && no.getColor() == Internacionalização.getCorAtencao()){
                         nivel.setColor(e.getCor());
                    }
                  

                    nivel.add(no);

                });
                
            }
        return nivel;
    }

}
