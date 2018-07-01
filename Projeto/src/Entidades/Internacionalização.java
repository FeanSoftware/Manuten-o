/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Color;

/**
 *
 * @author Julio Cesar
 */
public class Internacionalização {
    private static String nomeEmpresa ="Nome empresa";
    private static Color corAtencao = Color.RED;
    private static Color corPadrao = Color.BLACK;
    private static Color corNomeEmpresa = Color.green;
    private static String LinkImagenFundo = "C:\\a.jpg";
    private static int tipoSetor = 1;
    private static int tipoEquipamento = 2;

    public static String getLinkImagenFundo() {
        return LinkImagenFundo;
    }

    public static void setLinkImagenFundo(String LinkImagenFundo) {
        Internacionalização.LinkImagenFundo = LinkImagenFundo;
    }

    public static int getTipoSetor() {
        return tipoSetor;
    }

    public static void setTipoSetor(int tipoSetor) {
        Internacionalização.tipoSetor = tipoSetor;
    }

    public static int getTipoEquipamento() {
        return tipoEquipamento;
    }

    public static void setTipoEquipamento(int tipoEquipamento) {
        Internacionalização.tipoEquipamento = tipoEquipamento;
    }
    
    
    public static Color getCorPadrao() {
        return corPadrao;
    }

    public static void setCorPadrao(Color corPadrao) {
        Internacionalização.corPadrao = corPadrao;
    }

    public static Color getCorNomeEmpresa() {
        return corNomeEmpresa;
    }

    public static void setCorNomeEmpresa(Color corNomeEmpresa) {
        Internacionalização.corNomeEmpresa = corNomeEmpresa;
    }
    
    public static Color getCorAtencao() {
        return corAtencao;
    }

    public static void setCorAtencao(Color corAtencao) {
        Internacionalização.corAtencao = corAtencao;
    }
    

    public static String getNomeEmpresa() {
        return nomeEmpresa;
    }

    static String getImagenFundo() {
       return LinkImagenFundo;
    }

    public Internacionalização() {
        
    }

    public static void setNomeEmpresa(String nomeEmpresa) {
        Internacionalização.nomeEmpresa = nomeEmpresa;
    }
    
    
}
