package ex13;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Pedido implements Serializable {
    private List<ItemDePedido> itens;
    private MetodoPagamento metodoPagamento;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemDePedido item) throws EstoqueInsuficienteException {
        if (!item.getProduto().verificaEstoque(item.getQuantidade())) {
            throw new EstoqueInsuficienteException("Estoque insuficiente para o produto: " + item.getProduto().getNome());
        }
        itens.add(item);
        int novaQuantidade = item.getProduto().getQuantidadeEstoque() - item.getQuantidade();
        item.getProduto().setQuantidadeEstoque(novaQuantidade);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemDePedido item : itens) {
            total += item.calcularCustoTotal();
        }
        return total;
    }

    public void definirMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}

