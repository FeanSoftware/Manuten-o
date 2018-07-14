/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultTreeCellRenderer;

public class CellRender extends DefaultTreeCellRenderer {

    @Override
    public Component getTreeCellRendererComponent(javax.swing.JTree tree, Object value,
            boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

        TreeNode node = (TreeNode) value;
        // System.out.println(node.getColor() + node.getNome());
        setForeground(node.getColor());
        // System.out.println(node.getNome()+node.getColor());
        if (node.getColor() == Internacionalização.getCorAtencao()) {
            Atrasados.addAtrasado(node.getId());
            if (node.getTipo() == Internacionalização.getTipoEquipamento()) {
                setIcon(new ImageIcon(Internacionalização.getIconeEquipamentoRed()));

            } else {
                setIcon(new ImageIcon(Internacionalização.getIconeSetorRed()));
            }
        } else {
            if (node.getTipo() == Internacionalização.getTipoEquipamento()) {
                setIcon(new ImageIcon(Internacionalização.getIconeEquipamento()));

            } else {
                setIcon(new ImageIcon(Internacionalização.getIconeSetor()));
            }
        }

        return this;

    }

}
