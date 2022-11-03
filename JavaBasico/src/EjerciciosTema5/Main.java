package EjerciciosTema5;

import Conceptos.objeto.Coche;

import java.io.File;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

          cocheCRUD.save();
          cocheCRUD.findAll();
          cocheCRUD.delete();

    }

}

