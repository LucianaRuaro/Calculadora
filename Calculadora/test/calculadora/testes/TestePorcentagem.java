/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.testes;

import calculadora.operacoes.Calculo;
import calculadora.operacoes.Porcentagem;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luciana
 */
public class TestePorcentagem {

    @Test
    public void porcentagem() {
        System.out.println("Teste Pocentagem");
        BigDecimal valor1 = new BigDecimal("25");
        BigDecimal valor2 = new BigDecimal("100");
        Calculo calculo = new Porcentagem();
        BigDecimal resultado = new BigDecimal("25.000");
        BigDecimal resultCalc = calculo.calcular(valor1, valor2);
        System.out.println("" + valor1 + " % " + valor2 + " = " + resultCalc);
        Assert.assertEquals(resultado, resultCalc);

    }
}
