package aula060525.ex060525;

import java.util.ArrayList;

public class EncadeamentoSeparado {
    // Atributos
    private final int capacidade;
    private ArrayList<EntradaChaveValor>[] tabela;

    // Métodos

    // Método construtor
    public EncadeamentoSeparado(int capacidade) {
        this.capacidade = capacidade;
        tabela = new ArrayList[capacidade];

        for(int i = 0; i < capacidade; i++) {
            tabela[i] = new ArrayList<>();
        }
    }

    private int funcaoHash(int chave) {
        return Math.abs(chave) % capacidade;
    }

    public void adicionar(int chave, String valor) {
        int indice = funcaoHash(chave);
        ArrayList<EntradaChaveValor> lista = tabela[indice];

        for(EntradaChaveValor entrada : lista) {
            if(entrada.getChave() == chave) {
                entrada.setValor(valor);
            }
        }

        lista.add(new EntradaChaveValor(chave, valor));

    }

    public String buscar(int chave) {
        int indice = funcaoHash(chave);
        ArrayList<EntradaChaveValor> lista = tabela[indice];

        for(EntradaChaveValor entrada : lista) {
            if(entrada.getChave() == chave) {
                return entrada.getValor();
            }
        }

        return null;
    }

    public boolean remover(int chave) {
        int indice = funcaoHash(chave);
        ArrayList<EntradaChaveValor> lista = tabela[indice];
        EntradaChaveValor removerEntrada = null;

        for(EntradaChaveValor entrada : lista) {
            if(entrada.getChave() == chave) {
                removerEntrada = entrada;
                break;
            }
        }

        if(removerEntrada != null) {
            lista.remove(removerEntrada);
            return true;
        }

        return false;
    }

    public void exibir() {
        for(int i = 0; i < capacidade; i++) {
            System.out.println("Índice " + i + ": ");
            ArrayList<EntradaChaveValor> lista = tabela[i];

            if(lista.isEmpty()) {
                System.out.println("[]");
            } else {
                for(EntradaChaveValor entrada : lista) {
                    System.out.println(entrada.toString());
                }
            }
        }
    }
}
