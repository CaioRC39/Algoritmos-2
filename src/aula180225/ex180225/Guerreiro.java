package aula180225.ex180225;

public class Guerreiro extends Personagem {
    // Métodos

    // Método construtor
    public Guerreiro(String nome) {
        super(nome);
        this.dano = 15;
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println(this.nome + " atacando " + personagem.getNome() + " com espada!");
        personagem.receberDano(this.dano);
        System.out.println("Dano dado: " + this.dano);
    }

    @Override
    public String toString() {
        return "Guerreiro:" + "\n[Nome: '" + this.nome + "', Nível: " + this.nivel + ", Vida: " + this.vida + ", Dano: " + this.dano + "]";
    }

    
}
