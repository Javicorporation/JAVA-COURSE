package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise15Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        System.out.println();

        double base, altura, area;
        int amount;
        int i = 1;
        int areastr = 0;

        System.out.print("Write the amount of evens: ");
        amount = getting.nextInt();

        while (i <= amount) {
            System.out.print("Write base of triangle "+i+": ");
            base = getting.nextDouble();

            System.out.print("Write base "+i+": ");
            altura = getting.nextDouble();

            area = base * altura;
            System.out.println("the base is: "+base);
            System.out.println("the height is: "+altura);
            System.out.println("the area is: "+area);
            System.out.println("");

            if (area > 12) {
                areastr++;
            }
            i++;
        }
        System.out.println("the areas height a 12 are: "+areastr);

    }
}
