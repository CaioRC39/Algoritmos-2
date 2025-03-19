package aula180325.ex180325;

public class PlaylistCircular {
    // Atributos
    private No inicio, atual;
    private int tamanho = 0;

    // Métodos
    public void adicionarMusica(Musica dado) {
        No novoNo = new No(dado);

        if(this.inicio == null) {
            this.inicio = novoNo;
            this.inicio.setProximoNo(novoNo);
            this.atual = this.inicio;
            this.tamanho++;
        } else {
            No temporario = this.inicio;

            while(temporario.getProximoNo() != this.inicio) {
                temporario = temporario.getProximoNo();
            }

            temporario.setProximoNo(novoNo);
            novoNo.setProximoNo(this.inicio);
            this.atual = this.inicio;
            this.tamanho++;
        }
    }

    public boolean removerMusica(String chave) {
        if(this.inicio == null) {
            this.atual = this.inicio;
            return false;
        }

        if((this.inicio.getDado().getTitulo().equalsIgnoreCase(chave)) && (this.inicio.getProximoNo() == this.inicio)) {
            this.inicio = null;
            this.atual = this.inicio;
            this.tamanho--;
            return true;
        }

        No auxiliar = this.inicio;

        // Se o nó a ser excluído for "início"
        if(this.inicio.getDado().getTitulo().equalsIgnoreCase(chave)) {
            while(auxiliar.getProximoNo() != this.inicio) {
                auxiliar = auxiliar.getProximoNo();
            }

            auxiliar.setProximoNo(this.inicio.getProximoNo());
            this.inicio = auxiliar.getProximoNo();
            this.tamanho--;
            return true;

        } else {
            No d = null;

            while((auxiliar.getProximoNo() != this.inicio) && (!auxiliar.getProximoNo().getDado().getTitulo().equalsIgnoreCase(chave))) {
                auxiliar = auxiliar.getProximoNo();
            }

            if(auxiliar.getProximoNo().getDado().getTitulo().equalsIgnoreCase(chave)) {
                d = auxiliar.getProximoNo();
                auxiliar.setProximoNo(d.getProximoNo());
                this.tamanho--;
                return true;
            }
        }

        return false;
    }

    public void exibirPlaylist() {
        if(this.inicio == null) {
            System.out.println("Lista vazia!");
        }

        No temporario = this.inicio;

        do {
            System.out.println(temporario.getDado());
            temporario = temporario.getProximoNo();
        } while(temporario != this.inicio);
    }

    public Musica pularProxima() {
        if(this.inicio != null) {
            this.atual = this.inicio.getProximoNo();
            return this.inicio.getProximoNo().getDado();
        }
        return null;
    }

    public No buscarMusica(String titulo) {
        if (this.inicio == null) {
            return null;
        }
    
        if (this.inicio.getDado().getTitulo().equalsIgnoreCase(titulo)) {
            return this.inicio;
        }
    
        No auxiliar = this.inicio;
    
        while (auxiliar.getProximoNo() != this.inicio) {
            if (auxiliar.getProximoNo().getDado().getTitulo().equalsIgnoreCase(titulo)) {
                return auxiliar.getProximoNo();
            }
            auxiliar = auxiliar.getProximoNo();
        }
    
        return null;
    }
    

    public int getTamanhoPlaylist() {
        return tamanho;
    }

    public Musica getMusicaAtual() {
        if (this.atual != null) {
            return this.atual.getDado();
        }
        return null;
    }
}
