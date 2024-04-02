package ex12;

import java.io.Serializable;

abstract class Conta implements Serializable {
    private String codigo;
    private double saldo;

    public Conta(String codigo) {
        this.codigo = codigo;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }

    public double obterSaldo() {
        return saldo;
    }

    public String getCodigo() {
        return codigo;
    }
}
