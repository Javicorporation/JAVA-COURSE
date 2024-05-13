package MatrixExce;

import java.util.Scanner;

public class Excercise21MatrixRemaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRows;
        int numCols;
        int matrix [][];
        int matrixResult [][];

        System.out.print("Write the number of rows: ");
        numRows = sc.nextInt();
        System.out.print("Write the number of columns: ");
        numCols = sc.nextInt();

        matrix = new int[numRows][numCols];
        matrixResult = new int[numRows][numCols];

        // ingreso de valores de la matrix
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter the element at position (" + i + ", " + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // llamada a los metodos
        suma(matrix,matrixResult);
        printMatrix("el resultado es: ", matrixResult);





        /*
        addMatrix(matrix, matrixResult);
        printMatrix("Addition Result:", matrixResult);

        subtractMatrix(matrix, matrixResult);
        printMatrix("Subtraction Result:", matrixResult);

        multiplyMatrix(matrix, matrixResult);
        printMatrix("Multiplication Result:", matrixResult);
         */
    }

    /*
    metodo de division
    para crear un metodo bemos usar

    public static void divicion(){
    }
    */
    public static void divicion(int [][] matrix, int[][] result){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j] / matrix[i][j];
            }
        }
    }

    public static void suma(int [][] matrix, int [][] result){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[i][j] + matrix[i][j];
            }
        }
    }



    // Method to print a matrix
    public static void printMatrix(String label, int[][] matrix) {
        System.out.println(label);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
