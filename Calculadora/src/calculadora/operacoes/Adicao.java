/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.operacoes;

import java.math.BigDecimal;

/**
 *
 * @author Luciana
 */
public class Adicao implements Calculo {

    @Override
    public BigDecimal calcular(BigDecimal valor1, BigDecimal valor2) {
        return valor1.add(valor2);
    }

}

