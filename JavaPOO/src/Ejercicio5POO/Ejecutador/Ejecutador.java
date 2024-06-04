package Ejercicio5POO.Ejecutador;

import Ejercicio5POO.Clases.NumeroComplejos;

import java.util.Scanner;

public class Ejecutador {
    static final Scanner getting = new Scanner(System.in);


    boolean loopMenu;
    public void presentar(){

        boolean loopValid;
        int opcion = 0;
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
                    NumeroComplejos numero1 = new NumeroComplejos(12.0,2.0);
                    NumeroComplejos numero2 = new NumeroComplejos(6.0,3.0);
                    NumeroComplejos resultado = numero1.sumarNumeroC(numero2);
                    System.out.println("Resultado de la suma: " + resultado.getValorReal() + " + " + resultado.getValorimagi() + "i");

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
