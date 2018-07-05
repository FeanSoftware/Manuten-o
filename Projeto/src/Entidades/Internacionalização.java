/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Julio Cesar
 */
public class Internacionalização {

    private static int idSemOcorencia = 0;
     private static int idInspNoraml = 1;
    private static int idManuGeral = 2;

    public static int getIdInspNoraml() {
        return idInspNoraml;
    }

    public static void setIdInspNoraml(int idInspNoraml) {
        Internacionalização.idInspNoraml = idInspNoraml;
    }
    
    private static String nomeEmpresa = "Nome do Grupo";
    private static Color corAtencao = Color.RED;
    private static Color corPadrao = Color.BLACK;
    private static Color corNomeEmpresa = Color.green;

    private static String LinkSalvarMidia = System.getProperty("user.dir") + "\\Midias";
    private static String LinkImagenFundo = "C:\\a.jpg";
    private static int tipoSetor = 1;
    private static int tipoEquipamento = 2;

    public static int getIdSemOcorencia() {
        return idSemOcorencia;
    }

    public static void setIdSemOcorencia(int idSemOcorencia) {
        Internacionalização.idSemOcorencia = idSemOcorencia;
    }

    public static int getIdManuGeral() {
        return idManuGeral;
    }

    public static void setIdManuGeral(int idManuGeral) {
        Internacionalização.idManuGeral = idManuGeral;
    }

    public static String getLinkSalvarMidia() {
        return LinkSalvarMidia;
    }

    public static void setLinkSalvarMidia(String LinkSalvarMidia) {
        Internacionalização.LinkSalvarMidia = LinkSalvarMidia;
    }

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

    public static void setNomeEmpresa(String nomeEmpresa) {
        Internacionalização.nomeEmpresa = nomeEmpresa;
    }

    public static String formataDataUSA(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            return formato.format(data);
    }
    public static String formataDataBrasil(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return formato.format(data);
    }
    public Internacionalização() {

    }

}
