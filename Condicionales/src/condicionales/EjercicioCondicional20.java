package condicionales;

import java.util.Scanner;

public class EjercicioCondicional20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.print("ingrese un numero de 1 , 2 o 3 cifras: ");
        numero = entrada.nextInt();
        if (numero >= 100 && numero <= 999) {
            System.out.println("el numero es de 3 cifaras");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("el numero es de 2 cifras");
        } else if (numero >= 0 && numero <= 9){
            System.out.println("el numero es de una cifra");
        } else if (numero < 0 || numero >=1000) {
            System.out.println("el numero es negativo o excede la cantidad de cifras");
            
        }
    }
}
