package aula210225.ex210225;

public class DroneLongoAlcance extends Drone {
    // Métodos

    // Método construtor
    public DroneLongoAlcance(String localizacao) {
        super(localizacao);
        this.capacidadeCarga = 10;
        this.distanciaMax = 20;
        this.consumoBateria = 5;
    }
    
    @Override
    public void voar(double distancia, String destino, double peso) {
        if(this.entregarPacote(peso)) {
            if(distancia > distancia) {
                System.out.println("Distância máxima excedida.");
            } else if((this.bateria - this.consumoBateria) <= this.consumoBateria) {
                System.out.println("Bateria baixa.");
                System.out.println("Colocando drone para recarregar");
                this.carregarBateria();
            } else {
                System.out.println("Drone de longo alcance levantando voo.");
                this.bateria -= (this.consumoBateria * distancia);
            }
        } else {
            System.out.println("Capacidade máxima do peso atingida.");
        }
    }

}
