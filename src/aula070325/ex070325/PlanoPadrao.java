package aula070325.ex070325;

public class PlanoPadrao extends PlanoStreaming {
    // Métodos

    // Método construtor
    public PlanoPadrao() {
        super("Plano Padrão", 24.99, 2);
    }

    @Override
    public void exibirBeneficios() {
        System.out.println("Suporte a 2 dispositivos e qualidade de vídeo Full HD.");
    }
}
