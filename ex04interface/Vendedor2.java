package ex08.ex04interface;

class Vendedor2 implements Funcionario2 {
    private String nome;
    private String matricula;
    private double salarioBase;
    private double comissao;

    public Vendedor2(String nome, String matricula, double salarioBase, double comissao) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return salarioBase + comissao;
    }
}
