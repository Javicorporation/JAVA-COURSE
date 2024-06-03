package Ejercicio4POO.Ejecutador;

import Ejercicio4POO.Clases.Cajero;

import java.util.Scanner;

public class Ejecutador {
    private static final Scanner getting = new Scanner(System.in);
    private final String msgOpcionMenu = "Escribe una opcion: ";
    private final String msgSalir = "Gracias, vuelva pronto.";
    private final String msgPedirInt = "Ingrese un entero: ";



    Cajero cajero = new Cajero();
    int opcion = 0;
    boolean loopMenu = false;


    public void mostrarmenu(){
        boolean loopValidar = false;
        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consignar");
            System.out.println("3. retirar");
            System.out.println("4. cambiar Clave");
            System.out.println("5. salir");
            do {
                System.out.print(msgOpcionMenu);
                if (getting.hasNextInt()) {
                    opcion = getting.nextInt();
                    loopValidar = true;
                }else {
                    System.out.println("Opcion no valida");
                    getting.next();
                }
            }while (!loopValidar);

            switch (opcion) {
                case 1:
                    int valor = cajero.pedir(msgPedirInt);
                    System.out.println(valor);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println(msgSalir);
                    loopMenu = true;
                    break;
                default:
                    System.out.println("valor no valido");
            }

        }while(!loopMenu);




    }
}
