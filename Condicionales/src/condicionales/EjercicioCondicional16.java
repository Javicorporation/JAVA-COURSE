package condicionales;

import java.util.Scanner;

public class EjercicioCondicional16 {
    public static  void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese el numero: ");
        numero = entrada.nextInt();

        if (numero%3 ==0 || numero%5 ==0){
            System.out.println("el numero es multiplo de 3 y de 5");
        }else {
            System.out.println("el numero no es multiplo de 4");
        }
    }
}
