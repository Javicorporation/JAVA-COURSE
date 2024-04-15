import java.util.Scanner;

public class Excercise13Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int lengthN;
        int arrayMain[];
        int arrayInvert[];


        System.out.println("Write a length of array: ");
        lengthN = getting.nextInt();
        arrayMain = new int[lengthN];
        getting.nextLine();

        for (int i = 0; i < arrayMain.length; i++){
            System.out.println("write a number;");
            arrayMain[i] = getting.nextInt();
        }
        getting.close();

        // array para invertir el array anterior
        arrayInvert = new int[arrayMain.length];

        for (int i = arrayMain.length-1, j = 0; i >= 0;i--,j++ ){
            arrayInvert[j] = arrayMain[i];
        }

        System.out.println();
        for (int i = 0; i < arrayMain.length; i++){
            System.out.println(arrayMain[i]);
        }

        System.out.println();
        for (int i = 0; i < arrayInvert.length; i++){
            System.out.println(arrayInvert[i]);
        }



    }
}
