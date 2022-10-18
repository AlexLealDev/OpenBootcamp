package Conceptos.objeto;

public class Coche {
    //public abstract class Coche {
    //utilizando abstract no se puede itinerar la clase Coche por lo que obligamos a que se instancien clases hijas

    //atributos (características que tiene un coche y que varían de un coche a otro)
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    //constructores (métodos especiales que nos van a permitir crear objetos dentro de la clase)
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }

    public Coche() {

    }

    //comportamiento
    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <=120){
            this.velocidad += cantidad;

        }

    }
    // esto sale si le doy al botón derecho y marco la opción Generate > ToString > y le doy a ok
    // (me crea el texto con el valor de todas las propiedades)
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}

