import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class excercise10Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int lengthN;
        int array1[];

        System.out.print("Writea a length of array: ");
        lengthN = getting.nextInt();
        getting.nextLine();
        array1 = new int[lengthN];

        for (int i = 0; i < array1.length; i++){
            System.out.print("write a number: ");
            array1[i] = getting.nextInt();
        }
        getting.close();

        int minor = array1[0];
        int amountRepit = 0;

        for (int i = 0; i < array1.length; i++){
            if (array1[i] < minor) {
                minor = array1[i];
            }
            if (minor == array1[i]) {
                amountRepit++;
            }
        }
        System.out.println("the minor is: "+minor);
        System.out.println("the amount of repit is: "+amountRepit);

    }
}
