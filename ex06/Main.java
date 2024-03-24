package ex06;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de ProdutoPerecivel e ProdutoNaoPerecivel
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 1, 3.5, 10, LocalDate.of(2024, 4, 1));
        ProdutoNaoPerecivel produtoNaoPerecivel = new ProdutoNaoPerecivel("Caneta", 2, 1.0, 20);

        // Adicionando e removendo estoque
        produtoPerecivel.adicionarEstoque(5);
        produtoPerecivel.removerEstoque(2);

        produtoNaoPerecivel.adicionarEstoque(10);
        produtoNaoPerecivel.removerEstoque(5);

        // Calculando o valor total em estoque
        double valorTotalPerecivel = produtoPerecivel.calcularValorTotalEmEstoque();
        double valorTotalNaoPerecivel = produtoNaoPerecivel.calcularValorTotalEmEstoque();

        // Exibindo as informações de cada produto
        System.out.println("Produto Perecível:");
        System.out.println("Nome: " + produtoPerecivel.nome);
        System.out.println("Código: " + produtoPerecivel.codigo);
        System.out.println("Preço: R$" + produtoPerecivel.preco);
        System.out.println("Quantidade em Estoque: " + produtoPerecivel.quantidadeEmEstoque);
        System.out.println("Data de Validade: " + produtoPerecivel.dataValidade);
        System.out.println("Valor Total em Estoque: R$" + valorTotalPerecivel);

        System.out.println();

        System.out.println("Produto Não Perecível:");
        System.out.println("Nome: " + produtoNaoPerecivel.nome);
        System.out.println("Código: " + produtoNaoPerecivel.codigo);
        System.out.println("Preço: R$" + produtoNaoPerecivel.preco);
        System.out.println("Quantidade em Estoque: " + produtoNaoPerecivel.quantidadeEmEstoque);
        System.out.println("Valor Total em Estoque: R$" + valorTotalNaoPerecivel);
    }
}

