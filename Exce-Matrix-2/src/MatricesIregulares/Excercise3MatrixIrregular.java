package MatricesIregulares;

import java.util.Scanner;

public class Excercise3MatrixIrregular {
    public static void main (String[] args){
        Scanner getting = new Scanner(System.in);

        int numberRows;
        int numberColum;

        System.out.print("Write a number of rows: ");
        numberRows = getting.nextInt();
        String [][] matrix = new String[numberRows][];



        for (int i = 0; i < numberRows; i++) {

            System.out.print("Write a number of columns: ");
            numberColum = getting.nextInt();
            matrix[i] = new String[numberColum];
            getting.nextLine();

            for (int j = 0; j < numberColum; j++) {
                System.out.print("write a String: ");
                matrix[i][j] = getting.nextLine();
            }
        }

        System.out.println();
        System.out.println("result");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
