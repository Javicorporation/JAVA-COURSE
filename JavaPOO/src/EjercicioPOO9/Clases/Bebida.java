package EjercicioPOO9.Clases;

public class Bebida {

    private static int idBase = 1;

    private int id;
    private String nombre;
    private double precio;
    private double cantidad;
    private String marca;

    public Bebida(String nombre, double precio, double cantidad, String marca) {
        this.id = idBase++;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    public static int getIdBase() {
        return idBase;
    }

    public static void setIdBase(int idBase) {
        Bebida.idBase = idBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nBebida: " + "\nid = " + id +", \nnombre = " + nombre +", \nprecio = " + precio + ", \ncantidad = " + cantidad + ", \nmarca = " + marca ;
    }
}











