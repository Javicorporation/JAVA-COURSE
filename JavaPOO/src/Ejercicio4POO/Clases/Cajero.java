package Ejercicio4POO.Clases;

import java.util.Scanner;

public class Cajero {
    private static final Scanner getting = new Scanner(System.in);
    private final String msgValidarInt = "Digite un valor entero. ";
    private final String msgValorDeposito = "Ingrese el valor a depositar: ";
    private final String msgSaldoActua = "Su saldo actual es de: ";
    private final String msgValorRetir = "Digite el valor a retirar: ";
    private final String msgSaldoInsufi = "El saldo es insuficientes ";
    private final String msgClaveActual = "Digite su clave actual: ";
    private final String msgClaveNuev = "Digite la nueva clave: ";
    private final String msgClaveIncorrec = "Clave ingresada es incorrecta.";


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


    public void salir(){
    }

    public void consignar(){
        int valorDep = pedir(msgValorDeposito);
        saldo += valorDep;
        System.out.println(msgSaldoActua+saldo);
    }


    public void retirar(){
        int valorARetir = pedir(msgValorRetir);
        if (valorARetir > saldo) {
            System.out.println(msgSaldoInsufi);
        }else if(valorARetir == saldo || valorARetir < saldo){
            saldo -= valorARetir;
            System.out.println("a retirado: "+valorARetir);
            System.out.println(msgSaldoActua+saldo);
        }

    }

    public void cambiarClave(){
        String claveSupl = "";
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
