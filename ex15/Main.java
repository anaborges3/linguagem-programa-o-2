package ex15;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new LivroFisico("Java Programming", "John Doe", "123456789", 400);
        Livro livro2 = new LivroDigital("Python Basics", "Jane Smith", "987654321", 10);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Todos os livros:");
        biblioteca.listarTodosLivros();

        System.out.println("\nLivros Físicos:");
        biblioteca.listarLivrosFisicos();

        System.out.println("\nLivros Digitais:");
        biblioteca.listarLivrosDigitais();

        String tituloBusca = "Java Programming";
        System.out.println("\nBusca por título: " + tituloBusca);
        Livro livroBuscado = biblioteca.buscarLivroPorTitulo(tituloBusca);
        if (livroBuscado != null) {
            System.out.println("Livro encontrado: " + livroBuscado);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}

