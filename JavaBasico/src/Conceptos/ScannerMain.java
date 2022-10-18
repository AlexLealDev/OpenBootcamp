package Conceptos;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //system.in lee los datos de entrada
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine(); //nos permite leer un texto
        System.out.println("Introduce un número");
        int numero = scanner.nextInt(); //nos permite leer un numero

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El número introducido es: " + numero);

    }

}
