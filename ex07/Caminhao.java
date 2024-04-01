package ex07;

public class Caminhao extends Veiculo {
    public String tipoCombustivel;

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

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}