package ExercisesHerencia.Ejercicio3Herencia.Clases3;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int id;
    private double salario;

    public Empleado(String nombre, String apellido, int id, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularPago();

}
