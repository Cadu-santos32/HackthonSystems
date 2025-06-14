package model;

public class Projeto {
    private String nome;
    private Profissional orientador;
    private Equipe equipe;
    private double notaFinal;

    //Constructor
    public Projeto(){}
    public Projeto(String nome, Profissional orientador, Equipe equipe, int notaFinal) {
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = notaFinal;
        this.nome = nome;
    }
    //Getters
    public Profissional getOrientador() {
        return orientador;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    public String getNome() {
        return nome;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    //Setters
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public void setOrientador(Profissional orientador) {
        this.orientador = orientador;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
