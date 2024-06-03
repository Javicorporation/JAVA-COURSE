package Ejercicio4POO.Clases;

import java.util.Scanner;

public class Cajero {
    private static final Scanner getting = new Scanner(System.in);


    public int  saldo  = 0;
    public String clave = "papu12";
    boolean loopValidarInt = false;

    public int pedir(String message){
        int valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextInt()) {
                valor = getting.nextInt();
                loopValidarInt = true;
            }else {
                System.out.println("Digite un valor entero. ");
                getting.next();
            }

        }while (!loopValidarInt);
        return valor;
    }

    public void salir(){}

    public void consignar(){}


    public void retirar(){}

    public void cambiarClave(){}

    public void verSaldo(){}
}
