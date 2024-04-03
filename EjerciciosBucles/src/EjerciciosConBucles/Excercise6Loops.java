package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise6Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);{
            double rating;
            int ratingsMax = 0;
            int ratingsMin = 0;
            int amount = 10;
            int i = 1;

            while (i <= amount){
                System.out.print("Write the rating "+i+": ");
                rating = getting.nextDouble();
                i++;
                if (rating >= 7) {
                    ratingsMax++;
                } else if (ratingsMin < 7) {
                    ratingsMin++;
                }
            }

            System.out.println("notes greater than 7 are: "+ratingsMax);
            System.out.println("notes less than 7 are: "+ratingsMin);

        }
    }
}
