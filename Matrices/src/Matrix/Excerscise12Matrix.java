package Matrix;

import java.util.Scanner;

public class Excerscise12Matrix {

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

        int lastrow = matrix.length-1;
        System.out.println("\nthe result last row is: ");
        for (int i = 0; i < matrix[lastrow].length; i++){
            System.out.print(matrix[lastrow][i]+" ");
        }


        System.out.println("\nthe result first column is: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][0]+" ");
        }

        System.out.println("\nthe result last column is: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][matrix[i].length-1]+" ");
        }

        System.out.println("the result is: ");
        for (int i = 0; i < numRows-1; i++){
            System.out.print(matrix[0][i]+" ");
        }

        System.out.println("\nthe result is: ");
        for (int i = 0; i < numRows-1; i++){
            System.out.print(matrix[matrix.length-1][i]+" ");
        }


        System.out.println("\nthe result is: ");
        for (int i = 0; i < numRows; i++){
            System.out.print(matrix[i][0]+" ");
        }

        getting.close();
    }
}
