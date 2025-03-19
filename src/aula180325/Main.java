package aula180325;

public class Main {
    public static void main(String[] args) {
        ListaCircular lc = new ListaCircular();

        lc.inserirNoInicio(12);
        lc.inserirNoInicio(42);
        lc.inserirNoFim(64);
        lc.inserirNoFim(7);

        lc.mostrar();

        System.out.println(lc.deletarNo(12));
        System.out.println(lc.deletarNo(14));

        lc.mostrar();
    }
}
