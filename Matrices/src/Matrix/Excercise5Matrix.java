package Matrix;

import java.util.Scanner;

public class Excercise5Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows;
        int numColumns;
        int matrix[][];

        System.out.print("Write a number of rows: ");
        numRows = getting.nextInt();

        System.out.print("Write a number of colums: ");
        numColumns = getting.nextInt();

        matrix = new int[numRows][numColumns];

        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print("Write a number in the position [ "+i+" ] and [ "+j+" ]: ");
                matrix[i][j] =getting.nextInt();
            }
        }

        getting.close();

        System.out.println("\nThe matrix is: ");
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        int numBigger = matrix[0][0];
        int positionRow = 0;
        int positionColumn = 0;

        for (int i = 0 ; i < numRows; i++){
            for ( int j = 0; j < numColumns; j++){
                if (matrix[i][j] > numBigger) {
                    numBigger = matrix[i][j];
                    positionColumn = j;
                    positionRow = i;
                }
            }
        }

        System.out.println("the number bigger is : "+ numBigger + " the row is: "+positionRow+" the column is: "+positionColumn);



    }
}
