package EjerciciosConBucles;

import java.util.Scanner;

public class Excersice21Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int number;
        int i = 0;
        int suma = 0;
        int prom = 0;

        do {
            System.out.print("Write a number: ");
            number = getting.nextInt();
            suma = suma + number;
            i++;

        }while (number != 9999);
        prom = suma - 9999;
        System.out.println("The Loop has ended");
        System.out.println("sum "+prom);
        if (prom == 0) {
            System.out.println("The value is zero");
        }
        if (prom  > 0) {
            System.out.println("The value greater tha zero");
        }
        if (prom < 0) {
            System.out.println("The value less tha zero");
        }


    }
}
