package Conceptos.entradaYsalida;

import java.io.*;

public class PrintStreamMain {

    public static void main (String[] args){

        // Esto debería copiar un fichero en otro fichero

        try{
            InputStream in = new FileInputStream("Hola.txt");
            byte[]  datos = in.readAllBytes();
            in.close(); // esta es una buena práctica, cerrar ficheros que abrimos
            PrintStream out = new PrintStream("Hola2.txt");
            out.write(datos);
            in.close(); // ojo con posible error si cerramos el fichero antes de escribirlo
        } catch (Exception e){
            System.out.println("Excepción: " + e.getMessage());
        }

    }

}
