package aula180225;

public class Main2 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Pedro", 10);

        ContaPoupanca cp = new ContaPoupanca("Maria", 300);

        System.out.println(cc);

        System.out.println(cp);

        cp.depositar(1000);
        cc.sacar(0);
    }
}
