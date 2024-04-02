package ex08.ex04interface;

class Assistente2 implements Funcionario2 {
    private String nome;
    private String matricula;
    private double salarioBase;

    public Assistente2(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calculaSalario() {
        return salarioBase;
    }
}
