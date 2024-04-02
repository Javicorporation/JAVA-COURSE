package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise3Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int i = 1;
        int number;
        int multiplication = 0;
        double result ;

        while (i <=10){
            System.out.print("write a number: ");
            number = getting.nextInt();
            multiplication = multiplication + number;
            i++;
        }
        result = multiplication;
        System.out.println("the result is: "+result);
    }
}
