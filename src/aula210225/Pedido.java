package aula210225;

public abstract class Pedido {
    // Atributos
    protected int numeroPedido;
    protected String endereco;
    protected double preco;
    protected String nomeCliente;

    // Métodos

    // Método construtor
    public Pedido(int numeroPedido, String endereco, double preco, String nomeCliente) {
        this.numeroPedido = numeroPedido;
        this.endereco = endereco;
        this.preco = preco;
        this.nomeCliente = nomeCliente;
    }

    public abstract void processarPedido();

    @Override
    public String toString() {
        return "Pedido [Número do pedido: " + numeroPedido + ", Endereço: " + endereco + ", Preço: " + preco + ", Nome do cliente: "
                + nomeCliente + "]";
    }

    
}
