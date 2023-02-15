package alura.com.bytebank.test;

import alura.com.bytebank.main.ContaCorrente;
import alura.com.bytebank.main.ContaPoupanca;

public class TestaContas {

    public static void main(String[] args) {

        final ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100);

        final ContaPoupanca cp = new ContaPoupanca(222,222 );
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println(" Saldo da conta corrente " + cc.getSaldo());
        System.out.println(" Saldo da conta poupanca " + cp.getSaldo());
    }

}
