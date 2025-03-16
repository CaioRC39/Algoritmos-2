package aula250225.ex250225;

public class PushNotificacao implements Notificacao {
    // Atributos
    private String destinatario;
    
    // Métodos
    @Override
    public String enviar(String mensagem) {
        return "Enviando notificação push para " + this.destinatario + ": " + mensagem;
    }

    @Override
    public void configurar(String destinatario) {
        this.destinatario = destinatario;
    }

}
