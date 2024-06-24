package ExercisesEncapsulamiento.ejercicio5Encapsulamiento.Clases;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private double[] bonuses;
    private int index;


    public Employee(String name, int id, double salary, int lengtht) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonuses = new double[lengtht];
        this.index = 0;
    }

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


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void addBonu(double bonus) {
        if (index < bonuses.length) {
            bonuses[index] = bonus;
            index++;
        }
    }
}
