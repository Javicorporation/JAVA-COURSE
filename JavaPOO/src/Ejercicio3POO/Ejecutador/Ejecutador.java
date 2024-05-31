package Ejercicio3POO.Ejecutador;

import Ejercicio3POO.Logica.Tablero;

import java.util.Scanner;

public class Ejecutador {
    private static final Scanner getting = new Scanner(System.in);
    private static final String msgCoordenadaX = "Digite la coordenada X: ";
    private static final String msgCoordenadaY = "Digite la coordenada Y: ";
    private static final String msgValidarInt = "el valor ingresado no es un numero entero.";

    int x;
    int y;
    int opcion;
    boolean salirNume = false;
    boolean salirWhile = false;
    Tablero accion = new Tablero(x,y);

    public int pedirNumero(String message){
        int valor =0;
        do {
            System.out.print(message);
            if(getting.hasNextInt()){
                valor = getting.nextInt();
                salirNume = true;
                break;
            }else {
                System.out.println(msgValidarInt);
                salirNume = false;
                getting.next();
            }
        }while (!salirNume);
        return valor;
    }

    public void presentar(){
        do {
            x = pedirNumero(msgCoordenadaX);
            y = pedirNumero(msgCoordenadaY);

            boolean loopMenu = true;
            while (loopMenu){
                System.out.println("----MENU----");
                System.out.println("1. mover hacia arriba: ");
                System.out.println("2. mover hacia abajo: ");
                System.out.println("3. mover hacia la izquierda: ");
                System.out.println("4. mover hacia la derecha: ");
                System.out.println("5. Salir ");
                System.out.println("Escoge una opcion: ");
                if (getting.hasNextInt()) {
                    opcion = getting.nextInt();
                }else {
                    System.out.println(msgValidarInt);
                    getting.next();
                    continue;
                }
                switch (opcion){
                    case 1:
                        accion.moverArriba();
                        break;
                    case 2:
                        accion.moverAbajo();
                        break;
                    case 3:
                        accion.moverIzquierda();
                        break;
                    case 4:
                        accion.moverDerecha();
                        break;
                    case 5:
                        System.out.println("adios");
                        salirWhile = true;
                        loopMenu = false;
                        break;
                    default:
                        System.out.println("la opcion que ingresaste no esta en el menu.");
                }
            }

        }while (!salirWhile);


    }
}
