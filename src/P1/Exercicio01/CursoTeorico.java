package P1.Exercicio01;
public class CursoTeorico extends Curso {
    // Métodos

    // Método construtor
    public CursoTeorico(String titulo, int cargaHoraria) {
        super(titulo, cargaHoraria);
    }

    // Método de emitir certificado
    @Override
    public void emitirCertificado() {
        System.out.println("Certificado emitido após prova final.");
    }
}
