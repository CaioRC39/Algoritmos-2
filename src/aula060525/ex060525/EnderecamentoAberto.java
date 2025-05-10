package aula060525.ex060525;

public class EnderecamentoAberto {
    // Atributos
    private final int capacidade;
    private EntradaChaveValor[] tabela;
    private EntradaChaveValor DELETADO = new EntradaChaveValor(-1, "");

    public EnderecamentoAberto(int capacidade) {
        this.capacidade = capacidade;
        tabela = new EntradaChaveValor[capacidade];
    }

    private int funcaoHash(int chave) {
        return Math.abs(chave) % capacidade;
    }

    public void adicionar(int chave, String valor) {
        int indice = funcaoHash(chave);
        int indiceOriginal = indice;
        int i = 0;

        while((tabela[indice] != null) &&
                (tabela[indice] != DELETADO) &&
                (tabela[indice].getChave() != chave)) {
            i++;
            indice = (indiceOriginal + i) % capacidade;
        }

        if((tabela[indice] != null) && (tabela[indice].getChave() == chave)) {
            tabela[indice].setValor(valor);
        } else {
            tabela[indice] = new EntradaChaveValor(chave, valor);
        }
    }

    public String buscar(int chave) {
        int indice = funcaoHash(chave);
        int indiceOriginal = indice;
        int i = 0;

        while((tabela[indice] != null && i < capacidade)) {
            if((tabela[indice] != DELETADO) &&
            (tabela[indice].getChave() == chave)) {
                return tabela[indice].getValor();
            }

            i++;
            indice = (indiceOriginal + i) % capacidade;
        }
            
        return null;
        
    }

    public boolean remover(int chave) {
        int indice = funcaoHash(chave);
        int indiceOriginal = indice;
        int i = 0;

        while((tabela[indice] != null & i < capacidade)) {
            if((tabela[indice] != DELETADO) &&
            (tabela[indice].getChave() == chave)) {
                tabela[indice] = DELETADO;
                return true;
            }

            i++;
            indice = (indiceOriginal + i) % capacidade;
        }

    return false;

    }

    public void exibir() {
        for(int i = 0; i < capacidade; i++) {
            if((tabela[i] == null) || (tabela[i] == DELETADO)) {
                System.out.println("Índice " + i + ": vazio");
            } else {
                System.out.println("Índice " + i + ": " + tabela[i]);
            }
        }
    }

}
