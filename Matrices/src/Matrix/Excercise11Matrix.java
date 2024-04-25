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
        int startRow = numRows / 4;
        int endRow = numRows - startRow;
        int startColumn = numColumns / 4;
        int endColumn = numColumns - startColumn;

        for (int i = startRow; i < endRow; i++) {
            for (int j = startColumn; j < endColumn; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
}
