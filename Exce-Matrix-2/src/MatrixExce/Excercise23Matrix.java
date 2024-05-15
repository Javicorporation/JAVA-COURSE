package MatrixExce;

import java.util.Scanner;

public class Excercise23Matrix {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numberRows;
        int numbersColumns;

        System.out.print("Write a number of rows: ");
        numbersColumns = getting.nextInt();
        System.out.print("Writen a number of columns: ");
        numberRows = getting.nextInt();
        char [][] matrix = new char[numberRows][numbersColumns];


        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numbersColumns; j++) {
                System.out.print("Write a number of the matrix: ");
                matrix[i][j] = getting.next().charAt(0);
            }
        }

        System.out.println("Result");
        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numbersColumns; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        int sumacol, sumafil;

        for (int i = 0; i < numberRows; i++) {
            sumafil = 0;
            for (int j = 0; j < numbersColumns; j++) {
                sumafil += matrix[i][j];
            }
            System.out.println("La suma de la matris es : "+sumafil);
        }


        for (int j = 0; j < numbersColumns; j++) {
            sumacol = 0;
            for (int i = 0; i < numberRows; i++) {
                sumacol += matrix[j][i];
            }
            System.out.println("la suma de columnas es: "+ sumacol);
        }




    }
}
