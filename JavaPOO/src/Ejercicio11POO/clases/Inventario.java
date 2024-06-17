package Ejercicio11POO.clases;

public class Inventario {
    private Producto[] productos;
    private int contador;


    public Inventario(int tamaño) {
        productos = new Producto[tamaño];
        contador = 0;
    }

    public void agregarProducto(Producto producto){
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
        }else{
            System.out.println("El inventario ya esta lleno");
        }
    }

    public void eliminarProducto(String nombre){
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                productos[i] = productos[contador-1];
                productos[contador-1] = null;
                contador--;
                return;

            }
        }
        System.out.println("El producto no encontrado.");
    }

    public Producto buscarProducto(String nombre){
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                return productos[i];
            }
        }
        return null;
    }

    public void mostrarProductos(){
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }
    }

}
