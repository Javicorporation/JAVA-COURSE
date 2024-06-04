package Ejercicio5POO.Ejecutador;

import Ejercicio5POO.Clases.NumeroComplejos;

import java.util.Scanner;

public class Ejecutador {
    static final Scanner getting = new Scanner(System.in);

    boolean loopMenu;


    public double pedirDouble(String message){
        boolean loopValDoub;
        double valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextDouble()){
                valor = getting.nextDouble();
                loopValDoub = true;
            }else {
                System.out.println("el valor ingresado no en un valor entero.");
                getting.next();
                loopValDoub = false;
            }
        }while (!loopValDoub);
        return  valor;
    }


    public void presentar(){
        boolean loopValid;
        int opcion = 0;
        NumeroComplejos primerNumero, segundoNumero;
        NumeroComplejos suma, multiplicacion;
        int entero;
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
            do {
                System.out.print("escribe un entero: ");
                if (getting.hasNextInt()){
                    opcion = getting.nextInt();
                    getting.nextLine();
                    loopValid = true;

                }else {
                    System.out.println("el valor ingresado no es un numero entero.");
                    getting.next();
                    loopValid = false;
                }
            }while (!loopValid);

            switch (opcion){
                case 1:
                    a = pedirDouble("Digite la parte real del primer numero: ");
                    b = pedirDouble("Digite la parte imaginaria del primer numero: ");
                    c = pedirDouble("Digite la parte real del segundo numero: ");
                    d = pedirDouble("Digite la parte imaginaria del segundo numero: ");
                    primerNumero = new NumeroComplejos(a,b);
                    segundoNumero = new NumeroComplejos(c,d);
                    suma = primerNumero.sumarNumeroC(segundoNumero);
                    System.out.println("Resultado de la suma: " + suma.getValorReal() + " + " + suma.getValorimagi() + "i");

                    break;
                case 2:
                    a = pedirDouble("Digite la parte real del primer numero: ");
                    b = pedirDouble("Digite la parte imaginaria del primer numero: ");
                    c = pedirDouble("Digite la parte real del segundo numero: ");
                    d = pedirDouble("Digite la parte imaginaria del segundo numero: ");
                    primerNumero = new NumeroComplejos(a,b);
                    segundoNumero = new NumeroComplejos(c,d);
                    multiplicacion = primerNumero.calcularNumeroC(segundoNumero);
                    System.out.println("Resultado de la suma: " + multiplicacion.getValorReal() + " + " + multiplicacion.getValorimagi() + "i");
                    break;
                case 3:
                    a = pedirDouble("Digite la parte real del primer numero: ");
                    b = pedirDouble("Digite la parte imaginaria del primer numero: ");
                    c = pedirDouble("Digite la parte real del segundo numero: ");
                    d = pedirDouble("Digite la parte imaginaria del segundo numero: ");
                    primerNumero = new NumeroComplejos(a,b);
                    segundoNumero = new NumeroComplejos(c,d);
                    if (primerNumero.comprobarDualidad(segundoNumero) == true) {
                        System.out.println("los  numeros son iguales");
                    }else {
                        System.out.println("no seon iguales");
                    }
                    break;
                case 4:
                    a = pedirDouble("Digite la parte real del numero: ");
                    b = pedirDouble("Digite la parte imaginaria del numero: ");
                    System.out.print("ingrese el numero entero: ");
                    entero = getting.nextInt();
                    primerNumero = new NumeroComplejos(a,b);
                    multiplicacion = primerNumero.multiplicarPorInt(entero);
                    System.out.println("Resultado de la suma: " + multiplicacion.getValorReal() + " + " + multiplicacion.getValorimagi() + "i");
                    break;
                case 5:
                    System.out.println("Adios.");
                    loopMenu = true;
                    break;
                default:
                    System.out.println("el valor ingresado no esta en el menu.");
            }

        }while (!loopMenu);
    }
}
