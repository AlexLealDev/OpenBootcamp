package EjerciciosTemas789;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tarea5Main {

    public static void main(String[] args){

        ArrayList<String> lista = new ArrayList();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        lista.add("ElementoD");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        LinkedList<String> linkedLista = new LinkedList(lista);
        for (int i = 0; i < linkedLista.size(); i++) {
            System.out.println(linkedLista.get(i));
        }
    }
}
