package model;

import java.time.LocalDateTime;

public class Apresentacao {

    private Projeto projeto;
    private Avaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    //Construtor
    public Apresentacao(Projeto projeto, Avaliavel banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    //Getters
    public Projeto getProjeto() {
        return projeto;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public Avaliavel getBanca() {
        return banca;
    }
    public Sala getLocal() {
        return local;
    }
    //Setters
    public void setBanca(Avaliavel banca) {
        this.banca = banca;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    public void setLocal(Sala local) {
        this.local = local;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // Método para avaliar a apresentação
    public void avaliar() {
        double nota = banca.calcularNotaFinal();
        projeto.setNotaFinal(nota);
    }
}
