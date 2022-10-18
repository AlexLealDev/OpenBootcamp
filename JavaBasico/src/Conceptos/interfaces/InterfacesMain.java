package Conceptos.interfaces;

import Conceptos.objeto.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

    CocheService service1 = new CocheServiceClassicImpl();
    CocheService service2 = new CocheServiceSportImpl();

    Coche coche1 = service1.crearCocheDemo();
    Coche coche2 = service2.crearCocheDemo();

    // otra forma de ejecutarlo sería la siguiente:

    CocheService service = new CocheServiceClassicImpl();
    // según utilicemos CocheServiceClassicImpl o CocheServiceSportImpl imprimirá una cosa u otra
    Coche coche = service.crearCocheDemo();
    

    }
}
