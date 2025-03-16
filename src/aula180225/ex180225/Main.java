package aula180225.ex180225;

public class Main {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Gabriel");
        Mago m = new Mago("Luan");
        Arqueiro a = new Arqueiro("Caio");
        Invocador i = new Invocador("Beatriz");

        System.out.println("Exibindo atributos iniciais: ");
        System.out.println(g);
        System.out.println(m);
        System.out.println(a);
        System.out.println(i);

        g.atacar(m);
        System.out.println("Vida do Mago: " + m.getVida());

        m.atacar(g);
        System.out.println("Vida do Guerreiro: " + g.getVida());

        m.atacar(g);
        System.out.println("Vida do Guerreiro: " + g.getVida());

        a.atacar(m);
        System.out.println("Vida do Mago: " + m.getVida());

        a.atacar(m);
        System.out.println("Vida do Mago: " + m.getVida());

        m.atacar(a);
        System.out.println("Vida do Arqueiro: " + a.getVida());
        
        i.atacar(m);
        System.out.println("Vida do Mago: " + m.getVida());

        m.subirNivel();
        System.out.println("Mago subiu de nível");
        System.out.println(m);

        a.subirNivel();
        System.out.println("Arqueiro subiu de nível");
        System.out.println(a);
    }
}
