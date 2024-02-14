package Funcionarios;

// Subclasse Vendedor
class Vendedor extends Funcionario {
    private double comissao;

    // Construtor
    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base);
        this.comissao = comissao;
    }

    // Implementação do método calculaSalario para Vendedor
    @Override
    public double calculaSalario() {
        return getSalario_base() + comissao;
    }
}
