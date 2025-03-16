package aula210225.ex210225;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Drone droneRapido = new DroneEntregaRapida("Rua X");
        Drone dronePesado = new DroneEntregaPesada("Rua Y");
        Drone droneAlcance = new DroneLongoAlcance("Rua Z");

        ArrayList<Drone> drones = new ArrayList<>();

        drones.add(droneRapido);
        drones.add(dronePesado);
        drones.add(droneAlcance);
    
        System.out.println(droneRapido.exibirStatus());
        System.out.println(dronePesado.exibirStatus());
        System.out.println(droneAlcance.exibirStatus());

        
        for(int i = 1; i <= 5; i++) {
            // Drone de entrega rápida
            droneRapido.voar(4, "Rua A", 5);
            System.out.println("Bateria do drone " + droneRapido.getId() + ": " + droneRapido.getBateria() + "%");
            System.out.println("\n");

            // Drone de entregas pesadas
            dronePesado.voar(2, "Rua B", 25);
            System.out.println("Bateria do drone " + dronePesado.getId() + ": " + dronePesado.getBateria() + "%");
            System.out.println("\n");
            
            // Drone de longo alcance
            droneAlcance.voar(5, "Rua B", 10);
            System.out.println("Bateria do drone " + droneAlcance.getId() + ": " + droneAlcance.getBateria() + "%");
        }
    }
}
