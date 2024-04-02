package ex12;

import java.io.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // Criação e teste de Conta Corrente
            ContaCorrente contaCorrente = new ContaCorrente("001");
            contaCorrente.depositar(1000);
            contaCorrente.sacar(500);
            System.out.println("Saldo da Conta Corrente: " + contaCorrente.obterSaldo());

            // Criação e teste de Conta Corrente Especial
            ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial("002");
            contaCorrenteEspecial.depositar(2000);
            contaCorrenteEspecial.sacar(1000);
            System.out.println("Saldo da Conta Corrente Especial: " + contaCorrenteEspecial.obterSaldo());

            // Serialização das contas
            serializarConta(contaCorrente);
            serializarConta(contaCorrenteEspecial);

            // Desserialização das contas
            ContaCorrente contaCorrenteDesserializada = (ContaCorrente) desserializarConta("001");
            ContaCorrenteEspecial contaCorrenteEspecialDesserializada = (ContaCorrenteEspecial) desserializarConta("002");

            // Teste de exceção: tentativa de saque com saldo insuficiente
            try {
                contaCorrente.sacar(2000);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            // Teste de exceção: tentativa de saque com valor negativo
            try {
                contaCorrente.sacar(-500);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            // Teste de exceção: tentativa de saque em conta não existente
            try {
                desserializarConta("003");
            } catch (FileNotFoundException | ClassNotFoundException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro ao manipular arquivo: " + e.getMessage());
        }
    }

    private static void serializarConta(Conta conta) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(conta.getCodigo() + ".ser"))) {
            outputStream.writeObject(conta);
            System.out.println("Conta " + conta.getCodigo() + " serializada com sucesso.");
        }
    }

    private static Conta desserializarConta(String codigo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(codigo + ".ser"))) {
            Conta conta = (Conta) inputStream.readObject();
            System.out.println("Conta " + codigo + " desserializada com sucesso. Saldo: " + conta.obterSaldo());
            return conta;
        }
    }
}

