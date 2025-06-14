package avaliacao;

import model.Avaliavel;
import model.Projeto;
import avaliacao.Jurado;
import java.util.Map;

public class Banca implements Avaliavel {

    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados; // jurado → nota

    public Banca(Projeto projetoAvaliado, Map<Jurado, Integer> jurados) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = jurados;
    }

    @Override
    public double calcularNotaFinal() {
        if (jurados == null || jurados.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Integer nota : jurados.values()) {
            soma += nota;
        }
        return soma / jurados.size();
    }

    // Getters
    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }
}
