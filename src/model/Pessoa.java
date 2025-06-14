package model;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private Instituicao instituicao;

    //Constructors
    public Pessoa(String nome, String cpf,  Instituicao instituicao) {
        this.nome = nome;
        this.cpf = cpf;
        this.instituicao = instituicao;
    }

    public Pessoa() {
    }
    //Getters
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
