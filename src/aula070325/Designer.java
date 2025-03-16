package aula070325;

public class Designer extends Freelancer implements Pagavel{
    // Método construtor
    public Designer(String nome) {
        super(nome, "Design", 65);
    }

    @Override
    public void realizarServico() {
        System.out.println(this.getNome() + " está fazendo design...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nPagamento: " + this.calcularPagamento();
    }
}
