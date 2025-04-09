package P1.Exercicio02;
public class No {
    private Jogador jogador;
    private No proximo;

    public No(Jogador jogador) {
        this.jogador = jogador;
        this.proximo = null;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}