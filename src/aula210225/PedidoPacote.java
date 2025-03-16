package aula210225;

public class PedidoPacote extends Pedido {
    // Atributos
    private String pacote;
    private double peso;

    // Métodos

    // Método construtor
    public PedidoPacote(int numeroPedido, String endereco, double preco, String nomeCliente, String pacote,
            double peso) {
        super(numeroPedido, endereco, preco, nomeCliente);
        this.pacote = pacote;
        this.peso = peso;
    }

    @Override
    public void processarPedido() {
        System.out.println("Seu pacote está sendo enviado.");
    }

    @Override
    public String toString() {
        return "Pedido de pacote [Pacote: '" + pacote + "', Número do pedido: " + numeroPedido + ", Peso: " + peso + ", Endereço: '"
                + endereco + "', Preço: " + preco + ", Nome do cliente: '" + nomeCliente + "']";
    }

    
}
