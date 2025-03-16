package aula280225.ex280225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Sistema de Monitoramento do Paciente");
        
        int opcao = 1;

        System.out.println("Insira o nome do paciente: ");
        String nome = entrada.nextLine();

        System.out.println("Insira a idade do paciente: ");
        int idade = entrada.nextInt();

        Paciente p = new Paciente(nome, idade);
        
        do {
            try {
                System.out.println("Insira a frequência cardíaca do paciente: ");
                int frequenciaCardiaca = entrada.nextInt();

                System.out.println("Insira a temperatura do paciente: ");
                double temperaturaCorporal = entrada.nextDouble();

                p.monitorarPaciente(frequenciaCardiaca, temperaturaCorporal);

                System.out.println("\nDeseja continuar?");
                System.out.println("Para prosseguir, digite 1");
                System.out.println("Para sair, digite 0");
                opcao = entrada.nextInt();
            } catch (IllegalArgumentException illegalArgumentException) {
                System.err.println(illegalArgumentException);
            } catch (AlertaMedicoException alertaMedicoException) {
                System.err.println(alertaMedicoException);
            }
        } while(opcao != 0);

        entrada.close();
    }
}
