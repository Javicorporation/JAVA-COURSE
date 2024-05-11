package MatrixExce;

import java.util.Locale;
import java.util.Scanner;

public class Excercise20Matrix {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int numRows, numColum;
        String matrix [][];
        //
        String theAlphaNumericS;
        StringBuilder builder;
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";


        System.out.print("write a number of rows: ");
        numRows = getting.nextInt();
        System.out.print("write a number of columns: ");
        numColum = getting.nextInt();

        matrix = new String[numRows][numColum];
        //
        builder = new StringBuilder(15);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColum; j++) {
                int myindex = (int)(theAlphaNumericS.length()* Math.random());
                builder.append(theAlphaNumericS.charAt(myindex));
                matrix[i][j] = builder.toString();
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColum; j++) {
                System.out.print(matrix[i][j]+ "- ");
            }
            System.out.println();
        }
    }
}
