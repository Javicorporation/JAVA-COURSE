package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise28Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int number;
        int factorial = 1;

        System.out.print("Write a number factorial: ");
        number = getting.nextInt();

        for (int i = number; i > 0; i--){
            factorial = factorial * i;
        }

        System.out.println("number factorial is: "+ factorial);
    }
}
