package aula250225.ex250225;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        EmailNotificacao email = new EmailNotificacao();
        SMSNotificacao sms = new SMSNotificacao();
        PushNotificacao push = new PushNotificacao();

        notificacoes.add(email);
        notificacoes.add(sms);
        notificacoes.add(push);

        System.out.println("Insira o nome do destinatário: ");
        String destinatario = entrada.nextLine();

        System.out.println("Insira a mensagem que deseja enviar: ");
        String mensagem = entrada.nextLine();

        for(Notificacao n : notificacoes) {
            n.configurar(destinatario);
            System.out.println(n.enviar(mensagem));
        }

        entrada.close();
    }
}
