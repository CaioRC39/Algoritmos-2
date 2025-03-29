package aula210325.ex210325;

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

        System.out.println("O elemento a ser excluído não existe!");
    }

    public void mostrar() {
        if(this.inicio == null) {
            System.out.println("A lista está vazia!");
        }

        No temporario = this.inicio;

        while(temporario != null) {
            System.out.println(temporario.getDado());
            temporario = temporario.getProximo();
        }
    }

    public int tamanho() {
        if(this.inicio == null) {
            System.out.println("A lista está vazia!");
        }

        No temporario = this.inicio;
        int contador = 0;

        while(temporario != null) {
            contador++;
            temporario = temporario.getProximo();
        }

        return contador;
    }

    public void mostrarInvertido() {
        if(this.inicio == null) {
            System.out.println("A lista está vazia!");
        }

        No temporario = this.inicio;

        while(temporario.getProximo() != null) {
            temporario = temporario.getProximo();
        }

        while(temporario != null) {
            System.out.println(temporario.getDado());
            temporario = temporario.getAnterior();
        }
    }

    public void inverter() {
        if(this.inicio == null) {
            System.out.println("A lista está vazia!");
        }
        
        No atual = this.inicio;
        No novoInicio = null;

        while(atual != null) {
            No temporario = atual.getProximo();

            temporario = atual.getProximo();

            atual.setProximo(atual.getAnterior());

            atual.setAnterior(temporario);

            novoInicio = atual;

            atual = temporario;
        }

        this.inicio = novoInicio;
         
    }

    public int maximo() {
        if(this.inicio == null) {
            return -1;
        }

        No temporario = this.inicio;
        int maior = Integer.MIN_VALUE;

        while(temporario != null) {
            if(temporario.getDado() > maior) {
                maior = temporario.getDado();
            }

            temporario = temporario.getProximo();
        }

        return maior;

    }

    public int minimo() {
        if(this.inicio == null) {
            return -1;
        }

        No temporario = this.inicio;
        int menor = Integer.MAX_VALUE;

        while(temporario != null) {
            if(temporario.getDado() < menor) {
                menor = temporario.getDado();
            }

            temporario = temporario.getProximo();
        }

        return menor;

    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
}
