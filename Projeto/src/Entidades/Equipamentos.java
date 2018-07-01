/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        
        try {
            data1.setTime(sdf.parse(dataUltimaExpesao));
           // System.out.println(sdf.parse(dataUltimaExpesao));
            data2.setTime(sdf.parse(sdf.format(new Date())));
        } catch (java.text.ParseException e) {
        }
        int dias = data1.get(Calendar.DAY_OF_YEAR) - data2.get(Calendar.DAY_OF_YEAR);
        
        System.out.println("Entidades.Equipamentos.setDataUltimaExpesao()"+dias);
        if (dias > 0) {
            cor = Color.RED;
          // System.out.println(String.valueOf(dias));
        } else {
            cor = Color.BLACK;
        }
        this.dataUltimaExpesao = dataUltimaExpesao;
    }

}
