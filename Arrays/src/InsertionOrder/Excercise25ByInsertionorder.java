package InsertionOrder;

import java.util.Scanner;

public class Excercise25ByInsertionorder {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int length;
        int array1[];

        System.out.print("Write a length of array: ");
        length  = getting.nextInt();
        array1 = new int[length];


        for (int i = 0; i < array1.length; i++){
            System.out.print("Write a length of array: ");
            array1[i] = getting.nextInt();
        }
        getting.close();

        System.out.println("");
        for (int i = 0; i < array1.length; i++){
            System.out.println("Write a number:"+array1[i]);
        }

        int position;
        int box;

        for (int i = 0; i < array1.length; i++){
            position = i;
            box = array1[i];

            while ((position > 0) && (array1[position-1] > box)){
                array1[position] = array1[position - 1];
                position--;
            }
            array1[position] = box;
        }

        System.out.println("");
        for (int i = 0; i < array1.length; i++){
            System.out.println("Write a number:"+array1[i]);
        }





    }
}
