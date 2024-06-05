package Ejercicio5POOrepaso.Ejecutador;

import Ejercicio5POO.Clases.NumeroComplejos;
import Ejercicio5POOrepaso.Clases.NumerosRMetodos;

import java.util.Scanner;

public class Ejecutador {
    static  final Scanner getting = new Scanner(System.in);
    public static final String msgPedirDoubl = "Escribe un numero decimal: ";
    public static final String msgValorNoDecimal = "El valor ingresado no es un valor decimal.";
    public static final String msgValorNoInt = "El valor ingresado no es un entero.";
    public static final String msgPedirIntMenu = "Escribe una opcion del menu: ";
    public static final String msgPrimerNumReal = "Digite la parte real del primer numero: ";
    public static final String msgSegundoNumReal = "Digite la parte real del segundo numero: ";
    public static final String msgPrimerNumImagi = "Digite la parte imaginaria del primer numero: ";
    public static final String msgSegundoNumImagi = "Digite la parte imaginaria del segundo numero: ";
    public static final String msgNumInt = "Ingrese un numero entero: ";
    public static final String msgIguales = "Los numeros son iguales";
    public static final String msgNoIguales = "los numeros no son iguales";
    public static final String msgValorNOMenu = "el valor ingresado no esta en el menu.";
    boolean loopMen;

    public double pedirDouble(String message){
        double valor = 0;
        boolean loopPedirDou;
        do {
            System.out.println(message);
            if (getting.hasNextDouble()) {
                valor = getting.nextDouble();
                getting.nextLine();
                loopPedirDou = true;
            }else {
                System.out.println(msgValorNoDecimal);
                getting.next();
                loopPedirDou = false;
            }
        }while (!loopPedirDou);
        return valor;
    }


    public int pedirInt(String message){
        int valorInt = 0;
        boolean loopInt;
        do {
            System.out.println(message);
            if (getting.hasNextInt()) {
                valorInt = getting.nextInt();
                getting.nextLine();
                loopInt = true;
            }else {
                System.out.println(msgValorNoInt);
                getting.next();
                loopInt = false;
            }

        }while(!loopInt);


        return valorInt;
    }


    public void mostrar(){
        int opcion = 0;
        int entero = 0;
        NumerosRMetodos primerNumero;
        NumerosRMetodos segundoNumero;
        NumerosRMetodos suma;
        NumerosRMetodos multiplicacion;
        double a;
        double b;
        double c;
        double d;

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Sumar 2 numeros complejos.");
            System.out.println("2. multiplicar 2 numero complejos.");
            System.out.println("3. Comparar 2 numeros complejos.");
            System.out.println("4. Multiplicar complejos por entero");
            System.out.println("5. Salir.");
            opcion = pedirInt(msgPedirIntMenu);
            switch (opcion){
                case 1:
                    a = pedirDouble(msgPrimerNumReal);
                    b = pedirDouble(msgPrimerNumImagi);
                    c = pedirDouble(msgSegundoNumReal);
                    d = pedirDouble(msgSegundoNumImagi);
                    primerNumero = new NumerosRMetodos(a,b);
                    segundoNumero = new NumerosRMetodos(c,d);
                    suma = primerNumero.sumaDeNumero(segundoNumero);
                    System.out.println("Resultado de la suma: " + suma.getNumeroReal() + " + " + suma.getNumeroImaginario()+ "i");



                    break;
                case 2:
                    a = pedirDouble(msgPrimerNumReal);
                    b = pedirDouble(msgPrimerNumImagi);
                    c = pedirDouble(msgSegundoNumReal);
                    d = pedirDouble(msgSegundoNumImagi);

                    primerNumero  = new NumerosRMetodos(a,b);
                    segundoNumero  = new NumerosRMetodos(c,d);
                    multiplicacion = primerNumero.multiplicDeNumReales(segundoNumero);
                    System.out.println("Resultado de la suma: " + multiplicacion.getNumeroReal() + " + " + multiplicacion.getNumeroImaginario() + "i");
                    break;
                case 3:
                    a = pedirDouble(msgPrimerNumReal);
                    b = pedirDouble(msgPrimerNumImagi);
                    c = pedirDouble(msgSegundoNumReal);
                    d = pedirDouble(msgSegundoNumImagi);

                    primerNumero  = new NumerosRMetodos(a,b);
                    segundoNumero  = new NumerosRMetodos(c,d);

                    if (primerNumero.siSonIguales(segundoNumero) == true) {
                        System.out.println(msgIguales);
                    }else {
                        System.out.println(msgNoIguales);
                    }
                    break;
                case 4:
                    a = pedirDouble(msgPrimerNumReal);
                    b = pedirDouble(msgPrimerNumImagi);
                    entero = pedirInt(msgNumInt);
                    primerNumero = new NumerosRMetodos(a, b);
                    multiplicacion = primerNumero.multiplicarInt(entero);
                    System.out.println("Resultado de la suma: " + multiplicacion.getNumeroReal() + " + " + multiplicacion.getNumeroImaginario()+ "i");
                    break;
                case 5:
                    System.out.println();
                    loopMen = true;
                    break;
                default:
                    System.out.println(msgValorNOMenu);
            }
        }while (!loopMen);
    }
}
