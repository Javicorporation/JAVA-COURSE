package Matrix;

import java.util.Scanner;

public class Excercise7Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows;
        int numColumns;
        int[][] matrix;

        System.out.print("write a  number of rows: ");
        numRows = getting.nextInt();

        System.out.print("Write a number of columns: ");
        numColumns = getting.nextInt();

        matrix = new int[numRows][numColumns];

        for (int i = 0 ; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print("Write a number in the position [ "+i+" ] and [ "+j+" ]: ");
                matrix[i][j] = getting.nextInt();
            }
        }


        System.out.println("the matrix is: ");
        for (int i = 0 ; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        int box;
        for (int i = 0; i < matrix[0].length; i++){
            box = matrix[0][i];
            matrix[0][i] = matrix[1][i];
            matrix[1][i] = box;

        }

        System.out.println("the matrix result is: ");
        for (int i = 0 ; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        getting.close();
    }
}
