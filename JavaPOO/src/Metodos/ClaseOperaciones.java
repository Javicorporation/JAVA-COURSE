package Metodos;

import java.util.Scanner;

public class ClaseOperaciones {

    public static final Scanner getting = new Scanner(System.in);
    public static  final String msgPedirNum1 = "ingresa el primer numero: ";
    public static  final String msgPedirNum2 = "ingresa el segundo numero: ";
    public  static  final String msgopcion = "elige una opcion: ";

    public int pedirN (String message){
        System.out.print(message);
        return getting.nextInt();
    }

    public void suma(){
        int num1 = pedirN(msgPedirNum1);
        int num2 = pedirN(msgPedirNum2);
        int result = num1 + num2;
        System.out.println("la suma es: "+result);
    }

    public void resta(){
        int num1 = pedirN(msgPedirNum1);
        int num2 = pedirN(msgPedirNum2);
        int result = num1 - num2;
        System.out.println("la suma es: "+result);
    }

    public void multiplicacion(){
        int num1 = pedirN(msgPedirNum1);
        int num2 = pedirN(msgPedirNum2);
        int result = num1 * num2;
        System.out.println("la suma es: "+result);
    }



    public void mostrarMenu (){
        int opcion = 0;
        System.out.println("------ MENU ------");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");

        opcion = pedirN(msgopcion);
        switch (opcion){
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            default:
                System.out.println("opcion "+opcion+" no existe");

        }
    }

}
