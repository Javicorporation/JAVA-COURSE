package MatrixExce;

import java.util.Scanner;

public class Excercise25MatrixRemaster {
    public static final Scanner getting = new Scanner(System.in);
    public static  final String msgpedirNRows = "escribe el numero de filas: ";
    public static  final String msgpedirNCols = "escribe el numero de columnas: ";
    public static  final String msgpedirNumeros = "escribe una cadena de la matris: ";


    public static String pedirN(String message){
        System.out.print(message);
        return getting.nextLine();
    }

    public static void imprimirM(String[][] matrix){
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static String[][] invertir(String[][] matrix){
        String auxiliar = "";
        int numRow = matrix.length;
        int numCol = matrix[0].length;

        System.out.println();
        System.out.println("el resultado es: ");
        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < i; j++) {
                auxiliar = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = auxiliar;
            }
        }
        return matrix;

    }







    public static void main(String[] args){
        int numR = Integer.parseInt(pedirN(msgpedirNRows));
        int numC = Integer.parseInt(pedirN(msgpedirNCols));

        String[][] matris = new String[numR][numC];

        for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numC; j++) {
                matris[i][j] = pedirN(msgpedirNumeros);
            }
        }
        imprimirM(matris);

        String[][] result = invertir(matris);

        imprimirM(result);



    }
}
