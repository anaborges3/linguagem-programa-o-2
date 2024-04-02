package ex13;

import java.io.Serializable;

class ItemDePedido implements Serializable {
    private Produto produto;
    private int quantidade;

    public ItemDePedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularCustoTotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

