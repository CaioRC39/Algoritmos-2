package aula070325;

public class Main {
    public static void main(String[] args) {
        Programador p = new Programador("Paulo");
        p.setHorasTrabalhadas(40);
        
        Escritor e = new Escritor("Eduardo");
        e.setHorasTrabalhadas(60);

        Designer d = new Designer("Daniela");
        d.setHorasTrabalhadas(100);

        Freelancer f = new Designer("Fernanda");
        f.setHorasTrabalhadas(-20);

        GerenciamentoFreelancer gf = new GerenciamentoFreelancer();
        gf.adicionarFreelancer(p);
        gf.adicionarFreelancer(e);
        gf.adicionarFreelancer(d);
        gf.adicionarFreelancer(f);

        gf.listarFreelancers();

        try {
            f.pagarFreelancer();
        } catch (PagamentoInvalidoException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
