package avaliacao;

import model.Instituicao;
import model.Profissional;

public class Jurado extends Profissional {

    private int tempoExperiencia;

    //Constructors
    public Jurado() {
    }

    public Jurado(String nome, String cpf, Instituicao instituicao, String profissao, int tempoExperiencia) {
        super(nome, cpf, instituicao, profissao);
        this.tempoExperiencia = tempoExperiencia;
    }
    //Getters
    public int getTempoExperiencia() {
        return tempoExperiencia;
    }
    //Setters
    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }
}
