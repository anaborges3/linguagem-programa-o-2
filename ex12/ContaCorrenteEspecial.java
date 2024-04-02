package ex12;

import java.io.Serializable;

class ContaCorrenteEspecial extends Conta implements Serializable {
    private static final double TAXA_OPERACAO = 0.001; // 0.1%

    public ContaCorrenteEspecial(String codigo) {
        super(codigo);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + valor * TAXA_OPERACAO);
    }
}
