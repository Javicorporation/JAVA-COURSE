import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Excercise16Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int lengthN = 5;

        int array1[];
        int array2[];
        int arrayUni[];

        array1 = new int[lengthN];
        array2 = new int[lengthN];

        for (int i = 0; i < array1.length; i++){
            System.out.print("Write a number of array 1: ");
            array1[i] = getting.nextInt();
        }
        for (int i = 0; i < array2.length; i++){
            System.out.print("Write a number of array 2: ");
            array2[i] = getting.nextInt();
        }
        getting.close();

        arrayUni = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
        System.out.println(Arrays.toString(arrayUni));




    }
}
