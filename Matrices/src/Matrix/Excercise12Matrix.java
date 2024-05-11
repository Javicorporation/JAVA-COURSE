package Matrix;

import java.util.Scanner;

public class Excercise12Matrix {

    public static  void main(String[] args){
        Scanner getting = new Scanner(System.in);

        int numRows, numColumns;
        int matrix[][];

        System.out.print("Write a number of rows: ");
        numRows = getting.nextInt();
        System.out.print("Write a number of columns: ");
        numColumns = getting.nextInt();
        matrix = new int[numRows][numColumns];

        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print("write a number: ");
                matrix[i][j] = getting.nextInt();
            }
        }

        System.out.print("the matrix is: \n");
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }


        System.out.println("the result first row: ");
        for (int i = 0; i < matrix[0].length; i++){
            System.out.print(matrix[0][i]+" ");
        }



        int lastRow = matrix.length-1;
        System.out.println("\nthe result last row is: ");
        for (int i = 0; i < matrix[lastRow].length; i++){
            System.out.print(matrix[lastRow][i]+" ");
        }


        System.out.println("\nthe result first column is: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][0]+" ");
        }


        System.out.println("\nthe result last column is: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][matrix[i].length-1]+" ");
        }
        getting.close();
    }
}
