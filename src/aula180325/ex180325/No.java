package aula180325.ex180325;

public class No {
    // Atributos
    private Musica dado;
    private No proximoNo;

    // Métodos

    // Método construtor
    public No(Musica dado) {
        this.dado = dado;
        this.proximoNo = null;
    }

    // Getters e Setters
    public Musica getDado() {
        return dado;
    }

    public void setDado(Musica dado) {
        this.dado = dado;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
}
