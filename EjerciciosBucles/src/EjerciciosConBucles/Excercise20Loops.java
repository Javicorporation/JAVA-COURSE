package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise20Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int value;
        int suma = 0, i = 0;
        double promedio;

        do {
            System.out.print("Write a number: ");
            value = getting.nextInt();
            suma = suma + value;
            i++;


        }while (value != 0);
        promedio = suma/ i;
        System.out.println("Promedio: "+promedio);
    }
}
