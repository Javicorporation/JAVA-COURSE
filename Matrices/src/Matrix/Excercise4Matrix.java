package Matrix;

import java.util.Scanner;

public class Excercise4Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int numRows;
        int numColumns;
        String matrix[][];

        System.out.print("Write a number of rows: ");
        numRows = getting.nextInt();

        System.out.print("Write a number of columns: ");
        numColumns = getting.nextInt();

        matrix = new String[numRows][numColumns];


        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print("Write a string of the positoion [ "+i+" ] and [ "+j+" ]: ");
                matrix[i][j] = getting.next();
            }
        }
        getting.close();


        System.out.println("the matrix");
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }

        System.out.println("the last row is: ");
        for (int i = 0; i < matrix[matrix.length-1].length; i++){
            System.out.print(matrix[matrix.length-1][i]+"");
        }





    }
}
