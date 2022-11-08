package Conceptos.errores;

import java.util.Scanner;

public class ThrowMain {

    // Throw se utiliza para generar una excepción
    // Throws se utiliza para declarar que una función devuelve excepciones

   public static void main(String[] args) {
        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que lee nombres de consola y verifica que tengan longitud igual o mayor que 8 carácteres
     * @throws NameFormatException
     */
    private static void leerNombres() throws NameFormatException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() <8){
                teclado.close();
                throw new NameFormatException("El nombre debe contener mínimo 8 carácteres");
                }
        }
        teclado.close();

    }

}
