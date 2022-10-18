package Conceptos;

public class Operadores {

    public static void main(String[] args) {

        //OPERADORES

        //aritmeticos

        /*
        + suma
        - resta
        * multiplicación
        / división
        % resto (para saber el resto de una división)
         */

        int number1 = 5;
        int number2 = 2;

        int resultado = number1 + number2;
        resultado = number1 - number2;

        /*si quiero repetir variable no puedo poner el int por que la duplicaría
        en cambio si le quito el int lo que estoy haciendo es sobreescribir esa variable
        una forma alternativa de hacerlo es numerar los resultados */

        int resultado1 = number1 + number2;
        int resultado2 = number1 - number2;
        int resultado3 = number1 * number2;
        int resultado4 = number1 / number2;
        // si la división da decimales y estamos utilizando un int el resto se perdería
        double resultado5= number1 / number2;
        // la solución a ese problema se evita con float o double

        //lógicos, relación, comparación, booleanos

        /*
        > mayor
        >= mayor o igual
        < menor
        <= menor o igual
        == número igual a otro
        != número es diferente a otro
        && para comprobar si se cumple una cosa y la otra (and)
        || para comprobar si se cumple una cosa o la otra (or)
        ! para negar un valor
         */

        //asignación

        /*
        = para asignar (== era para comparar)
        += haces la suma y a la vez asignas el resultado
        -= haces la resta y a la vez asignas el resultado
        /= haces la división y a la vez asignas el resultado
        *= haces la multiplicación y a la vez asignas el resultado
        %= obtienes el resto y a la vez asignas el resultado

         */

        //incremento, decremento y concatenación

        /*
        ++ incremento (le suma un valor)
        -- decremento (le resta un valor)
        + concatenación (une dos strings)
         */

    }

}
