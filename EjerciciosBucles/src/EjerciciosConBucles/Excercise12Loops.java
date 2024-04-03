package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise12Loops {
public static void main(String[] args) {
    Scanner getting = new Scanner(System.in);{

        int i = 1;
        int amount;
        int evenNumber = 0;
        int oddNumber = 0;
        int value;

        System.out.print("write a amount: ");
        amount = getting.nextInt();

        while (i <= amount) {
            System.out.print("Write the amount the that iterator: ");
            value = getting.nextInt();

            if (value%2 != 0) {
                oddNumber = oddNumber +1;
                System.out.println(i);
            } else if (value%2 == 0) {
                evenNumber++;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("evens numbers are: "+evenNumber);
        System.out.println("odds numbers are: "+oddNumber);

    }
}
}
