package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise27Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int number;
        int div2 = 0, div3 = 0, div23 = 0;
        int suma = 0;

        System.out.print("Write a number: ");
        number = getting.nextInt();

        for (int i=1; i <= number; i++){
            if (i%2 == 0 && i%3 == 0 ) {
                div23 = div23 + i;
                System.out.println("the number is: "+ i);
            } else if (i%2 == 0) {
                div2 = div2 + i;
                System.out.println("the number is: "+ i);
            }else if (i%3 == 0) {
                div3 = div3 + i;
                System.out.println("the number is: "+ i);
            }
            suma = div2+div3+div23;
        }
        System.out.println(suma);

    }
}
