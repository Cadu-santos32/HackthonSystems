package model;

public class Profissional extends Pessoa{

    private String profissao;

    //Constructors
    public Profissional(String nome, String cpf, Instituicao instituicao, String profissao) {
        super(nome, cpf, instituicao);
        this.profissao = profissao;
    }

    public Profissional() {}
    //Getters
    public String getProfissao() {
        return profissao;
    }
    //Setters
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
