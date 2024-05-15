package MatrixExce;

import java.util.Scanner;

public class excercise25Matrix {
    public static void main(String[] args){
        Scanner getting = new Scanner(System.in);
        int numRows, numCols;

        System.out.print("write a number of rows: ");
        numRows = getting.nextInt();
        System.out.print("Write a number of cols: ");
        numCols = getting.nextInt();
        getting.nextLine();
        String [][] matrix = new String[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Write a number of the matrix: ");
                matrix[i][j] = getting.nextLine();
            }
        }

        System.out.println("result is: ");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        String auxiliar ;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < i; j++) {
                auxiliar = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = auxiliar;
            }
        }

        System.out.println("result is: ");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }



    }
}
