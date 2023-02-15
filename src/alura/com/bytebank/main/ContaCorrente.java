package alura.com.bytebank.main;

import alura.com.bytebank.main.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override public boolean saca(final double valor) {
        double valorASacar = valor +0.2;
        return super.saca(valorASacar);
    }

}
