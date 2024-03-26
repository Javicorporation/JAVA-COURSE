package condicionales;

import java.util.Scanner;

public class Condicional_8 {
    public static void main (String[] args){

        Scanner estrada = new Scanner(System.in);
        int numero3;
        int numero4;
        int numero5;
        int numMayor;
        int numMenor;

        System.out.print("Escriba el primer numero: ");
        numMayor = estrada.nextInt();
        System.out.print("Escriba el segundo numero: ");
        numMenor = estrada.nextInt();
        System.out.print("Escriba el tercer numero: ");
        numero3 = estrada.nextInt();
        System.out.print("Escriba el cuarto numero: ");
        numero4 = estrada.nextInt();
        System.out.print("Escriba el quinto numero: ");
        numero5 = estrada.nextInt();

        if(numMayor > numero3){
            numero3 = numMayor;
            System.out.printf("El numero mayore es el numero: %d", numero3);
        } else if (numMenor < numero3) {
            numero3 = numMenor;
            System.out.printf("el numero menor es: %d", numero3);
        }


    }
}
