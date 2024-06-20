package EjercicioBanco.Clases;

public class Cliente {
    private String nombre;
    private int monto;
    private long id;

    public Cliente(String nombre,long id) {
        this.nombre = nombre;
        this.id = id;
        this.monto = monto;
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
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Monto: " + this.monto);
    }
}
