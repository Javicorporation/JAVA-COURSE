package Ejercicio6POO.Ejecutador;

import Ejercicio6POO.Clases.Cliente;
import Ejercicio6POO.Clases.Cuenta;

import java.util.Scanner;

public class Ejecutador {
    private static Scanner getting = new Scanner(System.in);
    public void transacciones(){
        String nombre;
        String apellido;
        String dni;
        Cliente cliente;
        Cuenta cuentas[];
        Cuenta cuenta;
        double cantidadDeDinero;
        int numeroDeCuenta;
        int cantidadDeCuentas;
        int indiceNumeroCuenta;
        double saldo;
        int opcion = 0;
        boolean loopMenu = false;

        //pedimos datos del cliente
        System.out.print("Digite el nombre del cliente: ");
        nombre = getting.next();
        System.out.print("Digite el apellido del cliente: ");
        apellido = getting.next();
        System.out.print("Digite el dni del cliente: ");
        dni = getting.next();
        System.out.print("Digite la cantida de cuentas que tiene: ");
        cantidadDeCuentas = getting.nextInt();
        System.out.println();

        cuentas = new Cuenta[cantidadDeCuentas];


        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Digite la "+(i+1)+" cuenta");
            System.out.print("Digite el numero de cuenta: ");
            numeroDeCuenta = getting.nextInt();
            System.out.print("Digite el saldo de la cuenta:");
            saldo = getting.nextDouble();
            cuentas[i] = new Cuenta(numeroDeCuenta, saldo);
        }
        cliente = new Cliente(nombre,apellido,dni,cuentas);

        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Ingresar saldo de la cuenta.");
            System.out.println("2. Retirar saldo de la cuenta.");
            System.out.println("3. Consultarsaldo de la cuenta.");
            System.out.println("4. Salir.");
            System.out.print("Digite una opcion: ");
            opcion = getting.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Digite el numero de cuenta: ");
                    numeroDeCuenta = getting.nextInt();
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
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("grasias, vuelva pronto.");
                    loopMenu = true;
                    break;
                default:
                    System.out.println("opcion no disponible");

            }

        }while(!loopMenu);




    }


    public static int buscarCuentas(Cuenta cuentas[], int numeroDeCuentaABuscar){
        int indice = 0;
        int iterador = 0;
        boolean cuentaEncontrada = false;

        while ((iterador < cuentas.length)&&(cuentaEncontrada == false)) {
            if (cuentas[iterador].getNumeroCuenta() == numeroDeCuentaABuscar) {
                cuentaEncontrada = true;
                indice = iterador;
            }
            iterador++;
            if (cuentaEncontrada == false){
                indice = -1;
            }
        }
        return  indice;
    }
}
