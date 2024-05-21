package MatricesIregulares;

import java.util.Scanner;

public class Excercise5MatrixIrregular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRows;
        int numCols;
        System.out.print("Write a number of Rows: ");
        numRows = sc.nextInt();

        int[][] matrix = new int[numRows][];


        for (int i = 0; i < numRows; i++) {
            System.out.print("write a number of columns: ");
            numCols = sc.nextInt();
            matrix[i] = new int[numCols];
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Write a number: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int media = 0;
        int suma = 0;
        int menor = matrix[0][0];
        int mayor = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < menor) {
                    menor = matrix[i][j];
                }
                if (matrix[i][j] > mayor) {
                    mayor = matrix[i][j];
                }
                // como no se puede obtener la longitud ponemos un contador
                suma += matrix[i][j];
                media ++;
            }
        }

        double resultado = (double) suma / media;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("el numero menor es: "+menor);
        System.out.println("el numero mayor  es: "+mayor);
        System.out.println("el numero medio  es: "+resultado);

    }
}
