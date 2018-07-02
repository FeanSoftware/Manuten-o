/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julio Cesar
 */
public class Nota {
    private String informacoes;
    private Date dateInspecao;
    private Date dateOcorencia;
    private String nomeResponsavel;
    private String nomeResponsavelManutençao;
    private Equipamento equipamento;
    private String UrlImagem;
    
   
    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public Date getDateInspecao() {
        return dateInspecao;
    }

    public void setDateInspecao(Date dateInspecao) {
        this.dateInspecao =dateInspecao;
    }

    public Date getDateOcorencia() {
        return dateOcorencia;
    }

    public void setDateOcorencia(Date dateOcorencia) {
        this.dateOcorencia = dateOcorencia;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNomeResponsavelManutençao() {
        return nomeResponsavelManutençao;
    }

    public void setNomeResponsavelManutençao(String nomeResponsavelManutençao) {
        this.nomeResponsavelManutençao = nomeResponsavelManutençao;
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
