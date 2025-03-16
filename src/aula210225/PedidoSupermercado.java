package aula210225;

public class PedidoSupermercado extends Pedido {
    // Atributos
    private String produto;

    // Métodos

    // Método construtor
    public PedidoSupermercado(int numeroPedido, String endereco, double preco, String nomeCliente, String produto) {
        super(numeroPedido, endereco, preco, nomeCliente);
        this.produto = produto;
    }

    @Override
    public void processarPedido() {
        System.out.println("O seu produto está sendo separado.");
    }

    @Override
    public String toString() {
        return "Pedido de supermercado [Número do pedido: " + numeroPedido + ", Produto: '" + produto + "', Endereço: '" + endereco
                + "', Preço: " + preco + ", Nome do cliente: '" + nomeCliente + "']";
    }

    
}
