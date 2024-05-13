package MatrixExce;

import java.util.Scanner;

public class Excercise21Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows;
        int numCols;
        int matrix [][];
        int matrixResult [][];



        System.out.print("Write a number of rows: ");
        numRows = sc.nextInt();
        System.out.print("Write a number of columns: ");
        numCols = sc.nextInt();
        matrix = new int[numRows][numCols];
        matrixResult = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Write a number of matrix: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The result is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixResult[i][j] = matrix[i][j]+matrix[i][j];
            }
        }


        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult.length; j++) {
                System.out.print(matrixResult[i][j]+"\t");
            }
            System.out.println();
        }


        System.out.println("The result is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixResult[i][j] = matrix[i][j]-matrix[i][j];
            }
        }


        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult.length; j++) {
                System.out.print(matrixResult[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("The result is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixResult[i][j] = matrix[i][j]*matrix[i][j];
            }
        }


        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult.length; j++) {
                System.out.print(matrixResult[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
