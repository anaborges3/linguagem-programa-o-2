package ex07;

public class Moto extends Veiculo {
    public String tipoCombustivel;

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

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
