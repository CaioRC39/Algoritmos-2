package aula210225;

public class Circulo extends FiguraGeometrica {
    // Atributos
    private double raio;

    // Métodos

    // Método construtor
    public Circulo(String nome, double raio) {
        this.nome = nome;
        this.raio = raio;
    }

    protected double calcularArea() {
        return Math.PI * raio * raio;
    }
}
