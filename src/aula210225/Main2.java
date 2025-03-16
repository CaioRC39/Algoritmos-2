package aula210225;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        PedidoComida pc = new PedidoComida(1, "Rua X", 10, "Caio", "Dogão");
        PedidoPacote pp = new PedidoPacote(2, "Rua Y", 20000, "André", "Computador", 10);

        pedidos.add(pc);
        pedidos.add(pp);

        for(Pedido p : pedidos) {
            if(p instanceof PedidoComida) {
                System.out.println("Sua comida... " + ((PedidoComida) p).toString());
            }
            if(p instanceof PedidoPacote) {
                System.out.println("Seu pacote... " + ((PedidoPacote) p).toString());
            }
        }
    }
}
