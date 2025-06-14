package collection;

import model.Apresentacao;
import model.Projeto;

import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {

    // Singleton
    private static Apresentacoes instancia;

    private List<Apresentacao> lista;

    private Apresentacoes() {
        lista = new ArrayList<>();
    }

    public static Apresentacoes getInstancia() {
        if (instancia == null) {
            instancia = new Apresentacoes();
        }
        return instancia;
    }

    // Método para adicionar uma apresentação
    public void adicionarApresentacao(Apresentacao apresentacao) {
        lista.add(apresentacao);
    }

    // Buscar apresentação por projeto
    public Apresentacao buscarPorProjeto(Projeto projeto) {
        for (Apresentacao ap : lista) {
            if (ap.getProjeto().equals(projeto)) {
                return ap;
            }
        }
        return null;
    }

    // Retornar todas as apresentações
    public List<Apresentacao> getTodas() {
        return lista;
    }
}
