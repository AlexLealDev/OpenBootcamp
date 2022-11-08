package Conceptos.datosComplejos;

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

        // otra forma de expresar la array en la que se pueden definir las variables directamente
        String[] nombres2 = new String[]{"nombre 4", "nombre 5", "nombre 6"};

        System.out.println(nombres[0]);
        System.out.println(nombres2[0]);

        for (int i = 0; i < nombres.length; i++) { //se utiliza el bucle para no repetir 3 veces la función system...
            System.out.println(nombres[i]);
        }
        //versión sencilla de lo de arriba
        for (String i : nombres2) {
            System.out.println(i);
        }

        // para recorrer los arrays tenemos dos formas:
        // forma corta

        for (String nombre : nombres) {
            System.out.println("Nombre actual: " + nombre);
        }

        // forma larga

        for (int i = 0; i < nombres2.length; i++) {
            System.out.println("Nombre actual: " + nombres2[i]);
        }

        // los arrays pueden ser de más de una dimensión
        // ejemplo de un array bidimensional

        String nombresApellidos[][] = new String[2][3];
        nombresApellidos[0][0] = "nombre 7";
        nombresApellidos[0][1] = "nombre 8";
        nombresApellidos[0][2] = "nombre 9";
        nombresApellidos[1][0] = "apellido 1";
        nombresApellidos[1][1] = "apellido 2";
        nombresApellidos[1][2] = "apellido 3";

        // la forma fácil de inicializar los arrays bidimensional es:

        String nombresApellidos2[][] = {
                {"nombre 10", "nombre 11", "nombre 12",},
                {"apellido 4", "apellido 5", "apellido 6"}
        };

        for (int i = 0; i < nombresApellidos.length; i++) {
            System.out.println("Valor de i: " + i);

            for (int j = 0; j < nombresApellidos[1].length; j++) { //no entiendo para que sirve el [1]
                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println(nombresApellidos[i][j]);
            }
        }
    }
}
