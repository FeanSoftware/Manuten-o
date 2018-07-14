/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interface.Configuracoes.ConfigurarBanco;
import java.awt.Color;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Cesar
 */
public class Internacionalização {

    private static Integer idSemOcorencia;
    private static Integer idInspNoraml;
    private static Integer idManuGeral;
    private static String nomeEmpresa;
    private static Color corAtencao;
    private static Color corPadrao;
    private static Color corNomeEmpresa;
    private static String LinkSalvarMidia;
    private static String LinkImagenFundo;
    private static Integer tipoSetor;
    private static Integer tipoEquipamento;
    private static String formatoDataBrasil;
    private static String formatoDataUSA;
    private static String iconeEquipamentoRed;
    private static String iconeEquipamento;
    private static String iconeSetorRed;
    private static String iconeSetor;

    public static String getFormatoDataBrasil() {
        return formatoDataBrasil;
    }

    public static void setFormatoDataBrasil(String formatoDataBrasil) {
        Internacionalização.formatoDataBrasil = formatoDataBrasil;
    }

    public static String getFormatoDataUSA() {
        return formatoDataUSA;
    }

    public static void setFormatoDataUSA(String formatoDataUSA) {
        Internacionalização.formatoDataUSA = formatoDataUSA;
    }

    public static ConfigInternacionalização leitor(String path, String nomeArquivo) {
        ConfigInternacionalização config = null;

        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream(path + "/" + nomeArquivo));

            while (true) {
                config = (ConfigInternacionalização) input.readObject();

            }
        } catch (EOFException endOfFileException) {
            return config;
        } catch (ClassNotFoundException classNotFoundException) {
            JOptionPane.showMessageDialog(null, "Unable to create object.");
        } catch (IOException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao abrir arquivo \n" + path + "\n" + ex.getMessage());
        }

        try {
            input.close();
        } catch (IOException ex) {
            Logger.getLogger(ConfigurarBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return config;
    }

    public static void initComponet() {
        ConfigInternacionalização config = leitor(System.getProperty("user.dir"), "Inter.bin");
        setCorAtencao(config.getCorAtencao());
        setCorNomeEmpresa(config.getCorNomeEmpresa());
        setCorPadrao(config.getCorPadrao());
        setIdInspNoraml(config.getIdInspNoraml());
        setIdManuGeral(config.getIdManuGeral());
        setIdSemOcorencia(config.getIdSemOcorencia());
        setLinkImagenFundo(config.getLinkImagenFundo());
        setLinkSalvarMidia(config.getLinkSalvarMidia());
        setNomeEmpresa(config.getNomeEmpresa());
        setTipoEquipamento(config.getTipoEquipamento());
        setTipoSetor(config.getTipoSetor());
        setFormatoDataUSA(config.getFormatoDataUSA());
        setFormatoDataBrasil(config.getFormatoDataBrasil());
        setIconeEquipamento(config.getIconeEquipamento());
        setIconeEquipamentoRed(config.getIconeEquipamentoRed());
        setIconeSetorRed(config.getIconeSetorRed());
        setIconeSetor(config.getIconeSetor());

    }

    public static int getIdInspNoraml() {
        return idInspNoraml;
    }

    public static void setIdInspNoraml(int idInspNoraml) {
        Internacionalização.idInspNoraml = idInspNoraml;
    }

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

    public static String formataDataUSA(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat(formatoDataUSA);
        //DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return formato.format(data);
    }

    public static String formataDataBrasil(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat(formatoDataBrasil);
        //  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formato.format(data);
    }

    public static String getIconeEquipamentoRed() {
        return iconeEquipamentoRed;
    }

    public static void setIconeEquipamentoRed(String iconeEquipamentoRed) {
        Internacionalização.iconeEquipamentoRed = iconeEquipamentoRed;
    }

    public static String getIconeEquipamento() {
        return iconeEquipamento;
    }

    public static void setIconeEquipamento(String iconeEquipamento) {
        Internacionalização.iconeEquipamento = iconeEquipamento;
    }

    public static String getIconeSetorRed() {
        return iconeSetorRed;
    }

    public static void setIconeSetorRed(String iconeSetorRed) {
        Internacionalização.iconeSetorRed = iconeSetorRed;
    }

    public static String getIconeSetor() {
        return iconeSetor;
    }

    public static void setIconeSetor(String iconeSetor) {
        Internacionalização.iconeSetor = iconeSetor;
    }

}
