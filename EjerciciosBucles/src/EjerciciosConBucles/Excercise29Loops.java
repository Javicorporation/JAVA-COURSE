package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise29Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int number1 = 0, number2 = 0, suma = 0;

        do{
            System.out.print("Write a first number: ");
            number1 = getting.nextInt();
            System.out.print("write a second number: ");
            number2 = getting.nextInt();
            suma = number1 + number2;
            System.out.println("the addition is "+suma);

        }while (suma < 100);

        System.out.println("the program ended");


    }
}
