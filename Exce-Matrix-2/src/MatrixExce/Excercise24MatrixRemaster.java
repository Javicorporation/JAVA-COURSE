package MatrixExce;

import java.util.Scanner;

public class Excercise24MatrixRemaster {
    public static final Scanner getting = new Scanner(System.in);
    public static final String pedirNumRow = "Escribe el umero de filas: ";
    public static final String pedirNumCol = "Escribir el numero de columnas: ";
    public static final String perdiNumeros = "Escribe un numero de la matris: ";

    //pedir numeros
    public static int pedirNumColR (String message){
        System.out.print(message);
        return getting.nextInt();
    }


    //pedir numeros
    public static void imprimirM (int[][] matrix){
        System.out.println("la matris original es:");
        for (int [] row : matrix){
            for (int elemento : row){
                System.out.print(elemento+" ");
            }
            System.out.println();
        }
    }

    public static void invertir(int [][]matrix){
        int nunRows = matrix.length;
        int numCols = matrix[0].length;
        int auxi = 0;

        for (int i = 0; i < nunRows; i++) {
            for (int j = 0; j < i; j++) {
                auxi = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = auxi;
            }
        }
    }
    public static void imprimirMDF(int[][] matrix) {
        System.out.println("la matris transpuesta es: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        // definicion de variables y objetos
        int nRows = pedirNumColR(pedirNumRow);
        int nCols = pedirNumColR(pedirNumCol);
        int[][] matrix = new int[nRows][nCols];

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                matrix[i][j] = pedirNumColR(perdiNumeros);
            }
        }
        imprimirM(matrix);

        invertir(matrix);

        imprimirMDF(matrix);


    }
}
