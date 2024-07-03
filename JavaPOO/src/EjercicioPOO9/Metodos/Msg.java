package EjercicioPOO9.Metodos;

import java.util.Scanner;

public class Msg {
    public static final Scanner getting = new Scanner(System.in);
    public static final String bebidaGuardada = "Bebida guardada";
    public static final String bebidaNoGuardada = "Bebida no guardada";
    public static final String bebidaEliminada = "Bebida eliminada";
    public static final String bebidaNoEliminada = "La bebida no ha sido eliminada";
    public static final String nombree = "Escribe el nombre de la bebida: ";
    public static final String precio = "Escribe el precio de la bebida: ";
    public static final String cantidads = "Escribe el cantidad de las bebida: ";
    public static final String marca = "Escribe la marca del bebida: ";
    public static final String porcentajeAzucar = "Escribe el porcentaje de azucar de bebida: ";
    public static final String promocion = "La bebida tiene Promocion: ";
    public static final String ids = "Escribe el ID de la bebida a eliminar: ";
    public static final String bebidasExistentes = "Estas son las bebidas que existen: ";
    public static final String totalDeBebida = "El total de las bebidas es: ";
    public static final String adios = "Adios";
    public static final String opcionNoValida = "Opcion no valida";
    public static final String opcions = "Escribe una opcion: ";

    public static int pedirInt(String message){
        int valor = 0;
        boolean valido;
        do {
            System.out.print(message);
            if (getting.hasNextInt()){
                valor = getting.nextInt();
                valido = true;
            }else {
                System.out.println("Error, el valor ingresado no es un numero o es un valor negativo");
                getting.next();
                valido = false;
            }
        }while (!valido);
        return valor;
    }

    public static double pedirDouble(String message){
        double valor = 0;
        boolean valido;
        do {
            System.out.print(message);
            if (getting.hasNextDouble()){
                valor = getting.nextDouble();
                valido = true;
            }else {
                System.out.println("Error, el valor ingresado no es un numero decimal o es un valor negativo");
                getting.next();
                valido = false;
            }
        }while (!valido);
        return valor;
    }

    public static String pedirString(String message){
        String valor = "";
        boolean valido;
        do {
            System.out.print(message);
            if (getting.hasNext()){
                valor = getting.next();
                valido = true;
            }else {
                System.out.println("Error, el valor ingresado no es una cadena");
                getting.next();
                valido = false;
            }
        }while (!valido);
        return valor;
    }


}
