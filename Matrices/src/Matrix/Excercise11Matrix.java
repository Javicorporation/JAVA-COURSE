package Matrix;

import java.util.Scanner;

public class Excercise11Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows;
        int numColumns;
        int[][] matrix;

        System.out.print("write num of rows: ");
        numRows = getting.nextInt();
        System.out.print("Write num of columns: ");
        numColumns = getting.nextInt();

        matrix = new int[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print("Write a number in the position [ " + i + " ] and [ " + j + " ] is : ");
                matrix[i][j] = getting.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }


        System.out.println("Center elements are: ");
        int startRow = numRows / 2;
        int startColumn = numColumns / 2;

        if (numRows % 2 != 0 && numColumns % 2 != 0) {
            System.out.println(matrix[startRow][startColumn]);
        } else {
            System.out.println(matrix[startRow][startColumn]);
            if (numRows % 2 != 0 || numColumns % 2 != 0) { // One odd
                if (startRow - 1 >= 0) {
                    System.out.println(matrix[startRow - 1][startColumn]);
                }
                if (startColumn - 1 >= 0) {
                    System.out.println(matrix[startRow][startColumn - 1]);
                }
            } else { // Both even
                System.out.println(matrix[startRow - 1][startColumn]);
                System.out.println(matrix[startRow][startColumn - 1]);
                System.out.println(matrix[startRow - 1][startColumn - 1]);
            }
        }
    }
}
