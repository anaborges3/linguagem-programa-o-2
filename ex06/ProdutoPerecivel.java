package ex06;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    public LocalDate dataValidade;

    public ProdutoPerecivel(String nome, int codigo, double preco, int quantidadeEmEstoque, LocalDate dataValidade) {
        super(nome, codigo, preco, quantidadeEmEstoque);
        this.dataValidade = dataValidade;
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    @Override
    public void removerEstoque(int quantidade) {
        if (quantidadeEmEstoque >= quantidade) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    @Override
    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEmEstoque;
    }
}

