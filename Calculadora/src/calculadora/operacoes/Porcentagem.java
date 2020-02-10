/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operacoes;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Luciana
 */
public class Porcentagem implements Calculo {

    @Override
    public BigDecimal calcular(BigDecimal valor1, BigDecimal valor2) {
        
        return valor2.multiply(valor1.divide(new BigDecimal("100"), 3, RoundingMode.HALF_UP));
    }
    
}
