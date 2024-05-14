package MatrixExce;

import java.util.Scanner;

public class Excercise22MatrixRemaster {
    // en este ejemplo del ejercicio 22 voy a usar metodos

    // creamos una variable que va  tener la clase Scanner
    public static final Scanner sc = new Scanner(System.in);

    //creamos los mensajes en variables individuales
    public static final String filaMensaje = "Escribe el numero de filas: ";
    public static final String columnaMensaje = "Escribe el numero de columnas: ";
    public static final String ingresoNumeros = "Escribe un numero en la posision de la matix [%d][%d]: ";
    public static final String sumafilas = "la suma de la fila %d es: %d";
    public static final String sumaColumnas = "la suma de la columna %d es: %d";

    // creamos un metodo que pida un numero
    public static  int getInput(String mensaje){
        System.out.print(mensaje);
        return sc.nextInt();
    }

    // creamos un metodo que imprima la matrix
    public static  void imprimirMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int elemento : row){
                System.out.print(elemento+" ");
            }
            System.out.println();
        }
    }

    // creamos un metodo que sume las filas
    private static int sumaFilas(int[][] matrix, int filaIndex){
        int sumaFil = 0;
        for(int elemento : matrix[filaIndex]){
            sumaFil += elemento;
        }
        return sumaFil;
    }

    // creo un metodo para sumar las columnas
    private static int sumaColumns(int [][]matrix, int columnasIndex){
        int sumaCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumaCol += matrix[i][columnasIndex];
        }
        return sumaCol;
    }


    public static void main(String[] args) {

        // creamos 2 variables y una matris
        int numRows = getInput(filaMensaje);
        int numColumns = getInput(columnaMensaje);
        int[][] matrix = new int[numRows][numColumns];

        // creamos una matrix para perdir el numero de cada posicion
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                matrix[i][j] = getInput( String.format(ingresoNumeros,i,j));
            }
        }

        // imprimimos la matris
        System.out.println("la matris es: ");
        imprimirMatrix(matrix);


        // instanciamos el metodo sumafila
        for (int i = 0; i < numRows; i++) {
            int sumarFilas = sumaFilas(matrix, i);
            System.out.println(String.format(sumafilas,i,sumarFilas));
        }

        // instanciamos el metodo sumaColumns
        for (int j = 0; j < numColumns; j++) {
            int sumaColum = sumaColumns(matrix, j);
            System.out.println(String.format(sumaColumnas,j,sumaColum));
        }

        sc.close();

    }


}
