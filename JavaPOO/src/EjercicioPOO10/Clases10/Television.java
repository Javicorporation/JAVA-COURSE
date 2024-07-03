package EjercicioPOO10.Clases10;

public class Television extends Electrodomesticos{
    private int resolucion;
    private boolean sincronizadorTDT;


    public Television(double precioBase, String color, char consumaEnerjetico, double peso,int resolucion, boolean sincronizadorTDT) {
        super(precioBase, color, consumaEnerjetico, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    @Override
    public double obtenerPreciofinal() {
        double plus = super.obtenerPreciofinal();
        if (resolucion > 40) {
            plus += getPrecioBase()*0.3;
        }
        if (sincronizadorTDT) {
            plus += 50;
        }
        return plus;
    }
}
