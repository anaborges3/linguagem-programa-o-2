package ex07;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Gol", "Volkswagen", 2022, "Gasolina");
        Moto moto = new Moto("CBR 1000RR", "Honda", 2021, "Gasolina");
        Caminhao caminhao = new Caminhao("FH 540", "Volvo", 2020, "Diesel");

        // Abastecendo os veículos
        carro.abastecer(40.0);
        moto.abastecer(20.0);
        caminhao.abastecer(100.0);

        // Exibindo as informações dos veículos
        carro.exibirInformacoes();
        moto.exibirInformacoes();
        caminhao.exibirInformacoes();
    }
}

