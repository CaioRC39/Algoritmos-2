package aula250225.ex250225;

public class EmailNotificacao implements Notificacao {
    // Atributos
    private String destinatario;
    
    // Métodos
    @Override
    public String enviar(String mensagem) {
        return "Enviando e-mail para " + this.destinatario + ": " + mensagem;
    }

    @Override
    public void configurar(String destinatario) {
        this.destinatario = destinatario;
    }

}
