/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



/**
 *
 * @author Julio Cesar
 */
public class TreeNode extends javax.swing.tree.DefaultMutableTreeNode{
    int id ;
    int Nome;
    int data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNome() {
        return Nome;
    }

    public void setNome(int Nome) {
        this.Nome = Nome;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
}
