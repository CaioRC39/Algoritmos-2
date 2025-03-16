package aula210225;

public class Triangulo extends FiguraGeometrica {
    // Atributos
    private double base, altura;

    // Métodos

    // Método construtor
    public Triangulo(String nome, double base, double altura) {
        this.nome = nome;
        this.base = base;
        this.altura = altura;
    }

    protected double calcularArea() {
        return (base * altura) / 2;
    }
}
