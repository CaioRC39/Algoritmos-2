package aula250225.ex250225;

public class SMSNotificacao implements Notificacao {
    // Atributos
    private String destinatario;
    
    // Métodos
    @Override
    public String enviar(String mensagem) {
        return "Enviando SMS para " + this.destinatario + ": " + mensagem;
    }

    @Override
    public void configurar(String destinatario) {
        this.destinatario = destinatario;
    }

}
