package ex08.ex04interface;

public class Teste2 {
    public static void main(String[] args) {
        Funcionario2 gerente = new Gerente2("João", "123", 3000);
        Funcionario2 assistente = new Assistente2("Maria", "456", 2000);
        Funcionario2 vendedor = new Vendedor2("Pedro", "789", 2500, 500);

        // Criando uma lista para armazenar os funcionários
        Funcionario2[] funcionarios = {gerente, assistente, vendedor};

        // Calculando a folha salarial
        double folhaSalarial = 0;
        for (Funcionario2 funcionario : funcionarios) {
            folhaSalarial += funcionario.calculaSalario();
        }

        // Imprimindo o valor total da folha salarial
        System.out.println("Folha Salarial Total: R$" + folhaSalarial);
    }
}

