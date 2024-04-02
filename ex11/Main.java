package ex11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Pessoa implements Serializable {
    private String nome;
    private int idade;
    private List<Pessoa> amigos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.amigos = new ArrayList<>();
    }

    public void adicionarAmigo(Pessoa amigo) {
        amigos.add(amigo);
    }

    public List<Pessoa> getAmigos() {
        return amigos;
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criar lista de pessoas
        Pessoa pessoa1 = new Pessoa("Alice", 25);
        Pessoa pessoa2 = new Pessoa("Bob", 30);
        Pessoa pessoa3 = new Pessoa("Carol", 28);

        // Adicionar amigos
        pessoa1.adicionarAmigo(pessoa2);
        pessoa1.adicionarAmigo(pessoa3);

        // Serializar objeto Pessoa com lista de amigos
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("pessoaComAmigos.ser"))) {
            outputStream.writeObject(pessoa1);
            System.out.println("Objeto Pessoa serializado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao serializar objeto Pessoa: " + e.getMessage());
        }

        // Desserializar objeto Pessoa com lista de amigos
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("pessoaComAmigos.ser"))) {
            Pessoa pessoaDesserializada = (Pessoa) inputStream.readObject();
            System.out.println("Objeto Pessoa desserializado com sucesso.");

            // Imprimir nomes dos amigos
            System.out.println("Lista de amigos de " + pessoaDesserializada.getNome() + ":");
            for (Pessoa amigo : pessoaDesserializada.getAmigos()) {
                System.out.println(amigo.getNome());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao desserializar objeto Pessoa: " + e.getMessage());
        }
    }
}

