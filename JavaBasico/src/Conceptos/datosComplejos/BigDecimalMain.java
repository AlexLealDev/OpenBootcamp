package Conceptos.datosComplejos;

import java.math.BigDecimal;

public class BigDecimalMain {

    public static void main(String[] args) {

        // Hay calculos que requieren una gran precisión, para esos cálculos no haremos operacioens con float
        // ni doble, sino que utilizaremos la función big decimal.

        BigDecimal valorA = new BigDecimal(3);
        BigDecimal valorB = new BigDecimal(4);
        //valorA.multiply(valorB); //
        BigDecimal resultado = valorA.add(valorB); // suma de dos valores
        System.out.println(resultado.toString());



    }

}
