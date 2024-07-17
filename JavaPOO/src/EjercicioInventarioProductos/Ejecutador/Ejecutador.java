package EjercicioInventarioProductos.Ejecutador;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejecutador {
    private final Scanner getting = new Scanner(System.in);
    HashMap<Integer,String> inventario = new HashMap<>();
    TreeMap<Integer,String> tree;


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
                int stock, stockActual;

                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
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
