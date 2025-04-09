package P1.Exercicio01;
public class Workshop extends Curso {
    // Métodos

    // Método construtor
    public Workshop(String titulo, int cargaHoraria) {
        super(titulo, cargaHoraria);
    }

    // Método de emitir certificado
    @Override
    public void emitirCertificado() {
        System.out.println("Certificado emitido por participação no evento.");
    }
}
