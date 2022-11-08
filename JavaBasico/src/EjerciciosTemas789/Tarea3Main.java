package EjerciciosTemas789;

import java.util.Vector;

public class Tarea3Main {

    public static void main(String[] args){

        Vector<String> vector = new Vector();
        vector.add("primerElemento");
        vector.add("segundoElemento");
        vector.add("tercerElemento");
        vector.add("cuartoElemento");
        vector.add("quintoElemento");
        vector.remove(1);
        vector.remove(1);
        System.out.println(vector);

    }

}
