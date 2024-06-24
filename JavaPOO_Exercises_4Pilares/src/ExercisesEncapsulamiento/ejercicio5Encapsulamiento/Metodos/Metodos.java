package ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Metodos;

import ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Clases.Employee;

public class Metodos {

    Employee employee = new Employee();
    double[] bonuses = employee.getBonuses();

    public void addBonus(double bonus){
        for (int i = 0; i < bonuses.length; i++) {
            bonuses[i] = bonus;
        }
    }

    public double getTotalBonuses(){
        double total = 0;
        for (int i = 0; i < bonuses.length; i++) {
            total = total + bonuses[i];
        }
        return total;
    }
}
