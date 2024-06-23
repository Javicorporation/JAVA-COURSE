package EjercicioDeBanco2.Clases2;

public class Cliente2 {
    private String nombre;
    private String apellido;
    private int id;
    private double monto;

    public Cliente2(String nombre, String apellido, int id, double monto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.monto = monto;
    }

    public Cliente2() {
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    @Override
    public String toString() {
        return "Cliente[ "+"nombre= " + nombre +", apellido: " + apellido +", id= " + id +", monto= " + monto +"]";
    }

}
