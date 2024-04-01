package ex07;

public class Carro extends Veiculo {
    private String tipoCombustivel;

    public Carro(String modelo, String marca, int anoFabricacao, String tipoCombustivel) {
        super(modelo, marca, anoFabricacao);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void abastecer(double quantidade) {
        System.out.println("Abastecendo carro com " + quantidade + " litros de " + tipoCombustivel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Carro: " + marca + " " + modelo + ", ano " + anoFabricacao + ", combustível: " + tipoCombustivel);
    }
}

public class Moto extends Veiculo {
    private String tipoCombustivel;

    public Moto(String modelo, String marca, int anoFabricacao, String tipoCombustivel) {
        super(modelo, marca, anoFabricacao);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void abastecer(double quantidade) {
        System.out.println("Abastecendo moto com " + quantidade + " litros de " + tipoCombustivel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Moto: " + marca + " " + modelo + ", ano " + anoFabricacao + ", combustível: " + tipoCombustivel);
    }
}

public class Caminhao extends Veiculo {
    private String tipoCombustivel;

    public Caminhao(String modelo, String marca, int anoFabricacao, String tipoCombustivel) {
        super(modelo, marca, anoFabricacao);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void abastecer(double quantidade) {
        System.out.println("Abastecendo caminhão com " + quantidade + " litros de " + tipoCombustivel);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Caminhão: " + marca + " " + modelo + ", ano " + anoFabricacao + ", combustível: " + tipoCombustivel);
    }
}


