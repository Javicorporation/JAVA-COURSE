package EjercicioBanco.Clases;

public class Cliente {
    private String nombre;
    private int monto;
    private long id;


    public Cliente(String nombre,long id, int monto) {
        this.nombre = nombre;
        this.id = id;
        this.monto = monto;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void Depositar(int valor) {
        this.monto +=valor;
    }

    public void retirar (int valor) {
        this.monto -= valor;
    }

    public int retornarmonto(){
        return this.monto;
    }

    public void imprimir(){
        System.out.println("Id: "+this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println();
    }
}
