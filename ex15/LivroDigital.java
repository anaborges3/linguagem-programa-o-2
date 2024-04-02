package ex15;

public class LivroDigital extends Livro {
    private int tamanhoArquivo; // Em MB

    public LivroDigital(String titulo, String autor, String isbn, int tamanhoArquivo) {
        super(titulo, autor, isbn);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", tamanhoArquivo=" + tamanhoArquivo +
                '}';
    }
}

