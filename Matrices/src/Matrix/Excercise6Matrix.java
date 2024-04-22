package Matrix;

import java.util.Scanner;

public class Excercise6Matrix {
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
                matrix[i][j] = getting.nextInt();
            }
        }

        System.out.println("the matrix is: ");
        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        // number bigger and minor
        int numBigger = matrix[0][0];
        int numMinor = matrix[0][0];
        int positionRowBigg =0, positioRowMinor = 0;
        int positionColumnBigg =0, positioColumnsMinor = 0;


        for (int i = 0; i < numRows; i++){
            for (int j = 0; j < numColumns; j++){
                if(matrix[i][j] > numBigger){
                    numBigger = matrix[i][j];
                    positionRowBigg = i;
                    positionColumnBigg = j;
                }

                if(matrix[i][j] < numMinor){
                    numMinor = matrix[i][j];
                    positioRowMinor = i;
                    positioColumnsMinor = j;

                }
            }
        }
        System.out.println("the number bigger is : "+ numBigger + " the row is: "+positionRowBigg+" the column is: "+positionColumnBigg);
        System.out.println("the number minor is : "+ numMinor + " the row is: "+positioRowMinor+" the column is: "+positioColumnsMinor);




    }
}
