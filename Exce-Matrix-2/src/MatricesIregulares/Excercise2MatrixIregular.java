package MatricesIregulares;

import java.util.Scanner;

public class Excercise2MatrixIregular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows ;
        int matrixIrre[][];

        System.out.print("Write a number of rows: ");
        numRows = sc.nextInt();

        matrixIrre = new int[numRows][];
        for (int i = 0; i < matrixIrre.length; i++) {
            System.out.print("Write a number of matrix columns: ");
            int numCols = sc.nextInt();
            matrixIrre[i] = new int[numCols];

            for (int j = 0; j < matrixIrre[i].length; j++) {
                System.out.print("write a number of matrix: ");
                matrixIrre[i][j] = sc.nextInt();
            }
        }


        System.out.println();
        System.out.println("result");
        for (int i = 0; i < matrixIrre.length; i++) {
            for (int j = 0; j < matrixIrre[i].length; j++) {
                System.out.print(matrixIrre[i][j] + " ");
            }
            System.out.println();
        }
    }
}
