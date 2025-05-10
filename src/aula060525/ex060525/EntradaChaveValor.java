package aula060525.ex060525;

public class EntradaChaveValor {
    // Atributos
    private int chave;
    private String valor;

    // Métodos
    
    // Método construtor
    public EntradaChaveValor(int chave, String valor) {
        this.chave = chave;
        this.valor = valor;
    }

    // Getters e Setters
    public int getChave() {
        return chave;
    }
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" + chave + " = " + valor + "}";
    }
}
