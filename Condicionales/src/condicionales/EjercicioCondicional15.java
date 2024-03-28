package condicionales;

import java.util.Scanner;

public class EjercicioCondicional15 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese el numero: ");
        numero = entrada.nextInt();

        if (numero%4 ==0){
            System.out.println("el numero es multiplo de 4");
        }else {
            System.out.println("el numero no es multiplo de 4");
        }


    }
}
