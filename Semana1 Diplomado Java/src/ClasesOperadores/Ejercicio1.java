package ClasesOperadores;

import java.util.ArrayList;

public class Ejercicio1 {

    public void notas(ArrayList<Double> notas){
        String nombre = "Juanin";
        double promedio = 0;
        for (double nota : notas){
            promedio += nota;
            System.out.print(nota+" - ");
        }
        promedio = promedio/notas.size();

        System.out.println();
        System.out.println("El promedio de las notas de "+nombre+" es: " + promedio);
    }
}
