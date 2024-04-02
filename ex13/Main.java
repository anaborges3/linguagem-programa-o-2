package ex13;

public class Main {
    public static void main(String[] args) {
        // Criando produtos e adicionando ao estoque
        Produto produto1 = new Produto("Arroz", 5.0, 50);
        Produto produto2 = new Produto("Feijão", 4.0, 40);
        Produto produto3 = new Produto("Macarrão", 3.0, 30);

        // Criando pedido
        Pedido pedido = new Pedido();

        // Adicionando itens ao pedido
        try {
            pedido.adicionarItem(new ItemDePedido(produto1, 10));
            pedido.adicionarItem(new ItemDePedido(produto2, 20));
            pedido.adicionarItem(new ItemDePedido(produto3, 15));
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro ao adicionar item ao pedido: " + e.getMessage());
        }

        // Definindo método de pagamento
        pedido.definirMetodoPagamento(MetodoPagamento.CARTAO);

        // Imprimindo valor total do pedido
        System.out.println("Valor total do pedido: " + pedido.calcularValorTotal());
    }
}

