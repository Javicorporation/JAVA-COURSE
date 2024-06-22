package EjercicioDeBanco2.Metodos;

import EjercicioDeBanco2.Clases2.Cliente2;

import java.util.Scanner;

public class Operaciones {
    public static final Scanner getting = new Scanner(System.in);
    Cliente2 cliente = new Cliente2();

    public void depositar(double valor) {
        cliente.setMonto(cliente.getMonto() + valor);
    }

    public void retirar(double valor) {
        cliente.setMonto(cliente.getMonto() - valor);
    }

    public void imprimirCliente(){
        System.out.println("Id: " + cliente.getId());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Apellido: " + cliente.getApellido());
        System.out.println();

    }

    public static int pedirIntMenu(String message){
        boolean loop;
        int valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextInt()) {
                valor = getting.nextInt();
                loop = true;
            }else {
                System.out.println("El valor ingresado no es un entero, intente de nuevo.");
                getting.next();
                loop = false;
            }
        }while (!loop);
        return valor;
    }

    public static String pedirString(String message){
        boolean loop;
        String valor = "";
        do {
            System.out.print(message);
            if (getting.hasNextLine()) {
                valor = getting.nextLine();
                loop = true;
            }else {
                System.out.println("El valor ingresado no es un texto, intente de nuevo.");
                getting.next();
                loop = false;
            }
        }while(!loop);
        return valor;
    }

    public static double pedirDouble(String message){
        boolean loop;
        double valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextDouble()) {
                valor = getting.nextDouble();
                loop = true;
            }else {
                System.out.println("El valor ingresado no es un decimal, intente de nuevo.");
                getting.next();
                loop = false;
            }
        }while (!loop);
        return valor;
    }

    public void opcionDepositar(Cliente2 cliente, int id){}

    public void opcionRetirar(Cliente2 cliente, int id){}





}
