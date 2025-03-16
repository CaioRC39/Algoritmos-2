package aula070325;

import java.util.ArrayList;

public class GerenciamentoFreelancer {
    // Atributos
    private ArrayList<Freelancer> freelancers;

    // Métodos

    // Método construtor
    public GerenciamentoFreelancer() {
        this.freelancers = new ArrayList<>();
    }

    public void adicionarFreelancer(Freelancer freelancer) {
        this.freelancers.add(freelancer);
        System.out.println(freelancer.getNome() + " foi adicionado com sucesso.");
    }

    public void listarFreelancers() {
        System.out.println("Listando todos os freelancers: ");
        for(Freelancer f : freelancers) {
            System.out.println("\n");
            System.out.println(f);
        }
    }
}
