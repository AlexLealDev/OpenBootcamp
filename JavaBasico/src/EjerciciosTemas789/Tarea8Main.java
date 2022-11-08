package EjerciciosTemas789;

import java.io.*;
import java.util.Scanner;

public class Tarea8Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("El fichero de origen es: ");
        String fileIn = scanner.nextLine();
        System.out.println("El fichero de salida es: ");
        String fileOut = scanner.nextLine();
        copy(fileIn, fileOut);
    }

    private static void copy(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream("fileIn");
            byte[] datos = in.readAllBytes();
            PrintStream out = new PrintStream("fileOut");
            out.write(datos);
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }

    }
}