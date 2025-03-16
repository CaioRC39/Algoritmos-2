package aula140225;

public class Main {
    public static void main(String[] args) {
        // Criando os produtos
        Produto p1 = new Produto("Achocolatado", 10);
        Produto p2 = new Produto("Arroz", 30);
        Produto p3 = new Produto("Frango", 17);
        Produto p4 = new Produto("Molho de tomate", 12);

        // Criando o estoque
        Estoque e = new Estoque();

        // Adicionando produtos no estoque
        e.adicionar(p1);
        e.adicionar(p2);
        e.adicionar(p3);
        e.adicionar(p4);

        // Listando os produtos
        e.listar();

        // Removendo um produto
        e.remover(p2);

        // Buscando um produto
        Produto encontrado = e.buscar("Arroz");

        if(encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Produto não encontrado!");
        }

        // Buscando outro produto
        Produto encontrado1 = e.buscar("Frango");

        if(encontrado != null) {
            System.out.println(encontrado1);
        } else {
            System.out.println("Produto não encontrado!");
        }

    }
}
