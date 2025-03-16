package aula180225;

public class ContaPoupanca extends ContaBancaria {
    // Atributos
    protected double rendimentoJuros;

    // Métodos

    // Método construtos
    public ContaPoupanca(String nome, double rendimentoJuros) {
        super(nome);
        this.rendimentoJuros = rendimentoJuros;
    }

    // Getters e Setters
    public double getRendimentoJuros() {
        return rendimentoJuros;
    }

    public void setRendimentoJuros(double rendimentoJuros) {
        this.rendimentoJuros = rendimentoJuros;
    }

    public String toString() {
        return "ContaPoupanca [nome=" + nome + ", rendimentoJuros=" + rendimentoJuros + ", saldo=" + saldo + "]";
    }

    public void render() {
        this.saldo *= this.rendimentoJuros;
        System.out.println("Saldo pós rendimento: " + this.saldo);
    }
}
