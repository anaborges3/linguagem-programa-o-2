package ex04.Funcionarios;

// Classe abstrata Funcionario
abstract class Funcionario {
    // Atributos
    private String nome;
    private String matricula;
    private double salario_base;

    // Construtor
    public Funcionario(String nome, String matricula, double salario_base) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario_base = salario_base;
    }

    // Método abstrato para calcular o salário
    public abstract double calculaSalario();

    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario_base() {
        return salario_base;
    }
}
