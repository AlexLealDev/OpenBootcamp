package Conceptos.interfaces;

import Conceptos.objeto.Coche;
import Conceptos.objeto.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService{


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clásico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruir coche clásico");
    }
}
