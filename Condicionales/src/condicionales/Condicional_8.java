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

        if(numero3 > numMayor){
            numMayor = numero3 ;
            System.out.printf("El numero mayore es el numero: %d", numMayor);
        } else if (numero3 < numMenor) {
            numMenor = numero3;
            System.out.printf("el numero menor es: %d", numMenor);
        }

        if( numero4 > numMayor){
            numMayor = numero4 ;
            System.out.printf("El numero mayor es: %d", numMayor);
        } else if (numero4 < numMenor ) {
            System.out.printf("El numero menor es: %d", numMenor);
        }

        if (numero5 > numMayor) {
            numMayor = numero5 ;
            System.out.printf("El numero mayor es: %d", numMayor);
        } else if (numero5 < numMenor) {
            numMenor = numero5;
            System.out.printf("El numero menor es %d", numMenor);
        }


    }
}
