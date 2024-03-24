package ex06;

public class ProdutoNaoPerecivel extends Produto {
    public ProdutoNaoPerecivel(String nome, int codigo, double preco, int quantidadeEmEstoque) {
        super(nome, codigo, preco, quantidadeEmEstoque);
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

