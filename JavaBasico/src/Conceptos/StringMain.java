package Conceptos;

public class StringMain {

    public static void main(String[] args){

        // La clase String

        /*
            length();
            startsWith("");
            endsWith("");
            indexOf("");
            subString(1.5);
            trim();
            equals("");
            compareTo("");

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


    }

}
