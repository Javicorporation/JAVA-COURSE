package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise31Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int number = 0;
        int contador = 0;

        do{
            System.out.print("write a number:   ");
            number = getting.nextInt();
            contador = contador + number;

        }while (number > 0);
    }
}
