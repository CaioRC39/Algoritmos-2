package aula180325;

public class No {
    // Atributos
    private int dado;
    private No proximoNo;

    // Métodos

    // Método construtor
    public No(int dado) {
        this.dado = dado;
        this.proximoNo = null;
    }

    // Getters e Setters
    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
}
