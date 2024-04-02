package ex08.ex06interface;

import java.time.LocalDate;

interface Produto {
    void adicionarEstoque(int quantidade);
    void removerEstoque(int quantidade);
    double calcularValorTotalEmEstoque();
}

class ProdutoPerecivel implements Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEmEstoque;
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, int codigo, double preco, int quantidadeEmEstoque, LocalDate dataValidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.dataValidade = dataValidade;
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    @Override
    public void removerEstoque(int quantidade) {
        quantidadeEmEstoque -= quantidade;
    }

    @Override
    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEmEstoque;
    }

    public String toString() {
        return String.format("Produto: %s (Perecível)\nCódigo: %d\nPreço: %.2f\nQuantidade em Estoque: %d\nData de Validade: %s\nValor Total em Estoque: %.2f\n",
                nome, codigo, preco, quantidadeEmEstoque, dataValidade, calcularValorTotalEmEstoque());
    }
}

class ProdutoNaoPerecivel implements Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEmEstoque;

    public ProdutoNaoPerecivel(String nome, int codigo, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    @Override
    public void removerEstoque(int quantidade) {
        quantidadeEmEstoque -= quantidade;
    }

    @Override
    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEmEstoque;
    }

    public String toString() {
        return String.format("Produto: %s (Não Perecível)\nCódigo: %d\nPreço: %.2f\nQuantidade em Estoque: %d\nValor Total em Estoque: %.2f\n",
                nome, codigo, preco, quantidadeEmEstoque, calcularValorTotalEmEstoque());
    }
}

public class Main {
    public static void main(String[] args) {
        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 456, 4.0, 5, LocalDate.of(2024, 3, 1));
        ProdutoNaoPerecivel arroz = new ProdutoNaoPerecivel("Arroz", 123, 5.0, 10);

        leite.adicionarEstoque(3);
        leite.removerEstoque(1);
        arroz.adicionarEstoque(5);

        System.out.println(leite);
        System.out.println(arroz);
    }
}

