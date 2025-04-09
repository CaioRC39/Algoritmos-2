package P1.Exercicio02;
public class ListaCircular {
    // Atributos
    private No inicio;
    
    // Métodos

    // Método construtor
    public ListaCircular() {
        this.inicio = null;
    }

    // Método que insere um jogador no final da lista
    public void inserirNoFim(int id, String nome) {
        No novoNo = new No(new Jogador(id, nome));

        if(this.inicio == null) {
            novoNo.setProximo(novoNo);
            this.inicio = novoNo;
        } else {
            No temporario = this.inicio;

            while(temporario.getProximo() != this.inicio) {
                temporario = temporario.getProximo();
            }
    
            temporario.setProximo(novoNo);
            novoNo.setProximo(this.inicio);
        }
    }

    public void imprimir() {
        if(this.inicio == null) {
            System.out.println("A lista está vazia!");
        } else {
            No temporario = this.inicio;
            
            while(temporario.getProximo() != this.inicio) {
                System.out.println(temporario.getJogador());
                temporario = temporario.getProximo();
            }

            System.out.println(temporario.getJogador());
        }
    }
    
}
