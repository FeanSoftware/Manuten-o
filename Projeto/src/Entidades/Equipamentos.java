/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Julio Cesar
 */
public class Equipamentos {

    private int id;
    private String nome;
    private String dataUltimaExpesao;
    private Color cor;

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataUltimaExpesao() {
        return dataUltimaExpesao;
    }

    public void setDataUltimaExpesao(String dataUltimaExpesao) {

          LocalDate hoje = LocalDate.now();
        // Cria um Objeto LocalDate com a data 26/09/2020.
     //   System.out.println(nome+dataUltimaExpesao);
        String p = dataUltimaExpesao.replace("/","-");
      String[] s = p.split("-");
       // System.out.println(s[0] );
      //  System.out.println(s[1] );
      //  System.out.println(s[2] );
      
      LocalDate outraData = LocalDate.of(Integer.parseInt(s[0]),Integer.parseInt( s[1]),Integer.parseInt( s[2]));  
        // Calcula a diferença de dias entre as duas datas
        long diferencaEmDias = ChronoUnit.DAYS.between(outraData, hoje);   
      //  System.out.println(diferencaEmDias);
        if (diferencaEmDias  > 18) {
            cor = Internacionalização.getCorAtencao();
            System.out.println(diferencaEmDias);
        } else {
            cor = Internacionalização.getCorPadrao();
        }
        this.dataUltimaExpesao = dataUltimaExpesao;
    }

}
