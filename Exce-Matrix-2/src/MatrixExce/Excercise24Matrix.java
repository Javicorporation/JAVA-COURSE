package MatrixExce;

import java.util.Scanner;

public class Excercise24Matrix {
    public static void  main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numberRows;
        int numberCols;
        System.out.print("Write a number of Rows: ");
        numberRows = getting.nextInt();
        System.out.print("Write a number of Columns: ");
        numberCols = getting.nextInt();
        int[][] matrix = new int[numberRows][numberCols];


        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberCols; j++) {
                System.out.print("Write a number of the matrix:");
                matrix[i][j] = getting.nextInt();
            }
        }

        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberCols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // transponemos la matris
        // pata transponer una matris necesitamos un valor auxiliar
        int auxiliar = 0;
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberCols; j++) {
                auxiliar = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = auxiliar;
            }
        }

        System.out.println();
        System.out.println("The result is: ");
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberCols; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
