package Ejercicio11POO.Ejecutador;

import Ejercicio11POO.clases.Inventario;
import Ejercicio11POO.clases.Producto;

public class Opciones {

    public void presentar(){
        Inventario inventario = new Inventario(4);
        Producto producto1 = new Producto("teclado", 22.90, 3);
        Producto producto2 = new Producto("Mouse", 33.90, 5);
        Producto producto3 = new Producto("Monitor", 50.90, 5);
        Producto producto4 = new Producto("CPU", 300.90, 5);

        inventario.agregarProducto(producto1);

        inventario.mostrarProductos();
    }
}
