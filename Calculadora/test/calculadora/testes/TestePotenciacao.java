/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.testes;

import calculadora.operacoes.Calculo;
import calculadora.operacoes.Potenciacao;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luciana
 */
public class TestePotenciacao {
    
     @Test
    public void potencia() {
        System.out.println("Teste Potencia");
        BigDecimal valor1 = new BigDecimal("2");
        BigDecimal valor2 = new BigDecimal("3");
        Calculo calculo = new Potenciacao();
        BigDecimal resultado = new BigDecimal("8");
        BigDecimal resultCalc = calculo.calcular(valor1, valor2);
        System.out.println("" + valor1 + " ^ " + valor2 + " = " + resultCalc);
        Assert.assertEquals(resultado, resultCalc);

    }
}
