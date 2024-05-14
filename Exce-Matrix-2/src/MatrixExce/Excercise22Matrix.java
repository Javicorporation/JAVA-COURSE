package MatrixExce;

import java.util.Scanner;

public class Excercise22Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numColums, numRows;

        System.out.print("Write a number of rows: ");
        numRows = sc.nextInt();
        System.out.print("Write a number of columns: ");
        numColums = sc.nextInt();

        int[][] matrix = new int[numRows][numColums];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColums; j++) {
                System.out.print("Write a number of matrix in the position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the array is: ");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColums; j++) {
                System.out.print(matrix[i][j] +"");
            }
            System.out.println();
        }


        int sumaRows;
        int sumaColumnas;

        for (int j = 0; j < numRows; j++) {
            sumaRows = 0;
            for (int i = 0; i < numColums; i++) {
                sumaRows += matrix[j][i];
            }
            System.out.println("la suma de las filas es: "+ sumaRows);
        }


        for (int j = 0; j < numColums; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < numRows; i++) {
                sumaColumnas += matrix[i][j];
            }
            System.out.println("la suma de las columnas es: "+ sumaColumnas);
        }


    }
}
