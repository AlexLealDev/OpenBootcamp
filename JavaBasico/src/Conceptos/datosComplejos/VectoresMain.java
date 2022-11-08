package Conceptos.datosComplejos;

import java.util.Vector;

public class VectoresMain {

    // Los vectores son como arrays pero no hay que darles un tamaño inicial o final si no se quiere o no se sabe
    // porque los vectores se ajustan a los

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(); // Integer en vez de int pero no se por qué
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("datos del vector " + vector);

        vector.remove(4); // borra la cuarta posición del array subyacente del vector, el 5
        System.out.println("datos del vector " + vector);

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        // el vector en este punto tiene un tamaño de 4 y una capacidad de 10, pero si añadimos más valores:
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        // aquí vemos que al añadir más valores aumenta automáticamente su capacidad, nunca nos vamos a quedar sin capacidad
        // La capacidad de los vectores por defecto es 10 y se va ampliando de 10 en 10, pero esa ampliación es un proceso costoso
        // en cuanto a consumo, por lo que es interesante meter manualmente la capacidad del vector si sabemos que va a ser
        // grande para que no esté todo el rato copiando.

        Vector<Integer> vector2 = new Vector(50,10);
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);
        System.out.println("datos del vector " + vector2);
        System.out.println("Vector tamaño: " + vector2.size() + " y capacidad: " + vector2.capacity());
        // añadimos capacidad del vector 50, pero eso significa que cada vez que se desborda la capacidad se dobla. Para
        // que no sea tan grande la capacidad al desbordarse, le añadimos el segundo dato de 15 para que cuando se desborde
        // solo aumente 15 la capacidad y no tenga un tamano muy grande.

        // con los vectores se pueden hacer las mismas cosas que con los arrays
        boolean resultado = vector.equals(vector2); // así se comparan 2 vectores
            System.out.println("Son iguales? " + resultado);
        for (int i : vector) {
            System.out.println("Valor actual en el vector: " + i);
        }
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Valor es: " + vector.get(i) + " en posición" + i);
        }
        for (int i = 0; i < vector.size(); i++) {
            if ( i % 2 == 0) { // con esta operación quitamos los pares
                vector.remove(i);
                continue;
            }
            System.out.println("Valor es: " + vector.get(i) + " en posición" + i);
        }

        vector2.trimToSize(); // con esta operación ajustamos el tamaño del vector al tamaño de sus elementos. Ojo, también
        // es una operación costosa.
        System.out.println("Vector tamaño: " + vector2.size() + " y capacidad: " + vector2.capacity());

    }

}
