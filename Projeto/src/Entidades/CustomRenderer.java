/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Color;
import java.awt.Component;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

/**
 *
 * @author Julio Cesar
 */
public class CustomRenderer extends DefaultTreeCellRenderer{
    // Sobrescreve este método para obter os efeitos desejados

    @Override
    public Component getTreeCellRendererComponent(javax.swing.JTree tree, Object value,
      boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
      super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
      
      TreeNode node = (TreeNode) value;
      // System.out.println(node.getColor() + node.getNome());
      setForeground(node.getColor());
        if (node.getColor() == Internacionalização.getCorAtencao()) {    
            Atrasados.addAtrasado(node.getId());
        }
     
         
      
      

 

      return this;

    }

  }

