package EjerciciosTemas789;

import java.util.Vector;

public class Tarea4Main {

    public static void main(String[] args){

        // la capacidad del vector inicialmente es 10
        Vector<Integer> vector = new Vector();
        vector.add(1);
        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        // cada vez que se sobrepasa esa capacidad, la dobla automaticamente
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        // además cada vez que dobla la capacidad copia y pega esos datos, por lo que si queremos meter 1000 datos a un
        // vector y no se ha establecido su tamaño de manera inicial, la memoria utilizada es mucho mayor debido al proceso
        // por el cuál el vector va incrementando automaticamente su capacidad.
        Vector<Integer> vector2 = new Vector(1000);
        System.out.println("Vector tamaño: " + vector2.size() + " y capacidad: " + vector2.capacity());
        // si cargamos esos 1000 datos en vector 2 no tendrá que aumentar su capacidad e ir copiando datos todo el rato
        // por lo que utilizará menos memoria.

    }

}
