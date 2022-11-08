package EjerciciosTemas789;

import java.util.Scanner;

public class Tarea7Main {

    public static class DividePorCero{

           private static int Dividir(int a, int b) throws ArithmeticException{
               return a / b;

           }

           public static void main(String[] args){

              System.out.println("DividePorCero");

               Scanner scanner = new Scanner(System.in);
               System.out.println("Introduce el divisor y el dividendo: ");
               System.out.print("divisor: ");
               int a = scanner.nextInt();
               System.out.print("dividendo: ");
               int b = scanner.nextInt();
               try {
                   System.out.println("Resultado: " + Dividir(a, b));
               } catch (ArithmeticException e) {
                   System.out.println("Esto no puede hacerse");
               } finally {
                   System.out.println("Demo de código");
               }

           }

    }

}
