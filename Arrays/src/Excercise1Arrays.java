import java.sql.Array;
import java.util.Scanner;

public class Excercise1Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
         int array1[] = new int[5];

         for (int i = 0;i < array1.length ;i++){
             System.out.print("write a number: ");
             array1[i] = getting.nextInt();


         }
        System.out.println("The array is: ");

         for (int i = 0 ;i < array1.length;i++){
             System.out.println(array1[i]);

         }
    }
}
