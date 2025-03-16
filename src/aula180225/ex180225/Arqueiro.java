package aula180225.ex180225;

public class Arqueiro extends Personagem {
    // Atributos
    private int quantidadeFlechas;
    
    // Métodos

    // Método construtor
    public Arqueiro(String nome) {
        super(nome);
        this.dano = 12;
        this.quantidadeFlechas = 30;
    }

    // Getters e Setters
    public int getQuantidadeFlechas() {
        return quantidadeFlechas;
    }

    public void setQuantidadeFlechas(int quantidadeFlechas) {
        this.quantidadeFlechas = quantidadeFlechas;
    }

    @Override
    public void atacar(Personagem personagem) {
        if(this.quantidadeFlechas <= 0) {
            System.out.println("Flechas insuficiente!");
        } else {
            System.out.println(this.nome + " atirando flechas em " + personagem.getNome() + "!");
            personagem.receberDano(this.dano);
            personagem.receberDano(this.dano);
            System.out.println("Atacou duas vezes!");
            this.quantidadeFlechas -= 2;
            System.out.println("Dano dado: " + this.dano);
        }
    }

    @Override
    public String toString() {
        return "Arqueiro:" + "\n[Nome: '" + this.nome + "', Nível: " + this.nivel + ", Vida: " + this.vida + ", Quantidade de flechas: " + this.quantidadeFlechas + ", Dano: " + this.dano + "]";
    }
}
