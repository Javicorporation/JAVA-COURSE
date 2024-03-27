package condicionales;

import java.util.Scanner;

public class ejercicioCondicional10 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        double promedio;
        int numeroMayor, numeroMenor;

        System.out.print("ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("ingrese el segundo numero: ");
        numero2 = entrada.nextInt();

        if(numero1 == numero2){
            System.out.println(" los numero son iguales");
            promedio = (numero1+numero2)/2;
            System.out.println(" el promedio de los 2 numeros es: "+promedio);
        }else if(numero1 != numero2){
            System.out.println("Los numero son distintos");
            numeroMayor = Math.max(numero1,numero2);
            numeroMenor = Math.min(numero1, numero2);
            System.out.println("El numero mayor es: "+numeroMayor);
            System.out.println("El numero menor es: "+numeroMenor);
        }

    }
}
