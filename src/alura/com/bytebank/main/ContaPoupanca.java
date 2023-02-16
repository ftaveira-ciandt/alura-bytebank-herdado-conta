package alura.com.bytebank.main;



public class ContaPoupanca extends Conta {

    public ContaPoupanca (int agencia, int numero) {
        super(agencia, numero);
    }

    @Override public void deposita(final double valor) {
        super.saldo += valor;

    }

}
