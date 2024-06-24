package ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Ejecutador5;

import ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Metodos.Metodos;

import java.lang.reflect.Member;

public class Ejecutador0 {

    public void presentar(){
        Metodos metodos = new Metodos();
        metodos.addBonus(30);


        double total = metodos.getTotalBonuses();
        System.out.println("El total de bonuses es: " + total);
    }
}
