package EjerccicioDeLambdas.clases;

public class Alumnos {
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String nombreCurso;
    private double nota;
    private int edad;

    public Alumnos() {
    }

    public Alumnos(int id, String cedula, String nombre, String apellido, String nombreCurso, double nota, int edad) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nAlumno: " +
                "\nid: " + id +
                "\ncedula: " + cedula +
                "\nnombre: " + nombre +
                "\napellido: " + apellido +
                "\nnombreCurso: " + nombreCurso +
                "\nnota: " + nota +
                "\nedad: " + edad ;
    }
}
