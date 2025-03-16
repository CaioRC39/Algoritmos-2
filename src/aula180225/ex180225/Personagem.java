package aula180225.ex180225;

public class Personagem {
    // Atributos
    protected String nome;
    protected int nivel, vida, dano;
    
    // Métodos

    // Método construtor
    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.vida = 100;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    // Formatação dos dados
    public String toString() {
        return "Personagem:" + "\n[Nome: '" + this.nome + "', Nível: " + this.nivel + ", Vida: " + this.vida + ", Dano: " + this.dano + "]";
    }
    
    public void atacar(Personagem personagem) { }
    
    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public void subirNivel() {
        this.nivel += 1;
    }

    public void curar() {
        this.vida += 20;
    }
}
