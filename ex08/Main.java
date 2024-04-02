package ex08;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Matriculado {
    protected String matricula;
    protected double[] notas;

    public Matriculado(String matricula, int numNotas) {
        this.matricula = matricula;
        this.notas = new double[numNotas];
    }

    public abstract double calcularMedia();

    public void receberNotas(Scanner scanner) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            int indiceNota = lerIndice(scanner);
            double nota = lerNota(scanner);
            notas[indiceNota] = nota;
        }
    }

    private int lerIndice(Scanner scanner) {
        int indice = -1;
        while (indice < 0 || indice >= notas.length) {
            try {
                System.out.println("Digite o índice da nota (0, 1, 2, ...):");
                indice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Índice inválido. Digite um número válido.");
                scanner.next(); // limpar o buffer
            }
        }
        return indice;
    }

    private double lerNota(Scanner scanner) {
        double nota = -1;
        while (nota < 0) {
            try {
                System.out.println("Digite o valor da nota:");
                nota = scanner.nextDouble();
                if (nota < 0) {
                    throw new IllegalArgumentException("Nota não pode ser negativa.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Digite um número válido.");
                scanner.next(); // limpar o buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return nota;
    }
}

class AlunoIntegrado extends Matriculado {
    private String nome;
    private String telefone;

    public AlunoIntegrado(String matricula, String nome, String telefone) {
        super(matricula, 3);
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public double calcularMedia() {
        return (0.3 * notas[0] + 0.3 * notas[1] + 0.4 * notas[2]) / 3;
    }
}

class AlunoSuperior extends Matriculado {
    public AlunoSuperior(String matricula) {
        super(matricula, 2);
    }

    @Override
    public double calcularMedia() {
        return (0.4 * notas[0] + 0.6 * notas[1]) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AlunoIntegrado alunoIntegrado = new AlunoIntegrado("123", "João", "9999-8888");
        System.out.println("Digite as notas do aluno integrado:");
        alunoIntegrado.receberNotas(scanner);
        System.out.println("Média do aluno integrado: " + alunoIntegrado.calcularMedia());

        AlunoSuperior alunoSuperior = new AlunoSuperior("456");
        System.out.println("Digite as notas do aluno superior:");
        alunoSuperior.receberNotas(scanner);
        System.out.println("Média do aluno superior: " + alunoSuperior.calcularMedia());

        scanner.close();
    }
}

