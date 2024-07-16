package ColeccionHashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        // esta inteface no permite datos repetidos
        // al momento de imprimirlos los omite.
        Set<String> conjuntosHash = new HashSet<>();
        conjuntosHash.add("Peru");
        conjuntosHash.add("Colombia");
        conjuntosHash.add("Ecuador");
        conjuntosHash.add("Chile");
        conjuntosHash.add("Chile");
        conjuntosHash.add("");

        for (String valor: conjuntosHash){
            System.out.println("Pais: "+valor);
        }


        /// uso de treeSet
        // ordena los conjuntos de menor a mayor y tampoco repite los datos duplicados
        Set<String> conjuntoTree = new TreeSet<>();
        conjuntoTree.add("a-juan");
        conjuntoTree.add("a-juan");
        conjuntoTree.add("dari");
        conjuntoTree.add("elia");
        conjuntoTree.add("alan");
        System.out.println();

        for (String nombres: conjuntoTree){
            System.out.println("Nombre: "+nombres);
        }


    }
}
