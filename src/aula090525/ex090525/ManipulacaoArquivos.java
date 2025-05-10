package aula090525.ex090525;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManipulacaoArquivos {
    public static void criarArquivo() {
        File arquivo = new File("tarefas.txt");

        try {
            if(arquivo.createNewFile()) {
                System.out.println("Criado: " + arquivo.getName());
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }

    public static boolean adicionarTarefa(String nomeTarefa, String descricaoTarefa) {
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter("tarefas.txt", true))) {
            escritor.write("Título: " + nomeTarefa);
            escritor.newLine();
            escritor.write("Descrição: " + descricaoTarefa);
            escritor.newLine();
            escritor.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static boolean nomeTarefaExiste(String nomeTarefa) {
        try(BufferedReader leitor = new BufferedReader(new FileReader("tarefas.txt"))) {
            String linha;

            while((linha = leitor.readLine()) != null) {
                if(linha.equalsIgnoreCase("Título: " + nomeTarefa)) {
                    return true;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void listarTarefas() {
        try(BufferedReader leitor = new BufferedReader(new FileReader("tarefas.txt"))) {
            String linha;

            while((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean editarTarefa(String nomeTarefa, String descricaoTarefa) {
        File arquivo = new File("tarefas.txt");
        List<String> linhas = new ArrayList<>();

        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                if(linha.equalsIgnoreCase("Título: " + nomeTarefa)) {
                    linhas.add(linha);
                    String descricao = leitor.readLine();
                    String novaDescricao = descricao + "\n" + descricaoTarefa;
                    linhas.add(novaDescricao);
                } else {
                    linhas.add(linha);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
            for(String linha : linhas) {
                escritor.write(linha);
                escritor.newLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}
