package ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Clases;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private double[] bonuses = new double[4];

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double[] getBonuses() {
        return bonuses;
    }



}
