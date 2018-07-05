/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Julio Cesar
 */
public class Nota {
  private Usuario user;

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    private int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    private String informacoes;
    private String dateInspecao;
    private String dateOcorencia;
    private String nomeResponsavel;
    private Equipamento equipamento;
    private String UrlImagem;

    
   
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
        this.dateInspecao =formataData(dateInspecao);
    }

    public String getDateOcorencia() {
        return dateOcorencia;
    }

    public void setDateOcorencia(Date dateOcorencia) {
        this.dateOcorencia = formataData(dateOcorencia);
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

    private String formataData(Date data){
         SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            return formato.format(data);
    }
   
    
}
