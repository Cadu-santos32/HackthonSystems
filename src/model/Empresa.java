package model;

public class Empresa extends Instituicao{

    private String NomeFantasia;
    //Constructors
    public Empresa(String NomeFantasia, String nome, String cnpj) {
        super(nome, cnpj);
        this.NomeFantasia = NomeFantasia;
    }
    //Getters
    public String getNomeFantasia() {
        return NomeFantasia;
    }
    //Setters
    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    @Override
    public String toString() {
        return "Empresa{" + "NomeFantasia=" + NomeFantasia + super.toString() + '}';
    }

}
