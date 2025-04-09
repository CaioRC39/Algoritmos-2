package P1.Exercicio01;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>(Arrays.asList(new CursoTeorico("Cálculo", 40),
                                                                new CursoPratico("Algoritmos 2", 80),
                                                                new Workshop("Workshop de Java", 10)));
        
        for(Curso c : cursos) {
            System.out.println(c.exibirInformacoes());
            c.emitirCertificado();
        }
    }
}
