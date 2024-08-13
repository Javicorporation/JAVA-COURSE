package com.EjerciciosDiplomadosemana1.ClaseMath;

public class Ejercicio3 {

    public void promedios(){
        double[] array = new double[5];
        double suma = 0;

        for (int i = 0; i < array.length; i++) {
            double numAle = Math.random()*10;
            array[i] = numAle;
            suma = suma + array[i];
        }
        double resultado = suma /array.length;

        System.out.println(resultado);
    }
}
