package MatricesIregulares;

import java.util.Scanner;

public class Excercise6MatrixIrregular {
    public static void main (String[] args){
        Scanner getting = new Scanner(System.in);

        String[] nombres = new String[3];
        int[][] dias = new int[3][];

        for (int i = 0; i < nombres.length; i++){
            System.out.print("Write a name: ");
            nombres[i] = getting.nextLine();

            System.out.print("Write a number of day missing: ");
            int cantidadFalt = getting.nextInt();

            dias[i] = new int[cantidadFalt];
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print("Write a number of day: ");
                dias[i][j] = getting.nextInt();
                getting.nextLine();
            }
            System.out.println();
        }

        // imprime
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("el empleado " + nombres[i] + " tiene "+dias[i].length+" dias faltantes.");
            System.out.println();
        }

        // para evaluar el de menor dias
        int faltas = dias[0].length;
        String nombre = nombres[0];


        for (int i = 1; i < nombres.length; i++) {
            if (dias[i].length < faltas) {
                faltas = dias[i].length;
                nombre = nombres[i];
            }
        }


        System.out.println();
        System.out.println(" el empleado "+nombre+" tiene menos faltas: "+faltas);

    }
}
