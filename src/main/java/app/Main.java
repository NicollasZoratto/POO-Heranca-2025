package app;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main (String[] args) {
        // Tarefa[] tarefas = new Tarefa[5];
        // Compromisso[] compromissos = new Compromisso[5];

        // tarefas[0] = new Tarefa(0, "Teste", false);
        // tarefas[4] = new Tarefa(4, "Novo teste", false);

        // compromissos[2] = new Compromisso(0, "Compromisso", "Hoje", "Amanhã");

        // System.out.println(tarefas[0].getDescricao());
        // System.out.println(tarefas[4].getDescricao());

        PessoaFisica pf = new PessoaFisica(
            "Nicollas", 
            "Tupã", 
            LocalDate.of(2004, Month.JULY, 17),
            "396558698.06");

        PessoaJuridica pj = new PessoaJuridica(
            "Davi",
            "Marília",
            "LOUIS GUSTUVIS VII",
            "97654321345");
        
        

        System.out.println(pf.exibirInformacoes());
        System.out.println(pj.exibirInformacoes());

        Pessoa p1 = pf;
        System.out.println(p1.exibirInformacoes());

        p1 = pj;
        System.out.println(p1.exibirInformacoes());
        
    }
}