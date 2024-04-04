package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise14Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int i = 1;
        int amount = 10;
        int suma = 0;
        int number;

        while (i <= amount) {
            System.out.print("Write a number: ");
            number = getting.nextInt();
            if(i >= 6){
                suma = suma + number;
            }
            i++;
        }
        System.out.println(suma);

    }
}
