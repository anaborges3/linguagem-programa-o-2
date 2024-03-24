package ex05;

/*
 * justificativa: A mudança para uma interface reflete melhor a semântica da relação entre as classes. Como a classe Mensagem não possui nenhuma implementação concreta e serve apenas para definir um contrato para seus subtipos, é mais apropriado defini-la como uma interface. Dessa forma, as classes Informativo, Promocao e Urgente podem implementar a interface Mensagem e fornecer suas próprias implementações do método mostrar(), mantendo o mesmo comportamento esperado pelo sistema.
 */

interface Mensagem {
    void mostrar();
}

class Informativo implements Mensagem {
    private String destinatario;

    public Informativo(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Mensagem informativa para " + destinatario);
    }
}

class Promocao implements Mensagem {
    private String destinatario;

    public Promocao(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Mensagem de promoção para " + destinatario);
    }
}

class Urgente implements Mensagem {
    private String destinatario;

    public Urgente(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void mostrar() {
        System.out.println("Mensagem urgente para " + destinatario);
    }
}

public class Teste {
    public static void main(String[] args) {
        Mensagem[] mensagens = new Mensagem[3];
        mensagens[0] = new Informativo("João");
        mensagens[1] = new Promocao("Maria");
        mensagens[2] = new Urgente("Carlos");

        for (Mensagem mensagem : mensagens) {
            mensagem.mostrar();
        }
    }
}
