import java.util.Scanner;

public class Excercise2Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        float array2[] = new float[5];

        for (int i = 0; i< array2.length; i++){
            System.out.print("Write a number: ");
            array2[i] = getting.nextFloat();

        }

        System.out.println("the array is: ");
        for (int i = 0; i< array2.length; i++){
            System.out.println(array2[i]);

        }
    }
}
