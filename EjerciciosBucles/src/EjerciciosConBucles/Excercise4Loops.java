package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise4Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int amount;
        int i = 1;
        double length;
        int counterBooks = 0;

        System.out.print("Write the amount: ");
        amount = getting.nextInt();

        while (i <= amount){
            System.out.print("Write the length: ");
            length = getting.nextDouble();

            if (length >= 1.20 && length <= 1.30) {
                counterBooks++;
            }
            i++;
        }
        System.out.print("the counter of books valids is: "+ counterBooks);


    }


}
