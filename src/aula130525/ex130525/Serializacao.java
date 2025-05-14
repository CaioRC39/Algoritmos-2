package aula130525.ex130525;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializacao {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Caio", 21, "Engenharia da Computação", "1234");

        try(FileOutputStream arquivo = new FileOutputStream("aluno.ser");
            ObjectOutputStream out = new ObjectOutputStream(arquivo)) {
                out.writeObject(aluno);
                System.out.println("Objeto Aluno serializado com sucesso!");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
