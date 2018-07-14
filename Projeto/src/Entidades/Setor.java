package Entidades;

import java.awt.Color;
import java.util.List;

/**
 *
 * @author Julio Cesar
 */
public class Setor {

    private int id;
    private String Nome;
    private Color cor;
    private List<Equipamento> equipamento;
    private List<Setor> subSetor;
    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

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
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<Equipamento> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<Equipamento> equipamento) {
        this.equipamento = equipamento;

    }

    public List<Setor> getSubSetor() {
        return subSetor;
    }

    public void setSubSetor(List<Setor> subSetor) {

        this.subSetor = subSetor;

    }

    public void addSubsetor(Setor subSetor) {
        this.subSetor.add(subSetor);

    }

    @Override
    public String toString() {
        return Nome;
    }

}
