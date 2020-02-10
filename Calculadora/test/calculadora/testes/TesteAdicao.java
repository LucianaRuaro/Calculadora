/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.testes;

import calculadora.operacoes.Calculo;
import calculadora.operacoes.Adicao;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Luciana
 */
public class TesteAdicao {

    @Test
    public void adicao() {
        System.out.println("Teste Adição");
        BigDecimal valor1 = new BigDecimal("10.5");
        BigDecimal valor2 = new BigDecimal("20.5");
        Calculo calculo = new Adicao();
        BigDecimal resultado = new BigDecimal("31.0");
        BigDecimal resultCalc = calculo.calcular(valor1, valor2);
        System.out.println("" + valor1 + " + " + valor2 + " = " + resultCalc);
        Assert.assertEquals(resultado, resultCalc);

    }

}
