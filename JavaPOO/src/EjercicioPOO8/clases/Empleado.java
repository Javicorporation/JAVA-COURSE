package EjercicioPOO8.clases;

public abstract class Empleado {

    //en este ejercicio utilizamos una clase abstracta y no una intefaces por que
    // utilizamos abstracto por hay una herencia y estamos respetando las geraquias de las clases

    private String nombre;
    private int edad;
    private double salario;
    public final double plus = 300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPlus() {
        return plus;
    }

    @Override
    public String toString() {
        return "\nEmpleado: " + "\nnombre = " + nombre +" \nedad = " + edad + " \nsalario = " + salario + " \nplus = " + plus ;
    }

    // este metodo abstracto se va a implesmentar en sus clases hijas.
    public abstract boolean plus();
}










