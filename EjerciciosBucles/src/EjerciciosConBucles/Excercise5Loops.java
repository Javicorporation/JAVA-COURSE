package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise5Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);{
            int i = 1;
            int acountPerso;
            double height;
            double result;
            double resultHeight = 0.0;

            System.out.print("Write the acount of persons: ");
            acountPerso = getting.nextInt();

            while (i <= acountPerso) {
                System.out.print("Write the height of the person: ");
                height = getting.nextDouble();
                resultHeight = resultHeight + height;
                i++;
            }
            result = resultHeight/acountPerso;
            System.out.print("the average height of people is: "+ result);





        }
    }
}
