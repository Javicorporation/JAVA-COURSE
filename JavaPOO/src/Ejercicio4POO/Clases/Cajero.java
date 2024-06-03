package Ejercicio4POO.Clases;

import java.util.Scanner;

public class Cajero {
    private static final Scanner getting = new Scanner(System.in);

    public int  saldo  = 1100;
    public String clave = "papu12";




    public int pedir(String message){
        boolean loopValidarInt = false;
        int valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextInt()) {
                valor = getting.nextInt();
                getting.nextLine();
                loopValidarInt = true;
            }else {
                System.out.println("Digite un valor entero. ");
                getting.next();
            }

        }while (!loopValidarInt);
        return valor;
    }


    public void salir(){
    }

    public void consignar(){
        int valorDep = pedir("Ingrese el valor a depositar: ");
        saldo += valorDep;
        System.out.println("Su saldo actual es de: "+saldo);
    }


    public void retirar(){
        int valorARetir = pedir("digite el valor a retirar: ");
        if (valorARetir > saldo) {
            System.out.println("el saldo es insuficientes ");
        }else if(valorARetir == saldo || valorARetir < saldo){
            saldo -= valorARetir;
            System.out.println("a retirado: "+valorARetir);
            System.out.println("y su saldo actual es de: "+saldo);
        }

    }

    public void cambiarClave(){
        String claveSupl = "";
        System.out.print("Digite su clave actual: ");
        claveSupl = getting.next();
        if (claveSupl.equalsIgnoreCase(clave)) {
            System.out.println("digite la nueva clave: ");
            clave = getting.next();
            getting.nextLine();
        }else {
            System.out.println("Clave incorrecta.");
            getting.nextLine();
        }

    }

    public void verSaldo(){
        System.out.println("Su saldo es: "+saldo);
    }
}
