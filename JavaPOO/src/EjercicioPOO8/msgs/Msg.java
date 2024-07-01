package EjercicioPOO8.msgs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Msg {
    public static Scanner getting = new Scanner(System.in);
    public static String msgBono = "\nSe le a añadido un bono de: ";
    public static String msgSalarioAct = "Su salario actual es de: ";
    public static String msgNoCumple = "\nEl empleado no cumple con los requisitos para el bono";
    public static String msgNombre = "Escribe tu nombre: ";
    public static String msgEdad = "Escribe tu edad: ";
    public static String msgComision = "Escriba su comision: ";
    public static String msgSalario = "Escribe el salario: ";
    public static String msgAdios = "Chaooo ";
    public static String msgZona = "Escriba la Zona: ";


    public static int pedirInt(String message){
        boolean loopInt;
        int valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextInt()) {
                valor = getting.nextInt();
                loopInt = true;
            }else{
                System.out.println("El valor no es un numero entero.");
                loopInt =  false;
                getting.next();
            }
        }while (!loopInt);
        return valor;
    }


    public static double pedirDouble(String message){
        boolean loopDouble;
        double valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextDouble()) {
                valor = getting.nextDouble();
                loopDouble = true;
            }else{
                System.out.println("El valor no es un numero decimal.");
                loopDouble =  false;
                getting.next();
            }
        }while (!loopDouble);
        return valor;
    }

    public static String pedirString(String message){
        boolean loopString;
        String valor = "";
        do {
            System.out.print(message);
            if (getting.hasNext()) {
                valor = getting.next();
                loopString = true;
            }else{
                System.out.println("El valor no es una cadena.");
                loopString =  false;
                getting.next();
            }
        }while (!loopString);
        return valor;
    }


}
