package ex02;
// Aluna: Ana Carolina Silva Borges

// Classe abstrata Notificador
abstract class Notificador {
    // Método abstrato para enviar mensagem
    public abstract void enviarMensagem(String mensagem);
}

// Subclasse NotificadorEmail
class NotificadorEmail extends Notificador {
    // Implementação do método enviarMensagem para Email
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por e-mail: " + mensagem);
    }
}

// Subclasse NotificadorSMS
class NotificadorSMS extends Notificador {
    // Implementação do método enviarMensagem para SMS
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por SMS: " + mensagem);
    }
}

public class Mensagens {
    public static void main(String[] args) {
        // Criando instâncias dos notificadores
        NotificadorEmail notificadorEmail = new NotificadorEmail();
        NotificadorSMS notificadorSMS = new NotificadorSMS();
        
        // Usando os notificadores para enviar mensagens
        notificadorEmail.enviarMensagem("e-mail de teste");
        notificadorSMS.enviarMensagem("sms de teste");
    }
}
