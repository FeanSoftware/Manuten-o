/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Color;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Julio Cesar
 */
public class ConfigInternacionalização implements Serializable {

    private Integer idSemOcorencia;// =0;
    private Integer idInspNoraml;// =1;
    private Integer idManuGeral;//=2;
    private String nomeEmpresa;//= "";
    private Color corAtencao;//= Color.RED ;
    private Color corPadrao;//= Color.BLACK;
    private Color corNomeEmpresa;//= Color.green ;
    private String LinkSalvarMidia;//= System.getProperty("user.dir")+"\\Midias";
    private String LinkImagenFundo;// = "C:\\a.jpg";
    private Integer tipoSetor;//= 0 ;
    private Integer tipoEquipamento;//= 1;
    private String formatoDataBrasil;// = "dd/MM/yyyy";
    private String formatoDataUSA;//= "yyyy/MM/dd" ;
    private String iconeEquipamentoRed;//= System.getProperty("user.dir") + "\\src\\Icones\\Arvore\\equipamentoRed";
    private String iconeEquipamento;// = System.getProperty("user.dir") + "\\src\\Icones\\Arvore\\equipamento";
    private String iconeSetorRed;// = System.getProperty("user.dir") + "\\src\\Icones\\Arvore\\setorRed";
    private String iconeSetor;// = System.getProperty("user.dir") + "\\src\\Icones\\Arvore\\setor";

    public String getIconeEquipamentoRed() {
        return iconeEquipamentoRed;
    }

    public void setIconeEquipamentoRed(String iconeEquipamentoRed) {
        this.iconeEquipamentoRed = iconeEquipamentoRed;
    }

    public String getIconeEquipamento() {
        return iconeEquipamento;
    }

    public void setIconeEquipamento(String iconeEquipamento) {
        this.iconeEquipamento = iconeEquipamento;
    }

    public String getIconeSetorRed() {
        return iconeSetorRed;
    }

    public void setIconeSetorRed(String iconeSetorRed) {
        this.iconeSetorRed = iconeSetorRed;
    }

    public String getIconeSetor() {
        return iconeSetor;
    }

    public void setIconeSetor(String iconeSetor) {
        this.iconeSetor = iconeSetor;
    }

    public String getFormatoDataBrasil() {
        return formatoDataBrasil;
    }

    public void setFormatoDataBrasil(String formatoDataBrasil) {
        this.formatoDataBrasil = formatoDataBrasil;
    }

    public String getFormatoDataUSA() {
        return formatoDataUSA;
    }

    public void setFormatoDataUSA(String formatoDataUSA) {
        this.formatoDataUSA = formatoDataUSA;
    }

    public int getIdInspNoraml() {
        return idInspNoraml;
    }

    public void setIdInspNoraml(int idInspNoraml) {
        this.idInspNoraml = idInspNoraml;
    }

    public int getIdSemOcorencia() {
        return idSemOcorencia;
    }

    public void setIdSemOcorencia(int idSemOcorencia) {
        this.idSemOcorencia = idSemOcorencia;
    }

    public int getIdManuGeral() {
        return idManuGeral;
    }

    public void setIdManuGeral(int idManuGeral) {
        this.idManuGeral = idManuGeral;
    }

    public String getLinkSalvarMidia() {
        return LinkSalvarMidia;
    }

    public void setLinkSalvarMidia(String LinkSalvarMidia) {
        this.LinkSalvarMidia = LinkSalvarMidia;
    }

    public String getLinkImagenFundo() {
        return LinkImagenFundo;
    }

    public void setLinkImagenFundo(String LinkImagenFundo) {
        this.LinkImagenFundo = LinkImagenFundo;
    }

    public int getTipoSetor() {
        return tipoSetor;
    }

    public void setTipoSetor(int tipoSetor) {
        this.tipoSetor = tipoSetor;
    }

    public int getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(int tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public Color getCorPadrao() {
        return corPadrao;
    }

    public void setCorPadrao(Color corPadrao) {
        this.corPadrao = corPadrao;
    }

    public Color getCorNomeEmpresa() {
        return corNomeEmpresa;
    }

    public void setCorNomeEmpresa(Color corNomeEmpresa) {
        this.corNomeEmpresa = corNomeEmpresa;
    }

    public Color getCorAtencao() {
        return corAtencao;
    }

    public void setCorAtencao(Color corAtencao) {
        this.corAtencao = corAtencao;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getImagenFundo() {
        return LinkImagenFundo;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String formataDataUSA(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat(formatoDataUSA);
        //  DateTimeFormatter format = DateTimeFormatter.ofPattern(formatoDataUSA);
        return formato.format(data);
    }

    public String formataDataBrasil(Date data) {
        SimpleDateFormat formato = new SimpleDateFormat(formatoDataBrasil);
        // DateTimeFormatter format = DateTimeFormatter.ofPattern(formatoDataBrasil);
        return formato.format(data);
    }

}
