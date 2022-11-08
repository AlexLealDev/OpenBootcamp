package Conceptos.datosComplejos;

import java.util.HashMap;
import java.util.Map;

public class MapasMain {

    public static void main(String[] args) {

        // Un mapa es una especie de diccionario donde tengo una clave y un valor. Ese valor puede ser otro mapa o cualquier
        // tipo de dato. La forma más primitiva de mapa es el hashmap

        HashMap<String, Integer> map = new HashMap<>();
        // Al poner primero String decimos que la clave va a ser una cadena de texto y el Integer nos define que los valores
        // van a ser números enteros.
        // Las claves de los mapas no se pueden repetir.
        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);
        map.put("clave4", 40);
        map.put("clave5", 50);
        System.out.println(map.toString());
        System.out.println(map.get("clave1"));
        map.replace("clave4", 41);
        map.replace("clave6",60);
        System.out.println(map.toString());
        // al imprimir el 41 se reemplaza, pero no se añade la clave 6 porque no existe previamente
        map.remove("clave1");
        System.out.println(map.toString());
        //recorrerr un mapa usando FOR
        for (Map.Entry elemento : map.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey() + " y su valor es : " + elemento.getValue());
            }

        // HashMap es un tipo de mapa, pero hay muchos tipos de mapas.
        // Ejemplos: InterfaceMap, TreeMap (arbol rojo/negro binario), etc.

    }
}
