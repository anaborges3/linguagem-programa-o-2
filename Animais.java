// Aluna: Ana Carolina Silva Borges
//teste1

// Classe abstrata Animal
abstract class Animal {
    // Método abstrato para emitir som
    public abstract void emitirSom();
}

// Subclasse Cao
class Cachorro extends Animal {
    // Implementação do método emitirSom para Cao
    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}

// Subclasse Gato
class Gato extends Animal {
    // Implementação do método emitirSom para Gato
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}

// Subclasse Vaca
class Vaca extends Animal {
    // Implementação do método emitirSom para Vaca
    @Override
    public void emitirSom() {
        System.out.println("Muu");
    }
}

public class Animais {
    public static void main(String[] args) {
        // Criando instâncias dos animais
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();
        
        // Chamando o método emitirSom para cada animal
        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();
    }
}
