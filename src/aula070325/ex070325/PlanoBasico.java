package aula070325.ex070325;

public class PlanoBasico extends PlanoStreaming {
    // Métodos

    // Método construtor
    public PlanoBasico() {
        super("Plano Básico", 14.99, 1);
    }

    @Override
    public void exibirBeneficios() {
        System.out.println("Suporte a 1 dispositivo e qualidade de vídeo HD.");
    }

}
