package ex14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        try {
            while (true) {
                System.out.println("Digite o nome da pessoa (ou -1 para sair): ");
                String nome = scanner.nextLine();
                if (nome.equals("-1")) break;

                System.out.println("Digite a idade da pessoa: ");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer de entrada

                System.out.println("Digite o telefone da pessoa: ");
                String telefone = scanner.nextLine();

                agenda.armazenaPessoa(nome, idade, telefone);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar valores numéricos para idade.");
        }

        System.out.println("\nClientes armazenados na agenda:");
        agenda.imprimeAgenda();

        scanner.close();
    }
}
