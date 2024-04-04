package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise18Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int amount;
        int number;
        int suma = 0;
        int countpositive = 0;
        int countnegative = 0;
        int countmulti15 = 0;
        int countevent = 0;

        System.out.print("Write amount de numbers: ");
        amount = getting.nextInt();
        
        for (int i = 1; i <= amount; i++){
            System.out.print("Write a number "+i+" : ");
            number = getting.nextInt();

            if (number < 0) {
                countnegative++;

            }if (number%15 == 0) {
                countmulti15++;

            }if (number >= 0) {
                countpositive++;
            }if (number%2 == 0) {
                suma = suma + number;
            }
        }
        System.out.println("the amount of negative are: "+countnegative);
        System.out.println("the amount of positive are: "+countpositive);
        System.out.println("the amount of multiplo the 15 are: "+countmulti15);
        System.out.println("the suma of the numbers events are: "+suma);

    }
}
