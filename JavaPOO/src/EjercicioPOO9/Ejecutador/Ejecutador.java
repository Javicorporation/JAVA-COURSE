package EjercicioPOO9.Ejecutador;

import EjercicioPOO9.Clases.Bebida;
import EjercicioPOO9.Clases.BebidaAzucarada;
import EjercicioPOO9.Clases.BebidaMineral;
import EjercicioPOO9.Metodos.Almacen;

import java.util.Scanner;

public class Ejecutador {
    public final Scanner getting = new Scanner(System.in);

    public void presentar(){
        int opcion;
        Bebida bebida;
        Almacen almacen = new Almacen();

        do {
            System.out.println("Menu");
            System.out.println("1. Agregar Bebida");
            System.out.println("2. Eliminar Bebida");
            System.out.println("3. Mostrar Bebidas");
            System.out.println("4. Calcular Bebidas");
            System.out.println("5. Salir");
            System.out.print("Escribe una opcion: ");
            opcion = getting.nextInt();
            switch(opcion){
                case 1:
                    String nombre;
                    double precio;
                    double cantidad;
                    String marca;
                    double porcentajeAzucar;
                    boolean promocion;
                    System.out.print("Escribe el nombre de la bebida: ");
                    nombre = getting.next();
                    System.out.print("Escribe el precio de la bebida: ");
                    precio = getting.nextDouble();
                    System.out.print("Escribe el cantidad de las bebida: ");
                    cantidad = getting.nextDouble();
                    System.out.print("escribe la marca del bebida: ");
                    marca = getting.next();
                    System.out.print("Escribe el porcentaje de azucar de bebida: ");
                    porcentajeAzucar = getting.nextDouble();
                    System.out.print("la bebida tiene Promocion: ");
                    promocion = getting.nextBoolean();
                    bebida = new BebidaAzucarada(nombre,precio,cantidad,marca,porcentajeAzucar,promocion);
                    almacen.agregarBebida(bebida);

                    System.out.println();
                    String nombreM;
                    double precioM;
                    double cantidadM;
                    String marcaM;
                    String nombreManantial;
                    System.out.print("Escribe el nombre de la bebida Mineral: ");
                    nombreM = getting.next();
                    System.out.print("Escribe el precio de la bebida Mineral: ");
                    precioM = getting.nextDouble();
                    System.out.print("Escribe el cantidad de las bebida Mineral: ");
                    cantidadM = getting.nextDouble();
                    System.out.print("escribe la marca del bebida Mineral: ");
                    marcaM = getting.next();
                    System.out.print("Escriba el nombre del manantial natural: ");
                    nombreManantial = getting.next();

                    bebida = new BebidaMineral(nombreM,precioM,cantidadM,marcaM,nombreManantial);
                    almacen.agregarBebida(bebida);
                    break;
                case 2:
                    System.out.println("Escribe el ID de la bebida a eliminar: ");
                    int id = getting.nextInt();
                    almacen.eliminarBebida(id);
                    break;
                case 3:
                    System.out.println("Estas son las bebidas que existen: ");
                    almacen.mostrarBebidas();
                    break;
                case 4:
                    System.out.println("El total de las bebidas es: "+almacen.calcularPrecioBebidas());

                    break;
                case 5:
                    System.out.println("Adios");
                    opcion = 5;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion != 5);
    }
}
