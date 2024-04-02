package ex03interface;

interface Animal {
    void emitirSom();
}

class Cao implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}

class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}

class Vaca implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Muu");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cao = new Cao();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        cao.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();
    }
}

