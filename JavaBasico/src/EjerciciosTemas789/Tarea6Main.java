package EjerciciosTemas789;

import java.util.ArrayList;

public class Tarea6Main {

    public static void main(String[] args){

        ArrayList<Integer> lista = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
                for (int num = 0; num < lista.size(); num++) {
                    if (lista.get(num) % 2 == 0) {
                        lista.remove(num);
                    }

                }
        }
        System.out.println(lista);
    }

}
