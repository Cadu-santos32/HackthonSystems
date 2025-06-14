package model;

public class Estudante extends Pessoa {

    private String Matricula;

    //Constructors
    public Estudante(String nome, String cpf, Instituicao instituicao, String matricula) {
        super(nome, cpf, instituicao);
        Matricula = matricula;
    }
    public Estudante() {
    }
    //Getters
    public String getMatricula() {
        return Matricula;
    }
    //Setters
    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
}
