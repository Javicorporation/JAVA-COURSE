package EjerciciosPOO.Ejecutador;

import java.util.Scanner;

public class Ejecutador {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgValidarLetra = "el caracter ingresado no es un numero o no esta en el menu";
    public static final String msgValidarNumero= "el valor ingresado no exixte en el menu";

    public static void menu(){
        boolean salir = true;
        int opcion = 0;

        do {
            System.out.println();
            System.out.println("-------- MENU -----------");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Adios");
                    salir = false;
                    break;
                default:
                    System.out.println(msgValidarNumero);
            }


        }while (salir == true);



    }
}
