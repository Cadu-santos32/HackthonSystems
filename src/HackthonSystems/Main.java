package HackthonSystems;

import avaliacao.Banca;
import avaliacao.Jurado;
import collection.Apresentacoes;
import collection.Equipes;
import model.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Coleções Singleton
        Equipes equipesRepo = Equipes.getInstancia();
        Apresentacoes apresentacoesRepo = Apresentacoes.getInstancia();


        // ==== Criar 2 Equipes com 5 alunos cada ====
        Equipe equipe1 = new Equipe("Equipe Alpha");
        Equipe equipe2 = new Equipe("Equipe Beta");

        Universidade puc = new Universidade("Puc", "12345678911", 52);
        Profissional orientador = new Profissional("Rafael", "112312234", puc, "Analista");

        Universidade una = new Universidade("Una", "12345678912", 52);
        Profissional orientador2 = new Profissional("Danilo", "112312134", una, "Analista");

        Projeto softwareDeGestao = new Projeto("softwareGestao", orientador, equipe1, 8);
        Projeto softwareDeCrm = new Projeto("SoftwareCrm", orientador2, equipe2, 7);

        Sala sala1 = new Sala(101);
        Sala sala2 = new Sala(102);


        for (int i = 1; i <= 5; i++) {
            equipe1.adicionarEstudante(new Estudante("Carlos", "1435678912", puc, "8778"));
            equipe2.adicionarEstudante(new Estudante("Daniel", "1458796325", puc, "4521"));
        }

        equipesRepo.adicionarEquipe(equipe1);
        equipesRepo.adicionarEquipe(equipe2);

        equipe1.setProjeto(softwareDeGestao);
        equipe2.setProjeto(softwareDeCrm);

        // ==== Criar Bancas com 4 jurados cada ====
        Map<Jurado, Integer> notas1 = new HashMap<>();
        Map<Jurado, Integer> notas2 = new HashMap<>();

        for (int i = 1; i <= 4; i++) {
            notas1.put(new Jurado("JuradoA" + i, "1111111111" + i, puc, "TI", 5), 6 + i);
            notas2.put(new Jurado("JuradoB" + i, "2222222222" + i, una, "Negócios", 4), 5 + i);
        }

        Banca banca1 = new Banca(softwareDeGestao, notas1);
        Banca banca2 = new Banca(softwareDeCrm, notas2);

        LocalDateTime dataHora1 = LocalDateTime.parse("2025-06-14T13:45:00");
        LocalDateTime dataHora2 = LocalDateTime.parse("2025-06-14T13:45:00");

        // ==== Criar Apresentações ====
        Apresentacao apresentacao1 = new Apresentacao(softwareDeGestao, banca1, sala1, dataHora1);
        Apresentacao apresentacao2 = new Apresentacao(softwareDeCrm, banca2, sala2, dataHora2);

        apresentacoesRepo.adicionarApresentacao(apresentacao1);
        apresentacoesRepo.adicionarApresentacao(apresentacao2);

        // ==== Calcular nota final ====
        apresentacao1.avaliar();
        apresentacao2.avaliar();

        // ==== Listar projetos com nota final ≥ 7 ====
        System.out.println("=== Projetos Aprovados (nota >= 7) ===");
        List<Projeto> aprovados = Arrays.asList(softwareDeGestao, softwareDeCrm).stream()
                .filter(p -> p.getNotaFinal() >= 7)
                .collect(Collectors.toList());

        aprovados.forEach(p -> System.out.println(
                "Projeto: " + p.getNome() + ", Nota Final: " + p.getNotaFinal()));
    }
}
