package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise13Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int i = 1;
        int j = 1;
        int value1;
        int suma1 = 0;
        int value2;
        int suma2 = 0;


        System.out.println("escriba la lista 1");
        while (i <= 3){
            System.out.print("value the list one: ");
            value1 = getting.nextInt();
            suma1 = suma1 + value1;
            i++;

        }
        System.out.println("escriba la lista 2");
        while (j <= 3) {
            System.out.print("value the list two: ");
            value2 = getting.nextInt();
            suma2 = suma2 + value2;
            j++;

        }

        System.out.println("suma 1: "+suma1);
        System.out.println("suma 2: "+suma2);

        if (suma1 > suma2){
            System.out.println("the list 1 is greater");
        } else if (suma2 > suma1) {
            System.out.println("the list 2 is greater");
        }else {
            System.out.println("son iquals");
        }

    }
}
