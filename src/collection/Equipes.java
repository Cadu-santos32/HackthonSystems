package collection;

import model.Equipe;

import java.util.ArrayList;
import java.util.List;

public class Equipes {

    private static Equipes instancia;

    private List<Equipe> equipes;

    private Equipes() {
        equipes = new ArrayList<>();
    }

    public static Equipes getInstancia() {
        if (instancia == null) {
            instancia = new Equipes();
        }
        return instancia;
    }

    // TODO METODO PARA INCLUIR NA EQUIPE
    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    // TODO METODO PARA PESQUISAR NA LISTA
    public Equipe buscarPorNome(String nome) {
        for (Equipe e : equipes) {
            if (e.getNome().equalsIgnoreCase(nome)) {
                return e;
            }
        }
        return null;
    }

    // Retornar todas as equipes
    public List<Equipe> getTodas() {
        return equipes;
    }
}
