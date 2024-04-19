package SortBySelection;

import java.util.Scanner;

public class Excercise24BySelection {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int length;
        int array1[];

        System.out.print("Write a length of array: ");
        length = getting.nextInt();
        array1 = new int[length];
        getting.nextLine();

        for (int i = 0; i < array1.length; i++){
            System.out.print("Write a number: ");
            array1[i] = getting.nextInt();
        }
        getting.close();

        System.out.println("");
        for (int i = 0; i <array1.length; i++){
            System.out.println("the array is: "+array1[i]);
        }

        int numMin;
        int box;

        for (int i = 0; i < array1.length; i++){
            numMin = i;
            for (int j = i+1 ; j < array1.length; j++){
                if (array1[j] < array1[numMin]){
                    numMin = j;
                }
            }

            box = array1[i];
            array1[i] = array1[numMin];
            array1[numMin] = box;
        }

        System.out.println("");
        for (int i = 0; i < array1.length; i++){
            System.out.println("array in ordenis: "+array1[i]);
        }





    }
}
