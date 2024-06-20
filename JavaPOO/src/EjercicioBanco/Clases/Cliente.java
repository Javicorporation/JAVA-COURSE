package EjercicioBanco.Clases;

public class Cliente {
    private String nombre;
    private int monto;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public void Depositar(int valor) {
        monto +=valor;
    }

    public void retirar (int valor) {
        monto -= valor;
    }

    public int retornarmonto(){
        return monto;
    }

    public void imprimir(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Monto: " + this.monto);
    }
}
