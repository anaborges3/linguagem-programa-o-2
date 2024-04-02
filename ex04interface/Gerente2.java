package ex08.ex04interface;

class Gerente2 implements Funcionario2 {
    private String nome;
    private String matricula;
    private double salarioBase;

    public Gerente2(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calculaSalario() {
        return salarioBase * 2;
    }
}
