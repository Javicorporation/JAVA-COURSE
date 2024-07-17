package Diccionarios;

import java.util.*;

public class TestDiccionario {
    public static void main(String[] args) {

        // Implementación de HashMap
        // normalmente, necesita una llave y un valor
        // esta colección se basa en llaves y valor
        // por lo que si tienen el mismo valor, pero diferentes llaves el valor se guarda en otro espacio de memoria
        // pero si tienen la misma llave omite todos y toma el último
        Map<Integer, String> diccionarioHash = new HashMap<>();
        diccionarioHash.put(1,"hola"); // put es para agregar
        diccionarioHash.put(2,"que tal"); // put es para agregar
        diccionarioHash.put(3,"como estas"); // put es para agregar
        diccionarioHash.put(4,"babosa"); // put es para agregar

        for (Map.Entry<Integer, String> nombreX: diccionarioHash.entrySet()){
            System.out.println("Este es el valor: "+nombreX.getValue()+", Esta es la llave: "+nombreX.getKey());
        }
        System.out.println();



        // Implementación de TreeMap
        // normalmente, necesita una llave y un valor
        // esta coleccion ordena las llaves  y pasa lo mismo con los valores de llaves repetidas
        Map<Integer, String> diccionarioTreeMap = new TreeMap<>();
        diccionarioTreeMap.put(4,"hola");
        diccionarioTreeMap.put(2,"que tal");
        diccionarioTreeMap.put(3,"como estas");
        diccionarioTreeMap.put(4,"babosa");

        for(Map.Entry<Integer, String> nombre: diccionarioTreeMap.entrySet()){
            System.out.println("Clave: "+nombre.getKey()+", valor: "+nombre.getValue());
        }

        // Implementación de LinkedHashMap
        //
        Map<Integer,String> diccionarioLinkedHashMap = new LinkedHashMap<>();
        diccionarioLinkedHashMap.put(4,"hola");
        diccionarioLinkedHashMap.put(2,"que tal");
        diccionarioLinkedHashMap.put(3,"como estas");
        diccionarioLinkedHashMap.put(4,"babosa");

        for (Map.Entry<Integer, String> nombres: diccionarioHash.entrySet()){
            System.out.println("Clave: "+nombres.getKey()+", valor: "+nombres.getValue());
        }


    }
}
