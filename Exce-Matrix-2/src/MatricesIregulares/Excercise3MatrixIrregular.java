package MatricesIregulares;

import java.util.Scanner;

public class Excercise3MatrixIrregular {
    public static void main (String[] args){
        Scanner getting = new Scanner(System.in);

        int numEsx;
        double nota = 0;
        double suma = 0;
        double promedio = 0;


        System.out.print("escribe el numero de estudiantes: ");
        numEsx = getting.nextInt();
        double [] arrayEs = new double[numEsx];
        double[] arrayProme = new double[numEsx];


        for (int i = 0; i < arrayEs.length; i++) {
            System.out.print("Estudiante numero: "+(i+1));
            System.out.println();

            for (int j = 0; j < 3; j++) {
                System.out.print("escribe la nota "+(j+1)+" : ");
                nota = getting.nextDouble();
                suma  += nota;
            }
            promedio = suma / 3;
            arrayProme[i] = promedio;

        }

        for (int i = 0; i < arrayProme.length; i++) {
            System.out.println("na nota del alumno "+(i+1)+" es: "+arrayProme[i]);
        }


    }
}
