package Metodos;

import java.util.Scanner;

public class ClaseUsoDeMetodos {
    public static Scanner getting = new Scanner(System.in);
    public static String msgPedirEdad = "Ingrese su edad: ";
    public static String msgPedirNombre = "Ingrese su nombre: ";
    public static String msgPedirAltura = "Ingrese su altura: ";

    public static String pedirString (String message){
        System.out.print(message);
        return getting.nextLine();
    }
    public static int pedirInt (String message){
        System.out.print(message);
        while (!getting.hasNextInt()){
            System.out.print("el valor ingresado no es un enter, ingrese un numero valido: ");
            getting.next();
        }
        int caja = getting.nextInt();
        getting.nextLine();
        return caja;

    }
    public static float pedirFloat (String message){
        System.out.print(message);
        while (!getting.hasNextFloat()){
            System.out.print("el valor ingresado no es un enter, ingrese un decimal valido: ");
            getting.next();
        }
        return getting.nextFloat();
    }


    public void personaMayor(){

        int edad = pedirInt(msgPedirEdad);
        String nombre = pedirString(msgPedirNombre);
        Float altura = pedirFloat(msgPedirAltura);

        if(edad >= 18){
            System.out.println(nombre+" es mayor de edad y mide "+altura);
        }else {
            System.out.println(nombre+" es menor de edad y mide "+altura);
        }
    }
}
