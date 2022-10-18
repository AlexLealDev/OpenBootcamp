package Conceptos;

import Conceptos.objeto.Coche;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    //List en una interface, por lo que necesita una implementación

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<String>(); // Así habremos creado una lista dinámica de strings

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for(String nombre: nombres){
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList();

        //coches.add(new Coche(fabricante:"yo")); no funciona porque la variable no es local
        //System.out.println(coches);

        //for(Coche coche : coches) {
        //    System.out.println(coche);
        //}
    }

}
