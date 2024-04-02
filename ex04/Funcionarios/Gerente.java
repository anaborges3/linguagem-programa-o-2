package ex04.Funcionarios;

// Subclasse Gerente
class Gerente extends Funcionario {
    // Construtor
    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base);
    }

    // Implementação do método calculaSalario para Gerente
    @Override
    public double calculaSalario() {
        return 2 * getSalario_base();
    }
}
