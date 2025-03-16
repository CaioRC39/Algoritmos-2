package aula210225;

public class Main1 {
    public static void main(String[] args) {
        Circulo c = new Circulo("Círculo", 5.2);
        Triangulo t = new Triangulo("Triângulo", 3.9, 7.2);
        Quadrado q = new Quadrado("Quadrado", 4.8);

        System.out.println("Área do círculo: " + c.calcularArea());
        System.out.println("Área do triângulo: " + t.calcularArea());
        System.out.println("Área do quadrado: " + q.calcularArea());
    }
}
