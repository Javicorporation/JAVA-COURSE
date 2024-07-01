package EjercicioPOO8.ejecutado;

import EjercicioPOO8.clases.Comercial;
import EjercicioPOO8.clases.Repartidor;

import java.util.Scanner;

public class Ejecutador {
    public static Scanner getting = new Scanner(System.in);




    public void presentar(){
        // instanciamos objetos de las clases
        Repartidor repartidor;
        Comercial comercial;
        boolean loopMenu;
        int opcion;

        do {
            System.out.println("\nBonos de empleandos");
            System.out.println("1. Bono de empleado comercial");
            System.out.println("2. Bono de empleado repartidor");
            System.out.println("3. Salir");
            System.out.println("Selecione una opcio: ");
            opcion = getting.nextInt();

            switch (opcion){
                case 1:
                    String nombre;
                    int edad;
                    double salario, comision;

                    System.out.println("Escribe tu nombre: ");
                    nombre = getting.next();
                    System.out.println("escribe tu edad:");
                    edad = getting.nextInt();
                    System.out.println("escriba su comision: ");
                    comision = getting.nextDouble();
                    System.out.println("Escribe el salario:");
                    salario = getting.nextDouble();
                    comercial = new Comercial(nombre,edad,salario,comision);
                    comercial.toString();
                    comercial.plus();

                    break;
                case 2:
                    String nombreR;
                    int edadR;
                    double salarioR;
                    String zona;

                    System.out.println("Escribe tu nombre: ");
                    nombreR = getting.next();
                    System.out.println("escribe tu edad:");
                    edadR = getting.nextInt();
                    System.out.println("escriba su comision: ");
                    zona = getting.next();
                    System.out.println("Escribe el salario:");
                    salarioR = getting.nextDouble();

                    repartidor = new Repartidor(nombreR,edadR,salarioR,zona);
                    repartidor.toString();
                    repartidor.plus();
                    break;
                case 3:
                    System.out.println("Bay");
                    break;
                default:
                    System.out.println();
            }

        }while (opcion!=3);





    }
}
