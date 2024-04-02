package ex12;

import java.io.Serializable;

class ContaCorrente extends Conta implements Serializable {
    private static final double TAXA_OPERACAO = 0.005; // 0.5%

    public ContaCorrente(String codigo) {
        super(codigo);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + valor * TAXA_OPERACAO);
    }
}
