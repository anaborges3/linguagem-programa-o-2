package ex07interface;

interface Veiculo {
    void abastecer(double quantidade);
    void exibirInformacoes();
}

class Carro implements Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private String tipoCombustivel;

    public Carro(String modelo, String marca, int anoFabricacao, String tipoCombustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void abastecer(double quantidade) {
        System.out.println("Abastecendo carro com " + quantidade + " litros de " + tipoCombustivel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}

class Moto implements Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private String tipoCombustivel;

    public Moto(String modelo, String marca, int anoFabricacao, String tipoCombustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void abastecer(double quantidade) {
        System.out.println("Abastecendo moto com " + quantidade + " litros de " + tipoCombustivel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}

class Caminhao implements Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private String tipoCombustivel;

    public Caminhao(String modelo, String marca, int anoFabricacao, String tipoCombustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void abastecer(double quantidade) {
        System.out.println("Abastecendo caminhão com " + quantidade + " litros de " + tipoCombustivel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Gol", "Volkswagen", 2020, "Gasolina");
        Veiculo moto = new Moto("Honda CG 125", "Honda", 2022, "Gasolina");
        Veiculo caminhao = new Caminhao("Scania P 360", "Scania", 2023, "Diesel");

        carro.abastecer(40);
        moto.abastecer(10);
        caminhao.abastecer(100);

        System.out.println("\nInformações do Carro:");
        carro.exibirInformacoes();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacoes();

        System.out.println("\nInformações do Caminhão:");
        caminhao.exibirInformacoes();
    }
}

