package aula180225.ex180225;

public class Mago extends Personagem {
    // Atributos
    private int mana;

    // Métodos

    // Método construtor
    public Mago(String nome) {
        super(nome);
        this.mana = 20;
        this.dano = 20;
    }

    // Getters e Setters
    public int getMana() {
        return mana;
    }

    public void manar() {
        this.mana += 5;
    }

    @Override
    public void atacar(Personagem personagem) {
        if((this.mana -= 5) <= 0) {
            System.out.println("Mana insuficiente!");
        } else {
            System.out.println(this.nome + " lançando feitiço em " + personagem.getNome() + "!");
            personagem.receberDano(this.dano);
            this.mana -= 5;
            System.out.println("Dano dado: " + this.dano);
        }
    }

    @Override
    public String toString() {
        return "Mago:" + "\n[Nome: '" + this.nome + "', Nível: " + this.nivel + ", Vida: " + this.vida + ", Mana: " + this.mana + ", Dano: " + this.dano + "]";
    }
}
