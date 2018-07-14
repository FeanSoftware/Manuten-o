/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Julio Cesar
 */
public class Nota {

    private Usuario user;
    private int tipo;
    private String informacoes;
    private String dateInspecao;
    private String dateOcorencia;
    private String nomeResponsavel;
    private Equipamento equipamento;
    private String UrlImagem;

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public String getDateInspecao() {
        return dateInspecao;
    }

    public void setDateInspecao(Date dateInspecao) {
        this.dateInspecao = Internacionalização.formataDataUSA(dateInspecao);
    }

    public String getDateOcorencia() {
        return dateOcorencia;
    }

    public void setDateOcorencia(Date dateOcorencia) {
        this.dateOcorencia = Internacionalização.formataDataUSA(dateOcorencia);
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getUrlImagem() {
        return UrlImagem;
    }

    public void setUrlImagem(String UrlImagem) {
        this.UrlImagem = UrlImagem;
    }

    

}
