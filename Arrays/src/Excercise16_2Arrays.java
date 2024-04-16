import java.util.ArrayList;
import java.util.Scanner;

public class Excercise16_2Arrays {
    public static  void main(String[] args){
        Scanner getting = new Scanner(System.in);

        int arrayMain[];
        int lengthArraymain;
        int index = 0;

        System.out.print("write a length: ");
        lengthArraymain = getting.nextInt();

        arrayMain = new int[lengthArraymain];

        while (true){
            System.out.print("write a number: ");
            int num = getting.nextInt();
            if (num == -1) {
                System.out.println("Exit");
                break;
            }
            if (index >= arrayMain.length) {
                int newLength = arrayMain.length*2;
                int[] newArray = new int[newLength];
                System.arraycopy(arrayMain, 0, newArray, 0, arrayMain.length);
                arrayMain = newArray;
            }
            arrayMain[index] = num;
            index++;
        }
        System.out.println("Números ingresados:");
        for (int i = 0; i < index; i++) {
            System.out.print(arrayMain[i] + " ");
        }
        System.out.println();

        getting.close();
    }
}
