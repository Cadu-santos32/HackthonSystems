package model;

import java.util.ArrayList;
import java.util.List;

public class Universidade extends Instituicao{

    private int QtdAlunos;

    //Constructors
    public Universidade() {
    }

    public Universidade(String nome, String cnpj, int qtdAlunos) {
        super(nome, cnpj);
        QtdAlunos = qtdAlunos;
    }

    //Getters
    public int getQtdAlunos() {
        return QtdAlunos;
    }
    //Setters
    public void setQtdAlunos(int qtdAlunos) {
        QtdAlunos = qtdAlunos;
    }
}
