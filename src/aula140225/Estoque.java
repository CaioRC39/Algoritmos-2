package aula140225;

import java.util.ArrayList;

public class Estoque {
    // Atributos
    private ArrayList<Produto> produtos = new ArrayList<>();

    // Métodos

    // Método construtor
    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionar(Produto p) {
        System.out.println("Produto adicionado com sucesso!");
        produtos.add(p);
    }

    public void remover(Produto p) {
        System.out.println("Produto removido com sucesso!");
        produtos.remove(p);
    }

    public void listar() {
        for(Produto p : produtos) {
            System.out.println(p.toString());
        }
    }

    public Produto buscar(String nome) {
        for(Produto p : produtos) {
            if(p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }

        return null;
    }
}
