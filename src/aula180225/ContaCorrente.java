package aula180225;

public class ContaCorrente extends ContaBancaria {
    // Atributos
    protected double taxaDeManutencao;

    // Métodos

    // Método construtor
    public ContaCorrente(String nome, double taxaDeManutencao) {
        super(nome);
        this.taxaDeManutencao = taxaDeManutencao;
    }

    // Getter e Setters
    public double getTaxaDeManutencao() {
        return taxaDeManutencao;
    }

    public void setTaxaDeManutencao(double taxaDeManutencao) {
        this.taxaDeManutencao = taxaDeManutencao;
    }

    public String toString() {
        return "ContaCorrente [nome=" + nome + ", taxaDeManutencao=" + taxaDeManutencao + ", saldo=" + saldo + "]";
    }

    public void aplicarTaxaManutencao() {
        if(this.saldo <= this.taxaDeManutencao) {
            System.out.println("Saldo indisponível.");
        } else {
            this.saldo -= this.taxaDeManutencao;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo atual: " + this.saldo);
        }
    }
}
