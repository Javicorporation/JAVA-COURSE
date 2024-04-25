package Matrix;

import java.util.Scanner;

public class Excercise13Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows, numColumns;
        int matrix[][];


        System.out.print("Write a number of columns: ");
        numColumns = getting.nextInt();
        System.out.print("Write a number of rows: ");
        numRows = getting.nextInt();

        matrix = new int[numColumns][numRows];

        for (int i = 0; i < numColumns; i++){
            for (int j = 0; j < numRows; j++){
                System.out.print("write a number: ");
                matrix[i][j] = getting.nextInt();
            }
        }

        System.out.print("the matrix is: \n");
        for (int i = 0; i < numColumns; i++){
            for (int j = 0; j < numRows; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }

    }
}
