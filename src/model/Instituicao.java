package model;

public abstract class Instituicao {

    private String nome;
    private String cnpj;

    //Constructors
    public Instituicao() {}
    public Instituicao(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    //Getters
    public String getNome() {
        return nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CNPJ: " + cnpj;
    }
}
