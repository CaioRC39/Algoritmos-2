package aula210325;

public class ListaDuplamenteEncadeada {
    // Atributos
    private No inicio;

    // Métodos

    // Método construtor
    public ListaDuplamenteEncadeada() {
        this.inicio = null;
    }

    public void inserirNoInicio(int dado) {
        No novoNo = new No(dado);

        if(this.inicio == null) {
            this.inicio = novoNo;
        } else {
            novoNo.setProximo(this.inicio);
            this.inicio.setAnterior(novoNo);
            this.inicio = novoNo;
        }
    }

    
    public void inserirNoFim(int dado) {
        No novoNo = new No(dado);

        if(this.inicio == null) {
            this.inicio = novoNo;
        } else {
            No temporario = this.inicio;

            while(temporario.getProximo() != null) { // Necessário rodar pela lista
                temporario = temporario.getProximo();
            }

            temporario.setProximo(novoNo);
            novoNo.setAnterior(temporario);
        }
    }

    // Cobre 4 casos principais
    public void excluirNo(int dado) {
        // Caso 1: quando o nó já está vazio
        if(this.inicio == null) {
            System.out.println("A lista está vazia!");
        }

        No temporario = this.inicio;

        // Caso 2.1: quando o dado a ser removido é o primeiro e a lista está vazia
        if(temporario.getDado() == dado) {
            this.inicio = temporario.getProximo();

            if(this.inicio != null) {
                this.inicio.setAnterior(null); // Caso 2.2: quando o dado é o primeiro mas a lista não está vazia
            }
        }

        // Caso 3: quando a lista possui mais de um elemento e o dado está entre eles
        while((temporario != null) && (temporario.getDado() != dado)) {
            temporario = temporario.getProximo();
        }

        // Se o nó for encontrado
        if(temporario != null) { // Caso 4: o dado não está na lista
            if(temporario.getProximo() != null) {
                temporario.getProximo().setAnterior(temporario.getAnterior()); 
            }

            if(temporario.getAnterior() != null) {
                temporario.getAnterior().setProximo(temporario.getProximo());
            }
        }
    }

    public void exibir() {
        if(this.inicio == null) {
            System.out.println("A lista está vazia!");
        }

        No temporario = this.inicio;

        while(temporario != null) {
            System.out.println(temporario.getDado());
            temporario = temporario.getProximo();
        }
    }
}
