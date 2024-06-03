package Ejercicio4POO.Ejecutador;

import Ejercicio4POO.Clases.Cajero;

import java.util.Scanner;

public class Ejecutador {
    private static final Scanner getting = new Scanner(System.in);
    private final String msgOpcionMenu = "Escribe una opcion: ";
    private final String msgSalir = "Gracias, vuelva pronto.";
    private final String msgNoValido = "La opcion que ingreso no es valida";
    private final String msgPedirInt = "Ingrese un numero que se encuentre en el menu.";





    Cajero cajero = new Cajero();
    int opcion = 0;
    boolean loopMenu = false;


    public void mostrarmenu(){
        boolean loopValidar = false;
        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consignar");
            System.out.println("3. retirar");
            System.out.println("4. cambiar Clave");
            System.out.println("5. salir");
            do {
                System.out.print(msgOpcionMenu);
                if (getting.hasNextInt()) {
                    opcion = getting.nextInt();
                    getting.nextLine();
                    loopValidar = true;
                }else {
                    System.out.println(msgNoValido);
                    getting.next();
                    loopValidar = false;
                }
            }while (!loopValidar);

            switch (opcion) {
                case 1:
                    cajero.verSaldo();
                    break;
                case 2:
                    cajero.consignar();
                    break;
                case 3:
                    cajero.retirar();
                    break;
                case 4:
                    cajero.cambiarClave();
                    break;
                case 5:
                    System.out.println(msgSalir);
                    loopMenu = true;
                    break;
                default:
                    System.out.println(msgPedirInt);
            }

        }while(!loopMenu);




    }
}
