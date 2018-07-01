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
    private List<Equipamentos> equipamento;
    private List<Setor> subSetor;

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

    public List<Equipamentos> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<Equipamentos> equipamento) {
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

}
