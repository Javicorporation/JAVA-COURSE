import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Excercise18Arrays {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        String array1[], array2[], array3[];
        int lengthArrays;

        System.out.print("Write a length: ");
        lengthArrays = getting.nextInt();

        array1 = new String[lengthArrays];
        array2 = new String[lengthArrays];
        array3 = new String[array1.length + array2.length];
        getting.nextLine();


        System.out.println("array 1");
        for(int i = 0; i < array1.length; i++){
            System.out.print("Write a String of array 1: ");
            array1[i] = getting.nextLine();
        }
        System.out.println("array 2");
        for(int i = 0; i < array2.length; i++){
            System.out.print("Write a String of array 2: ");
            array2[i] = getting.nextLine();
        }

        for (int i = 0; i < lengthArrays; i++){
            array3[i] = array1[i];
            array3[i+lengthArrays] = array2[i];
        }


        System.out.println("");
        for (int i = 0; i < array3.length; i++){
            System.out.println("array 3: "+array3[i]);
        }


    }
}
