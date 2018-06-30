/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class JTree extends  javax.swing.JPanel {

 
  private static javax.swing.JTree tree;
  
  private void add(){
      
  }

private DefaultMutableTreeNode Inserir(Setor setor, int i){
   
   
    if(setor.getSubSetor() == null){
         
       DefaultMutableTreeNode n = new DefaultMutableTreeNode(setor.getNome());
       if(setor.getEquipamento() != null){
           setor.getEquipamento().forEach((e) -> {
           n.add(new DefaultMutableTreeNode(e.getNome()));
           
        });
       }
       return n;
    }else{
        DefaultMutableTreeNode s = Inserir(setor.getSubSetor(), i+1);
        return a;
    }
      
    
    return null;
}

  public JTree() {

    DefaultMutableTreeNode top = new DefaultMutableTreeNode(Internacionalização.getNomeEmpresa());
    List<Setor> list = banco.ResgatarDados.getAllSetores();
    DefaultMutableTreeNode selecao = null;
    
    for(Setor s :list){
        
       selecao= Inserir(s,0);
        top.add(selecao);
             
    }
   
    DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
     DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
     DefaultMutableTreeNode d = new DefaultMutableTreeNode("d");
      DefaultMutableTreeNode q = new DefaultMutableTreeNode("q");
    
    
    a.add(new DefaultMutableTreeNode("A1"));
    a.add(new DefaultMutableTreeNode("A2"));
    b.add(new DefaultMutableTreeNode("B1"));
    b.add(new DefaultMutableTreeNode("B2"));
    b.add(new DefaultMutableTreeNode("B3"));  
    d.add(new DefaultMutableTreeNode("d"));
    q.add(new DefaultMutableTreeNode("B1"));
    q.add(new DefaultMutableTreeNode("B2"));
    q.add(new DefaultMutableTreeNode("B3"));
    a.add(b);
    b.add(d);
    d.add(q);
    top.add(a);
    

    
    
    tree = new javax.swing.JTree(top);

    
  }
  
  public static javax.swing.JTree get(){
      return tree;
  }
  
}
    
  

 





