package ex110225;

import java.util.ArrayList;

public class GerenciadorNuvem {
    // Atributos
    private String nomeArquivo;
    private double tamanhoArquivo; // Em MB
    private String tipoArquivo; // Documento, imagem ou vídeo
    private static double espacoTotalDisponivel = 5000; // Em MB
    private String resolucaoImagem;
    private double duracaoVideo; // Em minutos
    private static ArrayList<GerenciadorNuvem> arquivos = new ArrayList<>();

    // Métodos

    // Método construtor
    public GerenciadorNuvem(String nomeArquivo, double tamanhoArquivo, String tipoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
        this.tipoArquivo = tipoArquivo;
    }

    // Getters e Setters
    public static double getEspacoTotalDisponivel() {
        return espacoTotalDisponivel;
    }

    public static boolean setEspacoTotalDisponivel(double espacoTotalDisponivel) {
        if(espacoTotalDisponivel > 0) {
            GerenciadorNuvem.espacoTotalDisponivel = espacoTotalDisponivel;
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<GerenciadorNuvem> getArquivos() {
        return arquivos;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    // Faz o upload do tipo de arquivo "documento" para a nuvem
    public boolean uploadArquivo(String nome, double tamanho) {
        if(this.verificarEspacoDisponivel(tamanho)) {
            this.nomeArquivo = nome;
            this.tamanhoArquivo = tamanho;
            espacoTotalDisponivel -= tamanho;
            return true;
        } else {
            return false;
        }
    }

    // Faz o upload do tipo de arquivo "imagem" para a nuvem
    public boolean uploadArquivo(String nome, double tamanho, String resolucao) {
        if(this.verificarEspacoDisponivel(tamanho)) {
            this.nomeArquivo = nome;
            this.tamanhoArquivo = tamanho;
            this.resolucaoImagem = resolucao;
            espacoTotalDisponivel -= tamanho;
            return true;
        } else {
            return false;
        }
    }

    // Faz o upload do tipo de arquivo "vídeo" para a nuvem
    public boolean uploadArquivo(String nome, double tamanho, double duracao) {
        if(this.verificarEspacoDisponivel(tamanho) && duracao > 0) {
            this.nomeArquivo = nome;
            this.tamanhoArquivo = tamanho;
            this.duracaoVideo = duracao;
            espacoTotalDisponivel -= tamanho;
            return true;
        } else {
            return false;
        }
    }

    // Resumo dos atributos
    public void mostrarDetalhes() {
        System.out.println("Nome do arquivo: " + this.nomeArquivo);
        System.out.println("Tipo do arquivo: " + this.tipoArquivo);
        System.out.println("Tamanho do arquivo: " + this.tamanhoArquivo + " MB");
        if(this.tipoArquivo.equalsIgnoreCase("imagem")) {
            System.out.println("Resolução da imagem: " + this.resolucaoImagem);
        } else if(this.tipoArquivo.equalsIgnoreCase("vídeo")) {
            System.out.println("Duração do vídeo: " + this.duracaoVideo);
        }
        System.out.println("Espaço disponível na nuvem: " + espacoTotalDisponivel + " MB\n");
    }

    // Função para mostrar os arquivos na nuvem
    public static void mostrarArquivos() {
        for(GerenciadorNuvem a : arquivos) {
            System.out.println("Nome do arquivo: " + a.getNomeArquivo());
            System.out.println("Tipo do arquivo: " + a.getTipoArquivo());
            System.out.println("Tamanho do arquivo: " + a.getTamanhoArquivo() + " MB\n");
        }
    }

    // Função para verificar o espaço na nuvem disponível
    private boolean verificarEspacoDisponivel(double tamanho) {
        if(tamanho < espacoTotalDisponivel && tamanho > 0) {
            return true;
        } else {
            return false;
        }
    }
}
