package Ejercicio4POO.Clases;

import java.util.Scanner;

public class Cajero {
    private static final Scanner getting = new Scanner(System.in);
    public final String msgValidarInt = "Digite un valor entero. ";
    public final String msgValorDeposito = "Ingrese el valor a depositar: ";
    public final String msgSaldoActua = "Su saldo actual es de: ";
    public final String msgValorRetir = "Digite el valor a retirar: ";
    public final String msgSaldoInsufi = "El saldo es insuficientes ";
    public final String msgClaveActual = "Digite su clave actual: ";
    public final String msgClaveNuev = "Digite la nueva clave: ";
    public final String msgClaveIncorrec = "Clave ingresada es incorrecta.";


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
                System.out.println(msgValidarInt);
                getting.next();
            }

        }while (!loopValidarInt);
        return valor;
    }


    //public void salir(){
    //}

    public void consignar(){
        int valorDep = pedir(msgValorDeposito);
        saldo += valorDep;
        System.out.println(msgSaldoActua+saldo);
    }


    public void retirar(){
        int valorARetir = pedir(msgValorRetir);
        if(valorARetir <= saldo){
            saldo -= valorARetir;
            System.out.println("a retirado: "+valorARetir);
            System.out.println(msgSaldoActua+saldo);
        }
        if (saldo < valorARetir) {
            System.out.println(msgSaldoInsufi);
        }

    }

    public void cambiarClave(){
        String claveSupl;
        System.out.print(msgClaveActual);
        claveSupl = getting.next();
        if (claveSupl.equalsIgnoreCase(clave)) {
            System.out.print(msgClaveNuev);
            clave = getting.next();
            getting.nextLine();
        }else {
            System.out.println(msgClaveIncorrec);
            getting.nextLine();
        }

    }

    public void verSaldo(){
        System.out.println(msgSaldoActua+saldo);
    }
}
