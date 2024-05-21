package MatricesIregulares;

import java.util.Scanner;

public class Excercise2MatrixIrregularRemaster {

    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirNRows = "Write a number of rows: ";
    public static final String msgPedirNCols = "Write a number of columns: ";
    public static final String msgPedirNumber = "Write a number: ";

    public static int pedirNumber(String mensaje) {
        System.out.print(mensaje);
        return getting.nextInt();
    }

    public static void imprimirMatrix(int[][] matrix){
        System.out.println("la matrix es: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int numRows = pedirNumber(msgPedirNRows);
        int[][] matrix  = new int [numRows][];

        for (int i = 0; i < numRows; i++) {
            int numColumns = pedirNumber(msgPedirNCols);
            matrix[i] = new int[numColumns];
            for (int j = 0; j < numColumns; j++) {
                matrix[i][j] = pedirNumber(msgPedirNumber);
            }
        }
        System.out.println();
        imprimirMatrix(matrix);
    }
}
