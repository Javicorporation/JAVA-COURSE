package MatricesIregulares;

import java.util.Scanner;

public class Excercise5MatrixIrregularRemaster {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgNumRows = "Enter the number of rows: ";
    public static final String msgNumCols = "Enter the number of columns: ";
    public static final String msgNumber = "Enter a number of the matrix: ";
    /*
    public static final String msgNumRows = "Enter the number of rows: ";
    public static final String msgNumCols = "Enter the number of columns: ";
    public static final String msgNumber = "Enter a number of the matrix: ";
    */

    public static int  pedir(String message){
        System.out.print(message);
        return getting.nextInt();
    }

    public static void imprimirM(int[][] matrix){
        System.out.println("el resultado es: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int operMemor(int[][] matrix){
        int menor = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < menor) {
                    menor = matrix[i][j];
                }
            }
        }
        return menor;
    }

    public static int operMayor(int[][] matrix){
        int mayor = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j] > mayor) {
                    mayor = matrix[i][j];
                }
            }
        }
        return mayor;
    }

    public static Double operMedia(int[][] matrix){
        int suma = 0;
        int longit = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                suma += matrix[i][j];
                longit++;
            }
        }
        double resultado = (double) suma /longit;
        return resultado;
    }






    public static void main(String[] args) {
        int numRows = pedir(msgNumRows);
        int[][] matrix = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            int numColm = pedir(msgNumCols);
            matrix[i] = new int[numColm];
            for (int j = 0; j < numColm; j++) {
                matrix[i][j] = pedir(msgNumber);
            }
        }
        imprimirM(matrix);
        System.out.println();
        System.out.println("el numero menor es: "+ operMemor(matrix));
        System.out.println("el numero mayor es: "+ operMayor(matrix));
        System.out.println("el numero medio es: "+ operMedia(matrix));


    }
}
