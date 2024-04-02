package ex16;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SalaDeAula salaDeAula = new SalaDeAula();

        try {
            // Adicionando alunos
            salaDeAula.adicionarAluno(new Aluno("João", "123", StatusAluno.ATIVO));
            salaDeAula.adicionarAluno(new Aluno("Maria", "456", StatusAluno.INATIVO));
            salaDeAula.adicionarAluno(new Aluno("Pedro", "789", StatusAluno.SUSPENSO));

            // Listando todos os alunos
            System.out.println("Todos os alunos:");
            System.out.println(salaDeAula.buscarAlunoPorMatricula("123"));
            System.out.println(salaDeAula.buscarAlunoPorMatricula("456"));
            System.out.println(salaDeAula.buscarAlunoPorMatricula("789"));

            // Removendo um aluno
            salaDeAula.removerAluno("456");
            System.out.println("\nAlunos após remoção:");
            System.out.println(salaDeAula.buscarAlunoPorMatricula("123"));
            System.out.println(salaDeAula.buscarAlunoPorMatricula("789"));

            // Testando exceções
            System.out.println("\nTestando exceções:");
            // Adicionando aluno com matrícula existente
            salaDeAula.adicionarAluno(new Aluno("Ana", "123", StatusAluno.ATIVO));
        } catch (MatriculaExistenteException | MatriculaInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            // Tentando buscar aluno com matrícula inexistente
            salaDeAula.buscarAlunoPorMatricula("999");
        } catch (MatriculaInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            // Serializando e desserializando a sala de aula
            salaDeAula.serializar("salaDeAula.ser");
            SalaDeAula salaDeAulaDesserializada = SalaDeAula.desserializar("salaDeAula.ser");
            System.out.println("\nSala de aula desserializada:");
            System.out.println(salaDeAulaDesserializada.buscarAlunoPorMatricula("123"));
            System.out.println(salaDeAulaDesserializada.buscarAlunoPorMatricula("789"));
        } catch (IOException | ClassNotFoundException | MatriculaInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
