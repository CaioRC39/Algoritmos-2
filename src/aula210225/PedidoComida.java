package aula210225;

public class PedidoComida extends Pedido {
    // Atributos
    private String nomeComida;

    // Métodos

    // Método construtor
    public PedidoComida(int numeroPedido, String endereco, double preco, String nomeCliente, String nomeComida) {
        super(numeroPedido, endereco, preco, nomeCliente);
        this.nomeComida = nomeComida;
    }

    @Override
    public void processarPedido() {
        System.out.println("Sua comida está sendo preparada.");
    }

    @Override
    public String toString() {
        return "Pedido de comida [Número do pedido: " + numeroPedido + ", Nome da comida: '" + nomeComida + "', Endereço: '" + endereco
                + "', Preço: " + preco + ", Nome do cliente: '" + nomeCliente + "']";
    }

    
    
}
