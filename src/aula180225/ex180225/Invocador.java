package aula180225.ex180225;

public class Invocador extends Personagem{
    // Atributos
    private int mana;
    private int quantidadeServos;

    // Métodos

    // Método construtor
    public Invocador(String nome) {
        super(nome);
        this.mana = 20;
        this.dano = 10;
        this.quantidadeServos = 4;
    }

    // Getters e Setters
    public int getMana() {
        return mana;
    }

    public void manar() {
        this.mana += 5;
    }

    public int getQuantidadeServos() {
        return quantidadeServos;
    }

    public void setQuantidadeServos(int quantidadeMaxServos) {
        this.quantidadeServos = quantidadeMaxServos;
    }

    @Override
    public void atacar(Personagem personagem) {
        if((this.mana -= 5) <= 0 || this.quantidadeServos <= 0) {
            System.out.println("Recursos insuficientes!");
        } else {
            System.out.println("Servos de " + this.nome + " atacando " + personagem.getNome() + "!");
            personagem.receberDano(this.dano);
            this.mana -= 5;
            System.out.println("Dano dado: " + this.dano);
        }
    }

    @Override
    public String toString() {
        return "Invocador:" + "\n[Nome: '" + this.nome + "', Nível: " + this.nivel + ", Vida: " + this.vida + ", Mana: " + this.mana + ", Quantidade de Servos: " + this.quantidadeServos + ", Dano: " + this.dano + "]";
    }

}
