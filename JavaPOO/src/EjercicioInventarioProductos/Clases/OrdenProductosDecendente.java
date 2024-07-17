package EjercicioInventarioProductos.Clases;

import java.util.Comparator;

public class OrdenProductosDecendente implements Comparator<String> {
    @Override
    public int compare(String object1, String object2) {
        return object2.compareTo(object1);
    }
}
