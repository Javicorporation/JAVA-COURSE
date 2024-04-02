package EjerciciosConBucles;

import java.util.Scanner;

public class Ejercicio2Bucles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1;
        double promedio;
        int numero;
        int suma = 0;

        while (i <= 10){
            System.out.print("escriba su nota: ");
            numero = entrada.nextInt();
            suma = numero + suma;
            i++;
        }

        promedio = suma/10;
        System.out.print("El resultado es: "+promedio);

    }
}
