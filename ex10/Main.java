package ex10;

interface Comparavel {
    int comparar(Object o) throws IllegalArgumentException;
}

class Livro implements Comparavel {
    private String nome;

    public Livro(String nome) {
        this.nome = nome;
    }

    @Override
    public int comparar(Object o) throws IllegalArgumentException {
        if (!(o instanceof Livro)) {
            throw new IllegalArgumentException("O objeto passado como parâmetro não é um Livro.");
        }

        Livro outroLivro = (Livro) o;

        if (this.nome == null || outroLivro.nome == null) {
            throw new IllegalArgumentException("O nome de um dos livros é null.");
        }

        return this.nome.compareTo(outroLivro.nome);
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Tentando comparar um livro com um objeto que não é um Livro
            Livro livro1 = new Livro("Java Básico");
            Object objetoNaoLivro = new Object();
            livro1.comparar(objetoNaoLivro);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção ao comparar: " + e.getMessage());
        }

        try {
            // Tentando comparar dois livros onde um tem o nome como null
            Livro livro2 = new Livro("Programação Avançada");
            Livro livro3 = new Livro(null);
            livro2.comparar(livro3);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção ao comparar: " + e.getMessage());
        }
    }
}

