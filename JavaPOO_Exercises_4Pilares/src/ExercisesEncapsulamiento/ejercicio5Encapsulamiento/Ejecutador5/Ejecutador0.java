package ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Ejecutador5;

import ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Clases.Employee;
import ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Metodos.Metodos;

import java.lang.reflect.Member;

public class Ejecutador0 {

    public void presentar(){

        Employee employee1 = new Employee("juan", 1, 5000,5);
        Employee employee2 = new Employee("juan", 2, 5000,4);
        Employee employee3 = new Employee("juan", 3, 5000, 5);


        Metodos metodos = new Metodos();

        metodos.addBonus(employee1,200);
        metodos.addBonus(employee1,300);
        metodos.addBonus(employee1,200);

        //para imprimir los bonos de un usuario debemos de crear un array y en el implemetar el array exitente
        double[] bonuses = employee1.getBonuses();
        //depues lo podemos iterar con un foreach
        System.out.println("los bonos son: ");
        for (double b : bonuses){
            System.out.println(b+" ");
        }
        //metodo de imprimir los bonos de un empleado
        metodos.getTotalBonuses(employee1);

    }
}
