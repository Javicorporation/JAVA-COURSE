package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise10Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);{

            int i = 1;
            int amount = 10;
            while (i<= amount){
                if (i%2 == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
