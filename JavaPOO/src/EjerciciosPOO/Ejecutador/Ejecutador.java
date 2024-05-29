package EjerciciosPOO.Ejecutador;

import EjerciciosPOO.Areas;
import EjerciciosPOO.Heron;
import EjerciciosPOO.Perimetros;

import java.util.Scanner;

public class Ejecutador {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgValidarLetra = "el caracter ingresado no es un numero o no esta en el menu";
    public static final String msgValidarNumero= "el valor ingresado no exixte en el menu";

    public static void menu(){
        int opcion ;
        boolean salir = false;

        do {
            System.out.println("\n-------- MENU -----------");
            System.out.println("1. Calcular Perimetros");
            System.out.println("2. Calcular Area");
            System.out.println("3. Calcular Heron");
            System.out.println("4. Salir");
            System.out.print("Escribe una opcion: ");
            if(getting.hasNextInt()){
                opcion = getting.nextInt();
            }else{
                System.out.println(msgValidarLetra);
                getting.next();
                continue;
            }

            switch (opcion){
                case 1:
                    Perimetros.presentadorDePerimetros();
                    break;
                case 2:
                    Areas.presentadorDeAreas();
                    break;
                case 3:
                    Heron.presentadorDeHeron();
                    break;
                case 4:
                    System.out.println("Adios");
                    salir = true;
                    break;
                default:
                    System.out.println(msgValidarNumero);
            }
        }while (!salir);

    }
}
