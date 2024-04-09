package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise30Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int number = 0;
        int contador = 0;

        System.out.println("write a number: ");
        number = getting.nextInt();
        for (int i = 1; i <= number; i++){
            if (number%i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("This number is: primo ");
        }else {
            System.out.print("no lo es. ");
        }

    }
}
