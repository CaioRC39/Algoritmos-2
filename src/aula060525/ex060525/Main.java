package aula060525.ex060525;

public class Main {
    public static void main(String[] args) {
        EnderecamentoAberto ea = new EnderecamentoAberto(5);
        EncadeamentoSeparado es = new EncadeamentoSeparado(5);

        System.out.println("Endereçamento Aberto");
        System.out.println("\nAdicionando pares chaves-valores...");
        ea.adicionar(4, "A");
        ea.adicionar(60, "B");
        ea.adicionar(47, "C");
        ea.adicionar(58, "D");
        ea.adicionar(89, "E");

        System.out.println("\nBuscando uma chave existente: ");
        System.out.println(ea.buscar(60));
        System.out.println("Buscando uma chave inexistente: ");
        System.out.println(ea.buscar(10));

        System.out.println("\nRemovendo uma chave existente: ");
        System.out.println(ea.remover(58));
        System.out.println("Removendo uma chave inexistente: ");
        System.out.println(ea.remover(10));

        System.out.println("\nBuscando uma chave existente: ");
        System.out.println(ea.buscar(4));
        System.out.println("Buscando uma chave inexistente: ");
        System.out.println(ea.buscar(10));

        System.out.println("\nExibindo: ");
        ea.exibir();

        System.out.println("\n\nEncadeamento Separado");
        System.out.println("\nAdicionando pares chaves-valores...");
        es.adicionar(5, "A");
        es.adicionar(62, "B");
        es.adicionar(43, "C");
        es.adicionar(51, "D");
        es.adicionar(90, "E");

        System.out.println("\nBuscando uma chave existente: ");
        System.out.println(es.buscar(62));
        System.out.println("Buscando uma chave inexistente: ");
        System.out.println(es.buscar(10));

        System.out.println("\nRemovendo uma chave existente: ");
        System.out.println(es.remover(51));
        System.out.println("Removendo uma chave inexistente: ");
        System.out.println(es.remover(10));

        System.out.println("\nBuscando uma chave existente: ");
        System.out.println(es.buscar(5));
        System.out.println("Buscando uma chave inexistente: ");
        System.out.println(es.buscar(10));

        System.out.println("\nExibindo: ");
        es.exibir();
    }
}
