package aula210225;

public class Quadrado extends FiguraGeometrica {
    // Atributos
    private double lado;

    // Métodos

    // Método construtor
    public Quadrado(String nome, double lado) {
        this.nome = nome;
        this.lado = lado;
    }

    protected double calcularArea() {
        return lado * lado;
    }
}
