package ex07;

public abstract class Veiculo {
    public String modelo;
    public String marca;
    public int anoFabricacao;

    public Veiculo(String modelo, String marca, int anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void abastecer(double quantidade);

    public abstract void exibirInformacoes();
}