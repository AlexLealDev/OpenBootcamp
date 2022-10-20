package EjerciciosTema2;

import java.util.Scanner;

public class EjerciciosTema2 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un numero");
    double numero = scanner.nextDouble();
    double iva = numero * 0.21;
    double suma = numero + iva;
    System.out.println("El resultado con IVA es: " + suma);

    }

}
