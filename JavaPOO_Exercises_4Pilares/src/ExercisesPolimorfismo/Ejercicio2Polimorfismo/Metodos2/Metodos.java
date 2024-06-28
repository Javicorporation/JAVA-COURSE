package ExercisesPolimorfismo.Ejercicio2Polimorfismo.Metodos2;

import java.util.Scanner;

public class Metodos {
    public static final Scanner getting = new Scanner(System.in);

    public static int pedirInt(String message){
        int valor =0;
        boolean loopInt;
        do {
            System.out.print(message);
            if (getting.hasNextInt()) {
                 valor = getting.nextInt();
                loopInt = true;
            }else{
                System.out.println("El valor ingresado no es un entero, intente de nuevo");
                loopInt = false;
                getting.next();
            }
        }while(!loopInt);
        return valor;
    }


    public static String pedirString(String message){
        String valor = "";
        boolean loopInt;
        do {
            System.out.print(message);
            if (getting.hasNext()) {
                valor = getting.next();
                loopInt = true;
            }else{
                System.out.println("El valor ingresado no es un texto, intente de nuevo");
                loopInt = false;
                getting.next();
            }
        }while(!loopInt);
        return valor;
    }



}
