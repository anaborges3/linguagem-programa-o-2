package ex09;

interface Comparavel {
    int comparar(Object o);
}

class Livro implements Comparavel {
    private String nome;

    public Livro(String nome) {
        this.nome = nome;
    }

    @Override
    public int comparar(Object o) {
        if (!(o instanceof Livro)) {
            throw new IllegalArgumentException("O objeto passado como parâmetro não é um Livro.");
        }
        Livro outroLivro = (Livro) o;
        return this.nome.compareTo(outroLivro.nome);
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java Básico");
        Livro livro2 = new Livro("Programação Avançada");

        int resultado = livro1.comparar(livro2);
        if (resultado < 0) {
            System.out.println(livro1.getNome() + " vem antes de " + livro2.getNome() + " na ordem alfabética.");
        } else if (resultado > 0) {
            System.out.println(livro1.getNome() + " vem depois de " + livro2.getNome() + " na ordem alfabética.");
        } else {
            System.out.println(livro1.getNome() + " é igual a " + livro2.getNome() + " na ordem alfabética.");
        }
    }
}

