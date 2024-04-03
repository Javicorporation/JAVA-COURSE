package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise8Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);{

            int i = 0;
            int amount = 25;
            int value = 11;

            while (i < amount) {
                System.out.println(value);
                i++;
                value+=11;
            }
        }
    }
}
