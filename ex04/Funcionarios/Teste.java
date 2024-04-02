package ex04.Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        // Criando objetos de cada tipo de funcionário e armazenando em uma lista
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("João", "123", 3000.0));
        funcionarios.add(new Assistente("Maria", "456", 2000.0));
        funcionarios.add(new Vendedor("Pedro", "789", 1500.0, 500.0));

        // Calculando e imprimindo a folha salarial
        double folhaSalarial = 0;
        for (Funcionario funcionario : funcionarios) {
            folhaSalarial += funcionario.calculaSalario();
        }
        System.out.println("Folha Salarial Total: R$ " + folhaSalarial);
    }
}
