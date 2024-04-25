package Matrix;

import java.util.Scanner;

public class Excercise16Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows, numColumns;
        int matrix[][];

        System.out.print("Write a rows: ");
        numRows = getting.nextInt();
        System.out.print("Write a columns: ");
        numColumns = getting.nextInt();

        matrix = new int[numRows][numColumns];


        for (int i = 0 ; i < numRows; i++){
            for (int j = 0 ; j < numColumns; j++){
                int numX = (int)(Math.random()*99);
                matrix[i][j] = numX;
            }
        }

        for (int i = 0 ; i < numRows; i++){
            for (int j = 0 ; j < numColumns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }




    }
}
