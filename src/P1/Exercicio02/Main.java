package P1.Exercicio02;
public class Main {
    public static void main(String[] args) {
        ListaCircular lc = new ListaCircular();

        lc.imprimir();
        
        lc.inserirNoFim(1, "Caio");
        lc.inserirNoFim(2, "Gabriel");
        lc.inserirNoFim(3, "Guilherme");
        lc.inserirNoFim(4, "Bruno");

        lc.imprimir();
    }
}
