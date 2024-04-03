package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise9Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);{

            int i = 0;
            int amount;
            int value = 9;
            System.out.print("Write amount the repetitions: ");
            amount = getting.nextInt();

            while (i <= amount) {
                System.out.println(""+value);
                value+=9;
                i++;

            }
        }
    }
}
