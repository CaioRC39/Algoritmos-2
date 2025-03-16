package aula180225;

public class Main1 {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Davi", 100);
        Gerente g = new Gerente("Luzimar", 10000, 6);

        System.out.println(f);

        System.out.println(g);

        f.aumentarSalario();
        System.out.println(f);

        g.aumentarSalario();
        System.out.println(g);
    }
}
