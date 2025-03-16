package aula070325;

public class Programador extends Freelancer implements Pagavel {
    // Método construtor
    public Programador(String nome) {
        super(nome, "Programar", 80);
    }

    @Override
    public void realizarServico() {
        System.out.println(this.getNome() + " está programando...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nPagamento: " + this.calcularPagamento();
    }

}
