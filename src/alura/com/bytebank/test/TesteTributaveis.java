package alura.com.bytebank.test;

import alura.com.bytebank.controller.CalculadorDeImposto;
import alura.com.bytebank.controller.SeguroDeVida;
import alura.com.bytebank.main.ContaCorrente;

public class TesteTributaveis {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(sv);

        System.out.println(calc.getTotalImposto());

    }

}
