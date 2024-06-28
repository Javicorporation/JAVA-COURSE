package ExercisesPolimorfismo.Ejercicio1Polimorfismo.Clases1;

public class PagoConEfectivo extends Pago{
    private String nombre;

    public PagoConEfectivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("El comprador "+this.nombre+" realizo este pago "+monto);
    }
}
