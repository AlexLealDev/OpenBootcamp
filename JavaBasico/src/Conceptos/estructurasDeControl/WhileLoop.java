package Conceptos.estructurasDeControl;

public class WhileLoop {

    public static void main(String[] args){

        int count = 0;
        while (count < 10) {
            count++;
            if (count == 6)
                break; // cuando el valor es 6 rompe el flujo de ejecución
                //continue; // salta el valor 6 y continua a la siguiente iteración

            System.out.println("Este es mi while " + count);

        }

        System.out.println("Aquí termina mi while");

    }

}
