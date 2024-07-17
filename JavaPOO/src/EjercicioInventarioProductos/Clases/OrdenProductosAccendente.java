package EjercicioInventarioProductos.Clases;

import java.util.Comparator;

public class OrdenProductosAccendente implements Comparator<String> {
    @Override
    public int compare(String object1, String object2) {
        return object1.compareTo(object2);
    }
}
