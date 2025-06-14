package model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    List<Estudante> estudantes = new ArrayList<Estudante>();
    private String nome;
    private Projeto projeto;

    //Constructors
    public Equipe() {}


    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipe(String nome){
        this.nome = nome;
    }

    public Equipe(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public void adicionarEstudante(Estudante estudante){
        estudantes.add(estudante);
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }
    //Setters
    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
