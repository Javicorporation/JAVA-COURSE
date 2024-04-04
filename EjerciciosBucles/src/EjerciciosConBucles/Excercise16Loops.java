package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise16Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int amount = 12;
        int number,multiplication;

        System.out.print("write the number: ");
        number = getting.nextInt();

        for (int i = 1; i <= amount; i++){
            multiplication=i+number;

            System.out.println( i+" * "+number+" = "+multiplication);
        }
    }
}
