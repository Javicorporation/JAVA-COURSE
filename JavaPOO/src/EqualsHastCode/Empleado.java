package EqualsHastCode;


import java.util.Objects;

public class Empleado {
    private String nombre;
    private String apellido;
    private String pais;
    private int edad;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Empleado(String nombre, String apellido, String pais, int edad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
        this.sueldo = sueldo;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado empleado)) return false;
        return edad == empleado.edad && Double.compare(sueldo, empleado.sueldo) == 0 && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellido, empleado.apellido) && Objects.equals(pais, empleado.pais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, pais, edad, sueldo);
    }

    @Override
    public String toString() {
        return "\nEmpleado: " +
                "\nnombre: " + nombre +
                ", \napellido: " + apellido +
                ", \npais: " + pais +
                ", \nedad: " + edad +
                ", \nsueldo: " + sueldo;
    }

}
