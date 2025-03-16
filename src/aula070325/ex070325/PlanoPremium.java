package aula070325.ex070325;

public class PlanoPremium extends PlanoStreaming {
    // Métodos

    // Método construtor
    public PlanoPremium() {
        super("Plano Premium", 47.97, 4);
    }

    @Override
    public void exibirBeneficios() {
        System.out.println("Suporte a 4 dispositivos e qualidade de vídeo 4K.");
    }
}
