package aula180225;

public class Funcionario {
    // Atributos
    private String nome;
    protected double salario;
    
    // Métodos
    
    // Método construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Nome: '" + nome + "'\nSalário: " + salario;
    }

    public void aumentarSalario() {
        System.out.println("Aumentar salário do funcionário: ");
        this.salario += 1000;
    }
}
