import java.util.Scanner;

public class Excercise7Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int lengthN;
        int array1[];

        System.out.print("write a number of array: ");
        lengthN = getting.nextInt();
        array1 = new int[lengthN];

        for (int i = 0; i< array1.length; i++){
            System.out.print("Write a number: ");
            array1[i] = getting.nextInt();
        }

        int evager = array1[0];
        int minor = array1[0];

        for (int i = 0; i< array1.length; i++){
            if(evager < array1[i]){
                evager = array1[i];

            }
            if (minor > array1[i]) {
               minor = array1[i];
            }
        }

        System.out.println("the value average is: "+evager);
        System.out.println("the value minor is: "+minor);
    }

}
