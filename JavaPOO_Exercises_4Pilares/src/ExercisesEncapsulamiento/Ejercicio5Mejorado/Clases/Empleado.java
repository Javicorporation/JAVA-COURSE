package ExercisesEncapsulamiento.Ejercicio5Mejorado.Clases;

public class Empleado {

    private String nombre;
    private int id;
    private double salario;
    private double[] bonos;
    private int index;

    public Empleado(String nombre, int id, double salario, int length) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.bonos = new double[length];
        this.index = 0;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public double[] getBonos() {
        return bonos;
    }

    public void setBonos(double[] bonos) {
        this.bonos = bonos;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    // de esta forma se implemetaria en la clase Empleado el agregar
//    public void add( double bono){
//        if (index < bonos.length) {
//            bonos[index] = bono;
//           index++;
//        }else {
//            System.out.println("No hay espacios");
//        }
//
//    }
}
