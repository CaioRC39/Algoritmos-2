package ex110225;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("===== Menu - Gerenciador Nuvem =====");
        System.out.println("Escolha a opção e digite seu respectivo número: ");
        System.out.println("1 - Fazer upload de um documento");
        System.out.println("2 - Fazer upload de uma imagem");
        System.out.println("3 - Fazer upload de um vídeo");
        System.out.println("4 - Exibir o espaço total disponível na nuvem");
        System.out.println("5 - Mostrar arquivos na nuvem");
        System.out.println("6 - Definir novo tamanho do espaço na nuvem");
        System.out.println("7 - Sair da nuvem");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        do {
            menu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do documento: ");
                    String nomed = entrada.nextLine();

                    System.out.println("Digite o tamanho do documento (em MB): ");
                    double tamanhod = entrada.nextDouble();

                    GerenciadorNuvem documento = new GerenciadorNuvem(nomed, tamanhod, "documento");
                    if(documento.uploadArquivo(nomed, tamanhod)) {
                        System.out.println("\nUpload do documento realizado com sucesso!");
                        System.out.println("Detalhes do documento: ");
                        documento.mostrarDetalhes();
                        GerenciadorNuvem.getArquivos().add(documento);
                    } else {
                        System.out.println("Tamanho do arquivo inválido! Tente novamente.\n");
                    }
                    break;
                
                case 2:
                    System.out.println("Digite o nome da imagem: ");
                    String nomei = entrada.nextLine();

                    System.out.println("Digite a resolução da imagem: ");
                    String resolucaoi = entrada.nextLine();

                    System.out.println("Digite o tamanho da imagem (em MB): ");
                    double tamanhoi = entrada.nextDouble();

                    GerenciadorNuvem imagem = new GerenciadorNuvem(nomei, tamanhoi, "imagem");
                    if(imagem.uploadArquivo(nomei, tamanhoi, resolucaoi)) {
                        System.out.println("\nUpload da imagem realizado com sucesso!");
                        System.out.println("Detalhes da imagem: ");
                        imagem.mostrarDetalhes();
                        GerenciadorNuvem.getArquivos().add(imagem);
                    } else {
                        System.out.println("Tamanho do arquivo inválido! Tente novamente.\n");
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do vídeo: ");
                    String nomev = entrada.nextLine();

                    System.out.println("Digite a duração do vídeo (em minutos): ");
                    double duracaov = entrada.nextDouble();

                    System.out.println("Digite o tamanho do vídeo (em MB): ");
                    double tamanhov = entrada.nextDouble();

                    GerenciadorNuvem video = new GerenciadorNuvem(nomev, tamanhov, "vídeo");
                    if(video.uploadArquivo(nomev, tamanhov, duracaov)) {
                        System.out.println("\nUpload do vídeo realizado com sucesso!");
                        System.out.println("Detalhes do vídeo: ");
                        video.mostrarDetalhes();
                        GerenciadorNuvem.getArquivos().add(video);
                    } else {
                        System.out.println("Tamanho do arquivo inválido! Tente novamente.\n");
                    }
                    break;
                    
                case 4:
                    System.out.println(GerenciadorNuvem.getEspacoTotalDisponivel() + " MB\n");
                    break;

                case 5:
                    System.out.println("\nArquivos na nuvem: ");
                    GerenciadorNuvem.mostrarArquivos();
                    break;    
                    
                case 6:
                    System.out.println("Insira o novo tamanho que desejas para o espaço na nuvem (em MB): ");
                    double novoTamanho = entrada.nextDouble();
                    if(GerenciadorNuvem.setEspacoTotalDisponivel(novoTamanho)) {
                        System.out.println("Tamanho atualizado com sucesso!\n");
                    } else {
                        System.out.println("Tamanho negativo! Tente novamente.\n");
                    }
                    break;
                
                case 7:
                    System.out.println("Saindo da nuvem...");
                    break;
            
                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }


        } while(opcao != 7);

        entrada.close();
    }

    
}
