package MatricesIregulares;

import java.util.Scanner;

public class Excercise4MatrixIrregular {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows = 5;
        // int numCols ;

        /*
        System.out.print("write a number of matrix rows : ");
        numRows = getting.nextInt();*/

        int [][] matrix = new int[numRows][];
        System.out.println("rellene la matris.");
        for (int i = 0; i < numRows; i++) {
            //System.out.print("write a number of matrix columns : ");
            //numCols = getting.nextInt();
            matrix[i] = new int[i+1];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Write a number: ");
                matrix[i][j] = getting.nextInt();
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
}
