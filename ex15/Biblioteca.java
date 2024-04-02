package ex15;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarTodosLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void listarLivrosFisicos() {
        for (Livro livro : livros) {
            if (livro instanceof LivroFisico) {
                System.out.println(livro);
            }
        }
    }

    public void listarLivrosDigitais() {
        for (Livro livro : livros) {
            if (livro instanceof LivroDigital) {
                System.out.println(livro);
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}

