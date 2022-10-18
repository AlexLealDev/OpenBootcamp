package Conceptos;

public class ArraysMain {

    public static void main(String[] args) {

        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";

        String[] nombres = new String[3]; //cuando hay X posiciones definidas, recordad que hay que empezar por 0
        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        //nombres[3] = nombres; esto no lo permitiría porque nos pasamos de las posiciones definidas 0,1,2 (3 en total)
        String[] nombres2 = new String[]{nombre1,nombre2,nombre3}; // es igual a la de arriba expresada de otra forma

        System.out.println(nombres[0]);

        for (int i = 0; i < nombres.length; i++){ //se utiliza el bucle para no repetir 3 veces la función system...
            System.out.println(nombres[i]);
        }

    }


}
