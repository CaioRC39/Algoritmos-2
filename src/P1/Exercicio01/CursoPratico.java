package P1.Exercicio01;
public class CursoPratico extends Curso {
    // Métodos

    // Método construtor
    public CursoPratico(String titulo, int cargaHoraria) {
        super(titulo, cargaHoraria);
    }

    // Método de emitir certificado
    @Override
    public void emitirCertificado() {
        System.out.println("Certificado emitido após entrega e validação do projeto final.");
    }
}
