/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Julio Cesar
 */
public final class TreeNode extends javax.swing.tree.DefaultMutableTreeNode {

    int id;
    String Nome;
    Date data;
    Color Color;
    int Tipo;
    private Equipamento e;
    
    TreeNode(String nome) {
        super(nome);
        setNome(nome);
        
    }

    public Equipamento getE() {
        return e;
    }

    public void setE(Equipamento e) {
        this.e = e;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
