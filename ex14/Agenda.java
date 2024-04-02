package ex14;

import java.util.ArrayList;

class Agenda {
    private ArrayList<Cliente> clientes;

    public Agenda() {
        clientes = new ArrayList<>();
    }

    public void armazenaPessoa(String nome, int idade, String telefone) throws IllegalArgumentException {
        if (clientes.size() >= 10) {
            throw new IllegalArgumentException("Agenda cheia. Não é possível adicionar mais clientes.");
        }
        clientes.add(new Cliente(clientes.size() + 1, nome, idade, telefone));
    }

    public void removePessoa(String nome) throws IllegalArgumentException {
        for (Cliente cliente : clientes) {
            if (cliente != null && cliente.getNome().equals(nome)) {
                clientes.remove(cliente);
                return;
            }
        }
        throw new IllegalArgumentException("Cliente não encontrado na agenda.");
    }

    public int buscaPessoa(String nome) throws IllegalArgumentException {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente != null && cliente.getNome().equals(nome)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Cliente não encontrado na agenda.");
    }

    public void imprimeAgenda() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void imprimePessoa(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= clientes.size()) {
            throw new IndexOutOfBoundsException("Índice fora do intervalo.");
        }
        System.out.println(clientes.get(index));
    }
}