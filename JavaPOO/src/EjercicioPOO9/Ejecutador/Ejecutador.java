package EjercicioPOO9.Ejecutador;


import EjercicioPOO9.Clases.Bebida;
import EjercicioPOO9.Clases.BebidaAzucarada;
import EjercicioPOO9.Clases.BebidaMineral;
import EjercicioPOO9.Metodos.Almacen;
import EjercicioPOO9.Metodos.Msg;

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
            opcion = Msg.pedirInt(Msg.opcions);
            switch(opcion){
                case 1:
                    String nombre = Msg.pedirString(Msg.nombree);
                    double precio = Msg.pedirDouble(Msg.precio);
                    double cantidad = Msg.pedirDouble(Msg.cantidads);
                    String marca = Msg.pedirString(Msg.marca);
                    double porcentajeAzucar = Msg.pedirDouble(Msg.porcentajeAzucar);
                    boolean promocion;
                    System.out.print(Msg.promocion);
                    promocion = getting.nextBoolean();
                    bebida = new BebidaAzucarada(nombre,precio,cantidad,marca,porcentajeAzucar,promocion);
                    almacen.agregarBebida(bebida);

                    System.out.println();
                    String nombreM = Msg.pedirString("Escribe el nombre de la bebida Mineral: ");
                    double precioM = Msg.pedirDouble("Escribe el precio de la bebida Mineral: ");
                    double cantidadM = Msg.pedirDouble("Escribe el cantidad de las bebida Mineral: ");
                    String marcaM = Msg.pedirString("escribe la marca del bebida Mineral: ");
                    String nombreManantial = Msg.pedirString("Escriba el nombre del manantial natural: ");

                    bebida = new BebidaMineral(nombreM,precioM,cantidadM,marcaM,nombreManantial);
                    almacen.agregarBebida(bebida);
                    break;
                case 2:
                    int id = Msg.pedirInt(Msg.ids);
                    almacen.eliminarBebida(id);
                    break;
                case 3:
                    System.out.println(Msg.bebidasExistentes);
                    almacen.mostrarBebidas();
                    break;
                case 4:
                    System.out.println(Msg.totalDeBebida+almacen.calcularPrecioBebidas());

                    break;
                case 5:
                    System.out.println(Msg.adios);
                    opcion = 5;
                    break;
                default:
                    System.out.println(Msg.opcionNoValida);
            }
        }while (opcion != 5);
    }
}
