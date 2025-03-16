package aula180225;

public class ContaBancaria {
    // Atributos
    protected String nome;
    protected double saldo;
    

    // Métodos

    // Método construtor
    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Conta Bancária [" +
                "Nome: '" + nome +
                "', Saldo: " + saldo + "]";
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("Saque realizado com sucesso.");
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void sacar(double saque) {
        if(this.saldo <= saque || this.saldo <= 0) {
            System.out.println("Saldo indisponível.");
        } else {
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo atual: " + this.saldo);
        }
    }
}
