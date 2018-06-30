/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interface.Sistema.Nota;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author Julio Cesar
 */

    import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javax.swing.ScrollPaneConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class JTree extends  javax.swing.JPanel {

 
  private static javax.swing.JTree tree;
  
 

private TreeNode Inserir(Setor setor, int i){
   
    
   
    if(setor.getSubSetor() == null){
         
       TreeNode sub = new TreeNode(setor.getNome());
       if(setor.getEquipamento() != null){
           setor.getEquipamento().forEach((e) -> {
           TreeNode no =    new TreeNode(e.getNome());
           no.setId(e.getId());
           sub.add(no);
           
        });
       }
       return sub;
    }else{
        TreeNode nivel = new TreeNode(setor.getNome());
        nivel.setId(setor.getId());
        for(Setor s : setor.getSubSetor()){
            nivel.add(Inserir(s,i+1)); 
            //nivel.setId(s.getId());
        }
        return nivel;
        
       
    }
      
    
    
}
private String idIten(TreeNode parent){
    System.out.println(parent.Nome);
    if(parent.getParent() == null){
        return parent.Nome;
    }
     return idIten((TreeNode) parent.getParent()); 
}
  public JTree() {

    TreeNode top = new TreeNode(Internacionalização.getNomeEmpresa());
    List<Setor> list = banco.ResgatarDados.getAllSetores();   
    list.forEach((s) -> {
        top.add(Inserir(s,0));
      });
    

    tree = new javax.swing.JTree(top);

    
    //tree.setEditable(true);
    tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
    tree.setShowsRootHandles(true);
    
   tree.addTreeSelectionListener(new TreeSelectionListener() { 
						      public void valueChanged(TreeSelectionEvent e) { 
						        TreePath path = e.getPath();
                                                       
                                                         TreeNode currentNode=(TreeNode) path.getLastPathComponent(); 
                                                           //System.out.println(currentNode.getId());
                                                            
                                                        Nota n = new Nota(currentNode.getId());
                                                        n.setVisible(true);
						      } 
						    });
  }
  
  
  
  
  
  public static javax.swing.JTree get(){
      return tree;
  }
  
}
    
  

 





