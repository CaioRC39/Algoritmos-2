package aula090525.ex090525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ManipulacaoArquivos.criarArquivo();

        int opcao;
        do {
            menu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    String nomeTarefa;
                    while(true) {
                        System.out.println("Insira o título da tarefa: ");
                        nomeTarefa = entrada.nextLine();    

                        if(ManipulacaoArquivos.nomeTarefaExiste(nomeTarefa)) {
                            System.out.println("Esse nome já existe. Por favor, escollha outro.");
                        } else {
                            break;
                        }
                    }
                
                    System.out.println("Insira a descrição da tarefa: ");
                    String descricaoTarefa = entrada.nextLine();

                    if(ManipulacaoArquivos.adicionarTarefa(nomeTarefa, descricaoTarefa)) {
                        System.out.println("Tarefa criada com sucesso!\n");
                    }
                    
                    break;
                case 2:
                    ManipulacaoArquivos.listarTarefas();
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Insira o título da tarefa que desejas alterar: ");
                    String tituloTarefa = entrada.nextLine();

                    System.out.println("Insira a descrição adicional: ");
                    String novaDescricao = entrada.nextLine();

                    if(ManipulacaoArquivos.editarTarefa(tituloTarefa, novaDescricao)) {
                        System.out.println("Tarefa atualizada com sucesso!\n");
                    }

                    break;
                case 4:
                    System.out.println("Saindo da aplicação...");

                    break;            
                default:
                    System.out.println("Opção inválida.\n");

                    break;
            }
        } while(opcao != 4);

        entrada.close();
    }

    public static void menu() {
        System.out.println("TaskMaster Light");
        System.out.println("Selecione a opção que desejas: ");
        System.out.println("1 - Adicionar uma nova tarefa");
        System.out.println("2 - Visualizar tarefas");
        System.out.println("3 - Adicionar detalhes a uma tarefa existente");
        System.out.println("4 - Sair do programa.");
    }
}
