package ex06;

public abstract class Produto {
    protected String nome;
    protected int codigo;
    protected double preco;
    protected int quantidadeEmEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public abstract void adicionarEstoque(int quantidade);

    public abstract void removerEstoque(int quantidade);

    public abstract double calcularValorTotalEmEstoque();
}
