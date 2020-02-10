/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.testes;

import calculadora.operacoes.Calculo;
import calculadora.operacoes.Divisao;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luciana
 */
public class TesteDivisao {
    
    @Test
    public void divisao() {
        System.out.println("Teste Divisão");
        BigDecimal valor1 = new BigDecimal("10");
        BigDecimal valor2 = new BigDecimal("2");
        Calculo calculo = new Divisao();
        BigDecimal resultado = new BigDecimal("5");
        BigDecimal resultCalc = calculo.calcular(valor1, valor2);
        System.out.println("" + valor1 + " / " + valor2 + " = " + resultCalc);
        Assert.assertEquals(resultado, resultCalc);

    }
}
