package Matrix;

import java.util.Scanner;

public class Excercise9Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows;
        int numColumns;
        char[][] matrix;

        System.out.print("write num of rows: ");
        numRows = getting.nextInt();
        System.out.print("Write num of columns: ");
        numColumns = getting.nextInt();

        matrix = new char[numRows][numColumns];

        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print("Write a character: ");
                matrix[i][j] = getting.next().charAt(0);
            }
        }

        System.out.println("The matrix is: ");
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("result");
        System.out.print(matrix[0][0]+" ");
        System.out.print(matrix[0][numColumns-1]);
        System.out.print("\n"+matrix[numRows-1][0]+" ");
        System.out.print(matrix[numRows-1][numColumns-1]);

        getting.close();

    }
}
