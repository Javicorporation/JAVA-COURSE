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



    }
}
