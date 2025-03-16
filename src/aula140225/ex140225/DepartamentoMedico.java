package aula140225.ex140225;
import java.util.ArrayList;

public class DepartamentoMedico {
    // Atributos
    private String nomeDepartamento;
    private ArrayList<Medico> medicos = new ArrayList<>();

    // Métodos

    // Método construtor
    public DepartamentoMedico(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public void adicionar(Medico medico) {
        medicos.add(medico);
    }

    public void remover(Medico medico) {
        medicos.remove(medico);
    }

    public void detalhes() {
        System.out.println("Departamento: " + this.nomeDepartamento);
        for(Medico m : medicos) {
            System.out.println(m);
        }
    }

   

    
}
