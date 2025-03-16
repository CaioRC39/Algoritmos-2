package aula140325.ex140325;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SistemasStreaming sistema = new SistemasStreaming();
        int opcao;

        do {
            menu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nEscolha a opção que desejas: ");
                    System.out.println("1 - Inserir conteúdo");
                    System.out.println("2 - Remover conteúdo");
                    System.out.println("3 - Listar conteúdo(s)");
                    int gerenciar = entrada.nextInt();

                    if(gerenciar == 1) {
                        System.out.println("\nInsira o título do conteúdo: ");
                        entrada.nextLine();
                        String titulo = entrada.nextLine();

                        System.out.println("Insira o tipo do conteúdo: ");
                        String tipo = entrada.nextLine();

                        System.out.println("Insira o gênero do conteúdo: ");
                        String genero = entrada.nextLine();

                        System.out.println("Insira o índice de onde quer colocar o conteúdo (começando por 0): ");
                        int indiceConteudo = entrada.nextInt();

                        sistema.inserirConteudo(indiceConteudo, titulo, tipo, genero);
                        System.out.println("Conteúdo inserido com sucesso!\n");

                    } else if(gerenciar == 2) {
                        if(sistema.getCatalogo().size() <= 0) {
                            System.out.println("Não há conteúdo(s) para remover.\n");
                            break;
                        }
                        
                        System.out.println("\nEscolha como deseja remover o conteúdo: ");
                        System.out.println("1 - Por índice");
                        System.out.println("2 - Por busca");
                        int remocao = entrada.nextInt();

                        if(remocao == 1) {
                            System.out.println("\nInsira o índice do conteúdo de que desejas remover: ");
                            System.out.println("Listando o(s) conteúdo(s): ");
                            sistema.listarConteudo();
                            int indiceRemocao = entrada.nextInt();
                            System.out.println("\n" + sistema.removerConteudo((indiceRemocao - 1)).toString() + " removido com sucesso!\n");

                        } else if(remocao == 2) {
                            System.out.println("\nListando o(s) conteúdo(s): ");
                            sistema.listarConteudo();
                            
                            System.out.println("\nInsira o título do conteúdo que desejas remover: ");
                            entrada.nextLine();
                            String titulo = entrada.nextLine();

                            System.out.println("Insita o tipo do contéudo que desejas remover: ");
                            String tipo = entrada.nextLine();

                            System.out.println("Insira o gênero do conteúdo que desejas remover: ");
                            String genero = entrada.nextLine();

                            if(sistema.removerConteudo(titulo, tipo, genero)) {
                                System.out.println("Conteúdo removido com sucesso!\n");
                            } else {
                                System.out.println("Conteúdo não encontrado.\n");
                            }

                        } else {
                            System.out.println("Opção inválida! Tente novamente.\n");
                        }

                    } else if(gerenciar == 3) {
                        if(sistema.getCatalogo().size() <= 0) {
                            System.out.println("Não há conteúdo(s) para listar.\n");
                            break;
                        }
                        
                        System.out.println("\nListando o(s) conteúdo(s): ");
                        sistema.listarConteudo();
                        System.out.println();

                    } else {
                        System.out.println("Opção digitada inválida! Tente novamente.\n");
                    }

                    break;

                case 2:
                    if(sistema.getCatalogo().size() <= 0) {
                        System.out.println("Não há conteúdo(s) para requisitar.\n");
                        break;
                    }
                    
                    entrada.nextLine();
                    System.out.println("Insira o nome do usuário requerente: ");
                    String nome = entrada.nextLine();

                    System.out.println("Escolha o índice do conteúdo a ser requisitado: ");
                    sistema.listarConteudo();
                    int indiceRequisitado = entrada.nextInt();
                    Conteudo conteudo = sistema.getCatalogo().get((indiceRequisitado - 1));

                    LocalDateTime hora = LocalDateTime.now();

                    // Adicionando requisição
                    sistema.adicionarRequisicao(nome, conteudo, hora);
                    System.out.println("Requisição adicionada com sucesso!\n");
                
                    break;
                    
                case 3:
                    if(sistema.getCatalogo().size() <= 0) {
                        System.out.println("Não há conteúdo(s) para processar.\n");
                        break;
                    } else if(sistema.getFilaSolicitacoes().size() <= 0) {
                        System.out.println("Não há solicitações na fila.\n");
                        break;
                    }
                
                    System.out.println(sistema.processarRequisicao().toString() + " processada!\n");
                
                    break;
                    
                case 4:
                    if(sistema.getCatalogo().size() <= 0) {
                        System.out.println("Não há conteúdo(s) para desfazer requisição.\n");
                        break;
                    }
                
                    System.out.println("Desfazendo reprodução de: " + sistema.desfazerReproducao().toString() + "\n");

                    break;

                case 5:    
                    if(sistema.getCatalogo().size() <= 0) {
                        System.out.println("Não há histórico para ser exibido.\n");
                        break;
                    }
                
                    System.out.println("Exibindo o histórico: ");    
                    sistema.exibirHistorico();
                    System.out.println();

                    break;

                case 6:
                    System.out.println("Saindo do sistema...");    

                    break;
            
                default:
                    System.out.println("Opção inválida!\n");

                    break;
            }
            
        } while(opcao != 6);

        entrada.close();
    }

    public static void menu() {
        System.out.println("Bem-vindo ao Streaming de Música");
        System.out.println("Selecione a opção que desejas: ");
        System.out.println("1 - Gerenciar catálogo");
        System.out.println("2 - Adicionar requisição");
        System.out.println("3 - Processar próxima requisição");
        System.out.println("4 - Desfazer última reprodução");
        System.out.println("5 - Exibir histórico");
        System.out.println("6 - Sair do sistema");
    }
}
