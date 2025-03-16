package aula140225;

public class Produto {
    // Atributos
    private String nome;
    private int quantidade;
    public static int id = 0;
    
    // Métodos

    // Método construtor
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        id++;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        return "ID: " + id +
                " - Produto: '" + this.nome + 
                "' - Quantidade: " + this.quantidade + " unidades";
    }
}
