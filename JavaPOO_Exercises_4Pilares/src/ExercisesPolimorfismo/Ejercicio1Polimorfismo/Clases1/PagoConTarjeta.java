package ExercisesPolimorfismo.Ejercicio1Polimorfismo.Clases1;

public class PagoConTarjeta extends Pago{
    private int id;
    private String nombre;
    private double monto;

    public PagoConTarjeta(int id, String nombre, double monto) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", monto=" + monto +
                '}';
    }


    @Override
    public void procesarPago(double monto) {
        System.out.println("el codigo "+this.id+" de la tarjete que pertenece a "+this.nombre+" realizo este pago "+monto);

    }
}
