package ex08.ex02interface;

interface Notificador {
    void enviarMensagem(String mensagem);
}

class NotificadorEmail implements Notificador {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}

class NotificadorSMS implements Notificador {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificadorEmail notificadorEmail = new NotificadorEmail();
        NotificadorSMS notificadorSMS = new NotificadorSMS();

        notificadorEmail.enviarMensagem("Olá, este é um e-mail de teste.");
        notificadorSMS.enviarMensagem("Olá, este é um SMS de teste.");
    }
}

