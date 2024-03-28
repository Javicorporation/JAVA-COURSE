package condicionales;

import java.util.Scanner;

public class EjercicioCondicional18 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        if (numero%2 ==0){
            System.out.println("el numero es par");
        } else if (numero%2 == 1) {
            System.out.println("el numero es impar");
        }


    }
}
