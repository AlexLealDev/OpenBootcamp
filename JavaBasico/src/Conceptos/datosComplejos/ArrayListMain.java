package Conceptos.datosComplejos;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListMain {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        System.out.println("El arraylist es: " + lista);
        lista.remove("ElementoB");
        //lista.remove(1); este es igual al de arriba pero se utiliza el número en la cadena en vez del dato
        System.out.println("El arraylist es: " + lista);
        for (String nombre : lista) {
            System.out.println(nombre);
        }
        // tanto en el vector como en el arraylist no se puede hacer lista[i], sino lista.get(i)
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // convertir arraylist en un array
        String array[] = new String[lista.size()]; // aquí definimos que el array va a tener el tamaño del arraylist original
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }
        for (String elemento : array) {
            System.out.println("El elemento es: " + elemento);
        }

        // LinkedList funciona igual que una ArrayList
        // Hay 3 diferencias:
        // 1. El ArrayList utiliza una Array de forma subyacente y la LinkedList utiliza una estructura de datos que se
        // llama lista doblemente enlazada. La ArrayList es mucho más rápida para almacenar y buscar datos. La LinkedList
        // es mucho más rápida cuando queremos modificar datos.
        // 2. El ArrayList deriva de la clase List, por lo que hereda sus elementos. La LinkedList implementa tanto la interface
        // listas como la interface "deque?", por lo que se puede implementar la LinkedList para implementar colas
        // 3. Se puede crear una LinkedList partiendo de una ArrayList:

        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);



    }

}
