package condicionales;

import java.util.Scanner;

public class Condicional_8 {
    public static void main (String[] args){

        Scanner estrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        System.out.println("Escriba el primer numero: ");
        numero1 = estrada.nextInt();
        System.out.println("Escriba el segundo numero: ");
        numero2 = estrada.nextInt();
        System.out.println("Escriba el tercer numero: ");
        numero3 = estrada.nextInt();
        System.out.println("Escriba el cuarto numero: ");
        numero4 = estrada.nextInt();
        System.out.println("Escriba el quinto numero: ");
        numero5 = estrada.nextInt();

        if(numero1 > numero2 && numero1 > numero3 && numero1> numero4 && numero1 > numero5){
            System.out.printf("el numero mayor es el numero %d", numero1);
        }else if (numero2 > numero1 && numero2 > numero3 && numero2> numero4 && numero2 > numero5){
            System.out.printf("el numero mayor es el numero %d", numero2);
        }else if (numero3 > numero2 && numero3 > numero1 && numero3> numero4 && numero3 > numero5){
            System.out.printf("el numero mayor es el numero %d", numero3);
        }else if (numero4 > numero2 && numero4 > numero3 && numero4> numero1 && numero4 > numero5){
            System.out.printf("el numero mayor es el numero %d", numero4);
        }else if (numero5 > numero2 && numero5 > numero3 && numero5> numero4 && numero5 > numero1){
            System.out.printf("el numero mayor es el numero %d", numero5);
        }



    }
}
