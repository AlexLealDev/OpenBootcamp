package Conceptos;

public class Funciones {

    //se les llamará métodos cuando estemos utilizando programación orientada a objetos
    //y se llamará funciones en aquellos casos que no

    //a continuación se ve como se puede mostrar el texto en pantalla de diferentes opciones
    /*
    1. Invocando holaMundo
    2. Invocando holaMundo + una valirable con el nombre
    3. Crear una función e imprimir su return
     */

    public static void main(String[] args) {

        holaMundo(); //holaMundo es el identificador
        String name = "Alex";
        holaMundo(name);
        System.out.println(devolverHola());

    }

    private static void holaMundo() {
        System.out.println("Hola mundo");

        // void indica el tipo de retorno
        /*
        VOID no devuelve nada, no necesita return
        String devuelve una cadena de texto
        int devulve un numero entero
        sum hace una suma
        ...
         */
        // static indica que pertenece a la clase
        // public, private y protected indican la visibilidad de la función
        /*
        public se puede acceder desde otras clases(archivos)
        private es que solo es accesible desde esta clase
        protected solo es visible por aquellas clases del mismo paquete (alexleal en este caso)
        cuando no se pone nada, también solo se puede acceder desde el paquete
         */
    }

    private static void holaMundo(String name) { //Esta parte de una función se llama signatura
        System.out.println("Hola " + name); //Esta parte de una función se llama implementación o cuerpo
    }

    protected static String devolverHola(){
        return "Hola";

    }

    // SOBRECARGA DE FUNCIONES

    // Siempre que tenga dos funciones o métodos con la misma signatura, está duplicada y no se ejecutará
    // para que se ejecute tengo que hacer sobrecarga, que consiste en ir añadiendo parametros a los argumentos
    // se puede ir haciendo tantas funciones sobrecargadas como argumentos diferentes pongamos

    /*
    private static void holaMundo(String name) {
    System.out.println("Hola " + name);
     */

    // la función anterior no se podría ejecutar porque ya hay una identica en la clase(archivo)
}
