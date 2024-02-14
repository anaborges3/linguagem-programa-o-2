package Funcionarios;

// Subclasse Assistente
class Assistente extends Funcionario {
    // Construtor
    public Assistente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    // Implementação do método calculaSalario para Assistente
    @Override
    public double calculaSalario() {
        return getSalario_base();
    }
}
