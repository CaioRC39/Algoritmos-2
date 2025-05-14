package aula130525.ex130525;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desserializacao {
    public static void main(String[] args) {
        Aluno aluno = null;

        try(FileInputStream arquivo = new FileInputStream("aluno.ser");
            ObjectInputStream in = new ObjectInputStream(arquivo)) {
                aluno = (Aluno) in.readObject();
                System.out.println("Objeto Aluno foi desserializado: ");
                System.out.println(aluno);
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
