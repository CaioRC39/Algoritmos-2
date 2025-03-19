package aula180325;

public class ListaCircular {
    // Atributos
    private No inicio;

    // Métodos
    public void inserirNoInicio(int dado) {
        No novoNo = new No(dado);
        
        if(this.inicio == null) {
            this.inicio = novoNo;
            this.inicio.setProximoNo(novoNo);
        } else {
            No temporario = this.inicio;

            while(temporario.getProximoNo() != this.inicio) {
                temporario = temporario.getProximoNo();
            }

            novoNo.setProximoNo(this.inicio);
            temporario.setProximoNo(novoNo);
            this.inicio = novoNo;
        }
    }

    public void inserirNoFim(int dado) {
        No novoNo = new No(dado);

        if(this.inicio == null) {
            this.inicio = novoNo;
            this.inicio.setProximoNo(novoNo);
        } else {
            No temporario = this.inicio;

            while(temporario.getProximoNo() != this.inicio) {
                temporario = temporario.getProximoNo();
            }

            temporario.setProximoNo(novoNo);
            novoNo.setProximoNo(this.inicio);
        }
    }

    public boolean deletarNo(int chave) {
        if(this.inicio == null) {
            return false;
        }

        if((this.inicio.getDado() == chave) && (this.inicio.getProximoNo() == this.inicio)) {
            this.inicio = null;
            return true;
        }

        No auxiliar = this.inicio;

        // Se o nó a ser excluído for "início"
        if(this.inicio.getDado() == chave) {
            while(auxiliar.getProximoNo() != this.inicio) {
                auxiliar = auxiliar.getProximoNo();
            }

            auxiliar.setProximoNo(this.inicio.getProximoNo());
            this.inicio = auxiliar.getProximoNo();
            return true;

        } else {
            No d = null;

            while((auxiliar.getProximoNo() != this.inicio) && (auxiliar.getProximoNo().getDado() != chave)) {
                auxiliar = auxiliar.getProximoNo();
            }

            if(auxiliar.getProximoNo().getDado() == chave) {
                d = auxiliar.getProximoNo();
                auxiliar.setProximoNo(d.getProximoNo());
                return true;
            }
        }

        return false;
    }

    public void mostrar() {
        if(this.inicio == null) {
            System.out.println("Lista vazia!");
        }

        No temporario = this.inicio;

        do {
            System.out.println(temporario.getDado());
            temporario = temporario.getProximoNo();
        } while(temporario != this.inicio);
    }
}
