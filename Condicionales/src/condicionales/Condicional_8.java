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
        int numMayor;
        int numMenor;

        System.out.print("Escriba el primer numero: ");
        numero1 = estrada.nextInt();
        System.out.print("Escriba el segundo numero: ");
        numero2 = estrada.nextInt();
        System.out.print("Escriba el tercer numero: ");
        numero3 = estrada.nextInt();
        System.out.print("Escriba el cuarto numero: ");
        numero4 = estrada.nextInt();
        System.out.print("Escriba el quinto numero: ");
        numero5 = estrada.nextInt();


        numMayor = numero1;
        numMenor = numero1;

        if(numero2 > numMayor){
            numMayor = numero2;
        } else if (numero2 < numMenor) {
            numMenor = numero2;
        }
        if(numero3 > numMayor){
            numMayor = numero3 ;
        } else if (numero3 < numMenor) {
            numMenor = numero3;
        }

        if( numero4 > numMayor){
            numMayor = numero4 ;
        } else if (numero4 < numMenor ) {
            numMenor = numero4;
        }

        if (numero5 > numMayor) {
            numMayor = numero5 ;
        } else if (numero5 < numMenor) {
            numMenor = numero5;
        }
        System.out.println("El numero mayor es: "+ numMayor);
        System.out.println("El numero menor es: "+ numMenor);

    }
}
