package Conceptos.entradaYsalida;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {


            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduce dos números...");
                scanner.reset();
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Los números introducidos no son correctos");
                }
            } while (!ok);


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner2.nextLine(); //nos permite leer un texto
        System.out.println("Introduce un número");
        int numero = scanner2.nextInt(); //nos permite leer un numero

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El número introducido es: " + numero);

    }

}
