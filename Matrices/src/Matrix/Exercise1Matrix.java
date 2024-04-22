package Matrix;

import java.util.Scanner;

public class Exercise1Matrix {
    public static  void main(String[] args){
        Scanner getting =new Scanner(System.in);


        int matrix [][];
        int numberRows;
        int numberColumn;

        System.out.print("Number of rows: ");
        numberRows = getting.nextInt();
        System.out.print("Number of columns: ");
        numberColumn = getting.nextInt();

        matrix = new int[numberRows][numberColumn];


        for (int i = 0; i < numberRows; i++){
            for (int j = 0; j < numberColumn; j++){
                System.out.print("Write a number: "+"[ "+i+" ] , [ "+j+" ] : ");
                matrix [i][j] = getting.nextInt();
            }
        }

        System.out.println("");
        // show
        for (int i = 0; i < numberRows; i++){
            for (int j = 0; j < numberColumn; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }





    }
}
