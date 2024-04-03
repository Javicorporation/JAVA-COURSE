package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise7Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);{
            int i = 1;
            int amount = 10;
            int multipleof3 = 0;
            int number;


            while (i <= amount) {
                System.out.print("Write a  number "+i+": ");
                number = getting.nextInt();
                i++;
                if (number%3 == 0){
                    multipleof3++;
                }
            }
            System.out.println("the multiple of 3 are: "+multipleof3);


        }
    }
}
