/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.testes;

import calculadora.operacoes.Calculo;
import calculadora.operacoes.Subtracao;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luciana
 */
public class TesteSubtracao {
    
   @Test
    public void subtracao() {
        System.out.println("Teste Subtração");
        BigDecimal valor1 = new BigDecimal("51.5");
        BigDecimal valor2 = new BigDecimal("1.5");
        Calculo calculo = new Subtracao();
        BigDecimal resultado = new BigDecimal("50.0");
        BigDecimal resultCalc = calculo.calcular(valor1, valor2);
        System.out.println("" + valor1 + " - " + valor2 + " = " + resultCalc);
        Assert.assertEquals(resultado, resultCalc);

    }
}
