package aula180225;

public class Gerente extends Funcionario {
    // Atributos
    private int quantidadeFuncionarios;

    // Métodos

    // Método construtor
    public Gerente(String nome, double salario, int quantidadeFuncionarios) {
        super(nome, salario);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    // Getters e Setters
    
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public String toString() {
        return super.toString() + "\nQuantidade de funcionários: " + quantidadeFuncionarios;
    }

    @Override
    public void aumentarSalario() {
        System.out.println("Aumentar salário do gerente: ");
        this.salario *= 1.2;
    }
}
