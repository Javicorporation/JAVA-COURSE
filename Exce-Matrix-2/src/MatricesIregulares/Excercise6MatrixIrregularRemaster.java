package MatricesIregulares;

import java.util.Scanner;

public class Excercise6MatrixIrregularRemaster {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirNombre = "Escriba su nombre: ";
    public static final String msgPedirCntDias = "Escriba el numero de dias faltantes: ";
    public static final String msgPedirNumDia = "Escribir el numero de dia que falto: ";



    public static int pedir (String message){
        System.out.print(message);
        return getting.nextInt();

    }
    public static String pedirStrin (String message){
        System.out.print(message);
        return getting.nextLine();

    }

    public static void imprimir (int[][] dias, String[] nombre){
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("el empleado " + nombre[i] + " tiene "+dias[i].length+" dias faltantes.");
        }
    }

    public static void buscaMeno (int[][] dias, String[] nombres){
        int faltas = dias[0].length;
        String nombre = nombres[0];

        for (int i = 0; i < nombres.length; i++) {
            if (dias[i].length < faltas) {
                faltas = dias[i].length;
                nombre = nombres[i];
            }
        }
        System.out.println();
        System.out.println(" el empleado "+nombre+" tiene menos faltas: "+faltas);

    }







    public static void main(String[] args) {
        int[][] dias = new int[3][];
        String[] nombres = new String[3];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = pedirStrin(msgPedirNombre);
            int cantidaDiasF = pedir(msgPedirCntDias);
            dias[i] = new int[cantidaDiasF];
            for (int j = 0; j < dias[i].length; j++) {
                dias[i][j] = pedir(msgPedirNumDia);
                getting.nextLine();
            }
            System.out.println();
        }

        imprimir(dias, nombres);

        buscaMeno(dias, nombres);

    }
}
