package ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Metodos;

import ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Clases.Employee;

public class Metodos {


    public void getTotalBonuses(Employee employee){
        double[] bonuses = employee.getBonuses();
        double total = 0;
        for (int i = 0; i < bonuses.length; i++) {
            total = total + bonuses[i];
        }
        System.out.println("el resultado es: " + total);
    }

    public void addBonus(Employee employee, double bonus){
        employee.addBonu(bonus);
    }
}
