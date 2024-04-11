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

        Set<Integer> numberiguals = new HashSet<>();
        boolean hasDuplicate = false;

        for (int i = 0; i < array1.length; i++){
            if (!numberiguals.add(array1[i])) {
                System.out.println("numero encontrado: "+array1[i]);
                hasDuplicate = true;
            }
        }
        if (!hasDuplicate) {
            System.out.println("no se repiten");
        }
    }
}
