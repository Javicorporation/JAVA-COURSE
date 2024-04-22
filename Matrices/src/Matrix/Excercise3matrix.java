package Matrix;

import java.util.Scanner;

public class Excercise3matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows;
        int numColumns;
        int matrix[][];

        System.out.print("Write a number of rows: ");
        numRows = getting.nextInt();

        System.out.print("Write a number of columns: ");
        numColumns = getting.nextInt();

        matrix = new int[numRows][numColumns];

        for (int i = 0; i < numRows;i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print("Write a number of the position [ "+i+" ] and [ "+j+" ] of matrix: ");
                matrix[i][j] = getting.nextInt();
            }
        }
        getting.close();

        System.out.println("\nthe matrix is: ");

        for (int i = 0; i < numRows;i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        // print last row
        System.out.println("\nthe last row");
        for (int i = 0 ; i < matrix[matrix.length-1].length; i++){
            System.out.print(matrix[matrix.length-1][i] +" ");
        }









    }
}
