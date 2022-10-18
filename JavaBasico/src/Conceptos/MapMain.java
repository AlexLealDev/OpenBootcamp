package Conceptos;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String,String> personas = new HashMap<>();
        //HashMan nos va a permitir crear un mapa de pares de clave valor en el que se pueda almacenar "personas"

        personas.put("12345678A", "Nombre A");
        personas.put("12345678B", "Nombre B");
        personas.put("12345678C", "Nombre C");

        System.out.println(personas);

        for (String key : personas.keySet()) {
            System.out.println(key);
        }
        for (String values : personas.values()) {
            System.out.println(values);
        }
        for (Map.Entry<String, String> pair: personas.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }


}
