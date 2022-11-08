package Conceptos.datosComplejos;

public class StringMain {

    public static void main(String[] args){

        // La clase String

        /*
            length(); // para saber la longitud de la string
            startsWith(""); // booleano que devuelve si empieza o no con unos determinados caracteres
            endsWith(""); // booleano que devuelve si termina o no con unos determinados caracteres
            indexOf("");
            subString(1.5);
            trim(); // elimina los espacios delante
            equals(""); // booleano que devuelve si es igual o no a otra string
            equalsIgnoreCase(""); // booleano que devuelve si es igual o no a otra string sin tener en cuenta mayúsculas
            compareTo("");
            toUpperCase(""); // cambia la string a mayúsculas
            toLowerCase(""); // cambia la string a minúsculas
            charAt(0); // nos dice que carácter hay en la posición 0 de una String, el 0 se puede cambiar por cualquier valor


        */

        String mensaje = "  Hola Mundo  ";

        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());
        mensajeMay = mensajeMay.trim();

        //String otro = "HOLA MUNDO";
        //if (mensajeMay.equals(otro)){
        //    System.out.println("Verdadero!");
        //

        String otro = "hola mundo";
        if (mensajeMay.equalsIgnoreCase(otro)){ //en este caso no se tendrían en cuenta las mayúsculas
            System.out.println("Verdadero!");
        }

        // Para recorrer una cadena de texto
        for (int i = 0; i < mensaje.length(); i++) {
            System.out.println("Caracter actual: " + mensaje.charAt(i));
        }

    }

}
