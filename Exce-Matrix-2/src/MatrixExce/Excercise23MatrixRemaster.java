package MatrixExce;

import java.util.Scanner;

public class Excercise23MatrixRemaster{

    public static  final Scanner getting = new Scanner(System.in);
    public static final String numerosFilas = "escribe el numero de filas: ";
    public static final String numeroColumsas = "escribe el numero de columnas: ";
    public static final String ingresarNumeros = "Escribe el numero de la matris en la posiscion [%d], [%d]:";
    public static final String sumaDeFilas = "La suma de las filas es: [%d]";
    public static final String sumaDeColumnas= "La suma de las columnas es: [%d]";


    //pedimos
    public static int getImput(String mensaje){
        System.out.print(mensaje);
        return getting.nextInt();
    }


    public static char getImputChar(String mensaje){
        System.out.print(mensaje);
        return getting.next().charAt(0);
    }

    // imprimimos
    public static void imprimirValores(char[][] matrix){
        for (char[] row: matrix  ){
            for (int i : row){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }


    // sunmamos filas

    public static int sumaFilas(char[][] matrix, int i){
        int sumFil = 0;
        for (char elemento: matrix[i]){
            sumFil += (int) elemento;
        }
        return sumFil;
    }


    // sumamos Columnas
    public static int sumaColumna(char[][] matrix, int colI){
        int sumCol = 0;
        for (int i = 0; i < matrix.length; i++){
            sumCol += (matrix[i][colI]);
        }
        return sumCol;
    }

    public static void main(String[] args){
        int numRows = getImput(numerosFilas);
        int numCols = getImput(numeroColumsas);

        char[][] matrix = new char[numRows][numCols];


        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = getImputChar(String.format(ingresarNumeros,i,j));
            }
        }

        System.out.println("la matris es:");
        imprimirValores(matrix);


        for (int i = 0; i < numRows; i++) {
            char sumarFilas = (char) sumaFilas(matrix,i);
            System.out.println(String.format(sumaDeFilas,i+sumarFilas));
        }

        for (int j = 0; j < numCols; j++) {
            char sumaCol = (char) sumaColumna(matrix, j);
            System.out.println(String.format(sumaDeColumnas,j+sumaCol));
        }

        getting.close();
    }

}
