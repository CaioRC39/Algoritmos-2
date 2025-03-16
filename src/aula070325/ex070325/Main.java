package aula070325.ex070325;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        PlataformaStreaming plataforma = new PlataformaStreaming();

        int opcao;

        do {
            menu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\nInsira o nome do usuário: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();

                    System.out.println("\nInsira o plano desejado: ");
                    System.out.println("1 - Plano Básico");
                    System.out.println("2 - Plano Padrão");
                    System.out.println("3 - Plano Premium");
                    int plano = entrada.nextInt();

                    if(plano == 1) {
                        PlanoBasico planoBasico = new PlanoBasico();

                        Usuario usuario = new Usuario(nome, planoBasico);
                        plataforma.getUsuarios().add(usuario);
                        System.out.println("\nUsuário " + usuario.getNome() + " com plano " + usuario.getPlanoAssinado().getNomePlano() + " criado com sucesso!\n");

                    } else if(plano == 2) {
                        PlanoPadrao planoPadrao = new PlanoPadrao();

                        Usuario usuario = new Usuario(nome, planoPadrao);
                        plataforma.getUsuarios().add(usuario);
                        System.out.println("\nUsuário " + usuario.getNome() + " com plano " + usuario.getPlanoAssinado().getNomePlano() + " criado com sucesso!\n");

                    } else if(plano == 3) {
                        PlanoPremium planoPremium = new PlanoPremium();

                        Usuario usuario = new Usuario(nome, planoPremium);
                        plataforma.getUsuarios().add(usuario);
                        System.out.println("\nUsuário " + usuario.getNome() + " com plano " + usuario.getPlanoAssinado().getNomePlano() + " criado com sucesso!\n");

                    } else {
                        System.out.println("Opção inválida.\n");
                    }

                    break;

                case 2:
                    System.out.println("\nSelecione o índice do usuário que deseja alterar o plano: ");
                    plataforma.listarUsuario();
                    int user = entrada.nextInt();
                
                    System.out.println("\nSelecione o plano para qual deseja mudar: ");
                    System.out.println("1 - Plano Básico");
                    System.out.println("2 - Plano Padrão");
                    System.out.println("3 - Plano Premium");
                    int mudarPlano = entrada.nextInt();

                    if(mudarPlano == 1) {
                        plataforma.getUsuarios().get((user - 1)).alterarPlano(new PlanoBasico());
                        System.out.println("Plano do usuario " + plataforma.getUsuarios().get((user - 1)).getNome() + " alterado para " +  plataforma.getUsuarios().get((user - 1)).getPlanoAssinado().getNomePlano() + " com sucesso!\n");

                    } else if(mudarPlano == 2) {
                        plataforma.getUsuarios().get((user - 1)).alterarPlano(new PlanoPadrao());
                        System.out.println("Plano do usuario " + plataforma.getUsuarios().get((user - 1)).getNome() + " alterado para " +  plataforma.getUsuarios().get((user - 1)).getPlanoAssinado().getNomePlano() + " com sucesso!\n");

                    } else if(mudarPlano == 3) {
                        plataforma.getUsuarios().get((user - 1)).alterarPlano(new PlanoPremium());
                        System.out.println("Plano do usuario " + plataforma.getUsuarios().get((user - 1)).getNome() + " alterado para " +  plataforma.getUsuarios().get((user - 1)).getPlanoAssinado().getNomePlano() + " com sucesso!\n");

                    } else {
                        System.out.println("Plano selecionado inválido.\n");
                    }

                    break;

                case 3:
                    System.out.println("\nSelecione o índice do usuário que deseja exibir a fatura: ");
                    plataforma.listarUsuario();
                    int indice = entrada.nextInt();

                    System.out.println();
                    plataforma.getUsuarios().get((indice - 1)).exibirFatura();
                    System.out.println();
                
                    break;
                    
                case 4:
                    System.out.println("Saindo do sistema...");   
                    
                    break;
            
                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
                    break;
            }
        } while(opcao != 4);

        entrada.close();
    }

    public static void menu() {
        System.out.println("Bem-vindo ao Sistema de Gestão de Assinaturas de Streaming!");
        System.out.println("Digite o número correspondente à opção desejada: ");
        System.out.println("1 - Cadastrar um usuário escolhendo um plano");
        System.out.println("2 - Alterar o plano de um usuário existente");
        System.out.println("3 - Exibir fatura do usuário");
        System.out.println("4 - Sair da plataforma");
    }
}
