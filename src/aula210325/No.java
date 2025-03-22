package aula210325;

public class No {
    // Atributos
    private int dado;
    private No proximo;
    private No anterior;

    // Métodos

    // Método construtor
    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }

    // Getters e Setters
    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}
