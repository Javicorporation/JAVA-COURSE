import java.util.Scanner;

public class excercise5Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int negative = 0;
        int positive = 0;
        int par = 0;
        int impar = 0;
        int array1[];
        int number;

        System.out.print("write a leng: ");
        number = getting.nextInt();
        array1 = new int[number];

        for (int i=0; i < array1.length; i++){
            System.out.print("write a number: ");
            array1[i] = getting.nextInt();
        }

        for (int i=0; i < array1.length; i++){
            if (array1[i] < 0) {
            } else if (array1[i] > 0) {
                
            } else if (array1[i]%2 == 0) {
                
            } else if (array1[i]%2 == 1) {

            }
        }
        




    }
}
