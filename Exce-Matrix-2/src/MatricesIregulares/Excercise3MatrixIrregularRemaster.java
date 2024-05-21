package MatricesIregulares;

import java.util.Scanner;

public class Excercise3MatrixIrregularRemaster {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirRows = "Escribe el numero de filas: ";
    public static final String msgPedirColum = "Escribe el numero de columnas: ";
    public static final String msgPedirString = "Escribe una cadena: ";


    public static  String pedir(String message){
        System.out.print(message);
        return getting.nextLine();
    }


    public static void imprimirM(String[][] matrix){
        System.out.println("la matris es: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args){
        int numRows = Integer.parseInt(pedir(msgPedirRows));
        String[][] matrix = new String[numRows][];


        for (int i = 0; i < numRows; i++) {
            int numCol = Integer.parseInt(pedir(msgPedirColum));
            matrix[i] = new String[numCol];

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = pedir(msgPedirString);
            }
        }

        System.out.println();
        imprimirM(matrix);

    }
}
