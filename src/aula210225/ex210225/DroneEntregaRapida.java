package aula210225.ex210225;

public class DroneEntregaRapida extends Drone {
    // Métodos

    // Método construtor
    public DroneEntregaRapida(String localizacao) {
        super(localizacao);
        this.capacidadeCarga = 5;
        this.distanciaMax = 4;
        this.consumoBateria = 7;
    }
    
    @Override
    public void voar(double distancia, String destino, double peso) {
        if(this.entregarPacote(peso)) {
            if(distancia > distanciaMax) {
                System.out.println("Distância máxima excedida.");
            } else if((this.bateria - this.consumoBateria) <= this.consumoBateria) {
                System.out.println("Bateria baixa.");
                System.out.println("Colocando drone para recarregar");
                this.carregarBateria();
            } else {
                System.out.println("Drone de entrega rápida levantando voo.");
                this.bateria -= (this.consumoBateria * distancia);
            }
        } else {
            System.out.println("Capacidade máxima do peso atingida.");
        }
    }
}
