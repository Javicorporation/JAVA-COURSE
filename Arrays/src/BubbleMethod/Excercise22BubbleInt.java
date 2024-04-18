package BubbleMethod;

import java.util.Scanner;

public class Excercise22BubbleInt {

    // values INT ENTEROS
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int array1[];
        int length;
        int auxiliar = 0;

        System.out.print("Write a length: ");
        length = getting.nextInt();
        array1 = new int[length];

        for (int i = 0; i < array1.length; i++){
            System.out.print("Write a number: ");
            array1[i] = getting.nextInt();
        }

        getting.close();

        for (int i = 0 ; i < array1.length-1;i++){
            for (int j = 0; j < array1.length-1; j++){
                if (array1[j] > array1[j+1]) {
                    auxiliar = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = auxiliar;
                }
            }
        }

        for (int i = 0; i < array1.length; i++){
            System.out.println("Array  is: "+array1[i]);
        }



    }
}
