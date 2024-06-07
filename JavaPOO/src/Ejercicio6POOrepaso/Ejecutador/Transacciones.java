package Ejercicio6POOrepaso.Ejecutador;

import Ejercicio6POOrepaso.Clases.Cliente;
import Ejercicio6POOrepaso.Clases.Cuenta;

import java.util.Scanner;

public class Transacciones {
    private static Scanner getting = new Scanner(System.in);
    public static final String msgNombre = "Digite el nombre del cliente: ";
    public static final String msgApellido = "Digite su apellido: ";
    public static final String msgDNI = "Digite su DNI: ";
    public static final String msgNumeroDeCuentas = "Digite su numero de cuentas que tiene: ";
    public static final String msgDigitNumeroDeCuenta = "Digite el numero de la cuenta: ";
    public static final String msgDigitDineroDeCuenta = "Digite el dinero de la nueva cuenta: ";
    public static final String fd = "";


    public int pedirInt(String message) {
        System.out.print(message);
        return getting.nextInt();
    }

    public double pedirDouble(String message) {
        System.out.print(message);
        return getting.nextDouble();
    }

    public String pedirString(String message) {
        System.out.print(message);
        return getting.nextLine();
    }


    public static int buscarCuenta(int numCuentaABuscar, Cuenta cuentas[]) {
        boolean cuentaEncontrada = false;
        int iterador = 0;
        int indice = 0;
        while (indice < cuentas.length && cuentaEncontrada == false) {
            if (cuentas[iterador].getNumeroCuenta() == numCuentaABuscar) {
                cuentaEncontrada = true;
                indice = iterador;
            }
            iterador++;
            if (cuentaEncontrada == false) {
                indice = -1;
            }
        }
        return indice;
    }

    public void transacciones() {
        String nombre, apellido, DNI;
        Cliente cliente;
        Cuenta cuentas[];
        Cuenta cuenta;
        double cantidadDeDinero, saldo;
        int numeroDeCuenta, CantidadDeCuenta, idDeCuenta;
        int opcion = 0;
        boolean loopMenu = false;

        nombre = pedirString(msgNombre);
        apellido = pedirString(msgApellido);
        DNI = pedirString(msgDNI);
        numeroDeCuenta = pedirInt(msgNumeroDeCuentas);

        cuentas = new Cuenta[numeroDeCuenta];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Cuenta " + (i + 1) + ".");
            numeroDeCuenta = pedirInt(msgDigitNumeroDeCuenta);
            saldo = pedirDouble(msgDigitDineroDeCuenta);
            cuentas[i] = new Cuenta(numeroDeCuenta, saldo);
        }
        cliente = new Cliente(nombre, apellido, DNI, cuentas);

        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Ingresar saldo de la cuenta.");
            System.out.println("2. Retirar saldo de la cuenta.");
            System.out.println("3. Consultarsaldo de la cuenta.");
            System.out.println("4. Salir.");
            System.out.print("Digite una opcion: ");
            opcion = getting.nextInt();
/*
            switch (opcion){
                case 1:
                    numeroDeCuenta = pedirInt(msgDigitNumeroDeCuenta);
                    indiceNumeroCuenta = buscarCuentas(cuentas, numeroDeCuenta);
                    if (indiceNumeroCuenta == -1) {
                        System.out.println("No se encontro la cuenta, verifique su numero de cuenta.");
                    }else {
                        System.out.println("digite la cantidad de dinero a depositasr");
                        cantidadDeDinero = getting.nextInt();
                        cliente.ingresarDinero(indiceNumeroCuenta,cantidadDeDinero);
                        System.out.println("Deposito exitoso");
                        System.out.println("saldo disponible: "+cliente.consultarSaldo(indiceNumeroCuenta));
                    }
                    break;
                case 2:
                    System.out.print("Digite el numero de cuenta: ");
                    numeroDeCuenta = getting.nextInt();
                    indiceNumeroCuenta = buscarCuentas(cuentas, numeroDeCuenta);
                    if (indiceNumeroCuenta == -1) {
                        System.out.println("No existe una cuenta con ese numero.");
                    }else {
                        System.out.println("digite la cantidad de dinero a retirar ");
                        cantidadDeDinero = getting.nextDouble();
                        if (cliente.consultarSaldo(indiceNumeroCuenta) < cantidadDeDinero) {
                            System.out.println("saldo insuficiente");
                        }else {
                            cliente.retirarDinero(indiceNumeroCuenta,cantidadDeDinero);
                            System.out.println("Deposito exitoso");
                            System.out.println("saldo disponible: "+cliente.consultarSaldo(indiceNumeroCuenta));

                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite el numero de cuenta: ");
                    numeroDeCuenta = getting.nextInt();
                    indiceNumeroCuenta = buscarCuentas(cuentas, numeroDeCuenta);
                    if (indiceNumeroCuenta == -1) {
                        System.out.println("No existe una cuenta con ese numero.");
                    }else {
                        System.out.println("Deposito exitoso");
                        System.out.println("saldo disponible: "+cliente.consultarSaldo(indiceNumeroCuenta));
                    }
                    break;
                case 4:
                    System.out.println("grasias, vuelva pronto.");
                    loopMenu = true;
                    break;
                default:
                    System.out.println("opcion no disponible");

            }

        }while(!loopMenu);
*/


        }while (false);
    }
}
