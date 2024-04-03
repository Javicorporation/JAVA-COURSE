package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise11Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);{

            int i = 1;
            int amount;
            System.out.print("Write a amount: ");
            amount = getting.nextInt();

            while(i <= amount){
                if (i%5 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
