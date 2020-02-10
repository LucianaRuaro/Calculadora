/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.testes;

import calculadora.operacoes.Calculo;
import calculadora.operacoes.Multiplicacao;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luciana
 */
public class TesteMultiplicacao {

    @Test
    public void multiplicacao() {
        System.out.println("Teste Mutiplicacao");
        BigDecimal valor1 = new BigDecimal("5.5");
        BigDecimal valor2 = new BigDecimal("2.2");
        Calculo calculo = new Multiplicacao();
        BigDecimal resultado = new BigDecimal("12.10");
        BigDecimal resultCalc = calculo.calcular(valor1, valor2);
        System.out.println("" + valor1 + " x " + valor2 + " = " + resultCalc);
        Assert.assertEquals(resultado, resultCalc);

    }
}
