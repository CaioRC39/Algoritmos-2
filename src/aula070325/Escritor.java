package aula070325;

public class Escritor extends Freelancer implements Pagavel {
    // Método construtor
    public Escritor(String nome) {
        super(nome, "Escrever", 60);
    }

    @Override
    public void realizarServico() {
        System.out.println(this.getNome() + " está escrevendo...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nPagamento: " + this.calcularPagamento();
    }

}
