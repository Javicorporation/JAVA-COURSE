package EjercicioInventarioProductos.Ejecutador;

import EjercicioInventarioProductos.Clases.OrdenProductosAccendente;
import EjercicioInventarioProductos.Clases.OrdenProductosDecendente;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejecutador {
    private final Scanner getting = new Scanner(System.in);
    HashMap<String,Integer> inventario = new HashMap<>();
    TreeMap<String,Integer> inventarioOrdenado;


    public void ejecutar() {
        getting.useDelimiter("\n");
        int opcion = 0;

        do {
            System.out.println("\n Seleccione una opcion....");
            System.out.println("1. Añadir productos");
            System.out.println("2. Aumentar Stock de un producto");
            System.out.println("3. Eliminar Stock de un producto");
            System.out.println("4. Listar productos y su stock");
            System.out.println("5. Eliminar un producto");
            System.out.println("6. Ordenar productos ascendentemente");
            System.out.println("7. Ordenar productos descendentemente");
            System.out.println("8. Salir");


            try {
                System.out.println("Digite una opcion: ");
                opcion = getting.nextInt();

                String producto;
                int stock;
                int stockActual = 0;

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un producto: ");
                        producto = getting.next();
                        // el .containsKey sirve para verificar si algo ya existe
                        if (inventario.containsKey(producto)) {
                            System.out.println("El producto ya existe");
                        }else {
                            inventario.put(producto,0);
                            System.out.println("El producto no existe");
                        }
                        break;
                    case 2:
                        System.out.println("Escriba el nombre del producto: ");
                        producto = getting.next();
                        if (inventario.containsKey(producto)) {
                            System.out.println("Digite la contidad: ");
                            stock = getting.nextInt();
                            if (stock > 0) {
                                stockActual = inventario.get(producto);
                                inventario.put(producto,stockActual + stock);
                                System.out.println("Se a añadido "+stock+" de stock "+stockActual);
                            }else {
                                System.out.println("no se puede añadir un stock negativo");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("ingrese el nombre del producto: ");
                        producto = getting.next();
                        if (inventario.containsKey(producto)) {
                            System.out.println("digite el stok a eliminar: ");
                            stock = getting.nextInt();
                            if (stock > 0) {
                                stockActual = inventario.get(producto);
                                if (stockActual > stock) {
                                    inventario.put(producto, stockActual-stock);
                                }else{
                                    System.out.println("No hay stok a eliminar");
                                }
                            }else{
                                System.out.println("no se puede eliminar un stock negativo");
                            }
                        }else{
                            System.out.println("no exisste producto");
                        }
                        break;
                    case 4:
                        for (String product: inventario.keySet()){
                            stock = inventario.get(product);
                            System.out.println();
                            System.out.println("clave: "+product);
                            System.out.println("stock: "+stock);
                        }
                        break;
                    case 5:
                        System.out.println("ingrese el nombre del producto: ");
                        producto = getting.next();
                        if (inventario.containsKey(producto)) {
                            inventario.remove(producto);
                            System.out.println("El producto fue eliminado con exito");
                        }else{
                            System.out.println("el producto no existe");
                        }
                        break;
                    case 6:
                        inventarioOrdenado = new TreeMap<>(new OrdenProductosAccendente());
                        inventarioOrdenado.putAll(inventario);

                        for (String i: inventarioOrdenado.keySet() ){
                            stock = inventarioOrdenado.get(i);
                            System.out.println();
                            System.out.println("clave: "+i);
                            System.out.println("stock: "+stock);
                        }
                        break;
                    case 7:
                        inventarioOrdenado = new TreeMap<>(new OrdenProductosDecendente());
                        inventarioOrdenado.putAll(inventario);
                        for (String i: inventarioOrdenado.keySet() ){
                            stock = inventarioOrdenado.get(i);
                            System.out.println();
                            System.out.println("clave: "+i);
                            System.out.println("stock: "+stock);
                        }
                        break;
                    case 8:
                        System.out.println("Gracias");
                        opcion = 8;
                        break;
                    default:
                        System.out.println("Opcion no valida");

                }

            }catch (InputMismatchException e){
                System.out.println();
                System.out.println("Opcion no valida, ingrese un numero");
                getting.next();
            }

        }while (opcion != 8);


    }
}
