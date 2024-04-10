import java.util.Scanner;

public class Excercise3Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int array1[] = new int[5];
        int array2[] = new int[5];
        double addition1 = 0, average1 = 0;
        double addition2 = 0, average2 = 0;


        for (int i = 0; i < array1.length ; i++){
            System.out.print("Write a number of array 1: ");
            array1[i] = getting.nextInt();
            addition1 = addition1 + array1[i];
        }


        for (int i = 0; i < array1.length ; i++){
            System.out.print("Write a number of array 2: ");
            array2[i] = getting.nextInt();
            addition2 = addition2 + array2[i];
        }

        average1 = addition1/5;
        average2 = addition2/5;
        System.out.println("");
        System.out.println("the average is: "+average1);
        System.out.println("the average is: "+average2);

        System.out.println("");
        if (average1 > average2) {
            System.out.println("the average greate is: "+average1);
        } else if (average2 > average1) {
            System.out.println("the average greate is: "+average2);
        }


    }
}
