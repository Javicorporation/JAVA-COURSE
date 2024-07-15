package ColeccionHashSet;

import java.util.HashSet;
import java.util.Set;

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
        conjuntosHash.add("Chile");


        for (String valor: conjuntosHash){
            System.out.println("Pais: "+valor);
        }
    }
}
