package Conceptos.interfaces;

import Conceptos.objeto.Coche;
import Conceptos.objeto.CocheElectrico;

public class CocheServiceSportImpl implements CocheService{

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruir coche de carreras");
    }
}
