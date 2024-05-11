package MatrixExce;

import java.util.Scanner;

public class Excercise19Matrix {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int matrix[][];

        int numRows ;
        int numCols ;
        System.out.print("Write a number of rows: ");
        numRows = getting.nextInt();
        System.out.print("Write a number of columns: ");
        numCols = getting.nextInt();
        matrix = new int[numRows][numCols];

        getting.close();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = (int)(Math.random()*10); // el math.random es para generar valores aleatorios.
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
