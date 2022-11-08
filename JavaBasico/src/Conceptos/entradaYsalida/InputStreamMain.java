package Conceptos.entradaYsalida;

import java.io.*;

public class InputStreamMain {

    public static void main(String[] args) {

        // Lo siguiente es una forma de meter un fichero entero en memoria
        try {
            InputStream fichero = new FileInputStream("ficheroPrueba"); // donde pone ficheroPrueba deberíamos meter
            // la dirección de un fichero existente
            try {
                byte[] datos = fichero.readAllBytes();

                for (byte dato : datos) { // este for nos permite mostrar el contenido del fichero
                    System.out.println((char) dato);
                }
            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }

        //

        // Pero readAllBytes es problemático parar ficheros grandes, por lo que en la siguiente forma utilizamos solo read:
        try {
            InputStream fichero = new FileInputStream("ficheroPrueba"); // donde pone ficheroPrueba deberíamos meter
            // la dirección de un fichero existente
            try {
                int dato = fichero.read();
                while (dato != -1) {
                    System.out.println((char) dato);
                    dato = fichero.read();
                }
            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }

        //

        // El problema de read a secas es que lee palabra a palabra por lo que puede hacer más lenta la operación
        // Así que existe una opción intermedia con BufferedInputStream
        try {
            InputStream fichero = new FileInputStream("ficheroPrueba"); // donde pone ficheroPrueba deberíamos meter
            // la dirección de un fichero existente
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try {
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.println((char) dato);
                    dato = ficheroBuffer.read();
                }
            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }

    }
}
