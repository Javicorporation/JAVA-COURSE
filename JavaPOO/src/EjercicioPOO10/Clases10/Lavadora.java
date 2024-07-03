package EjercicioPOO10.Clases10;

public class Lavadora extends Electrodomesticos{
    private int carga;


    public Lavadora(double precioBase, String color, char consumaEnerjetico, double peso, int carga) {
        super(precioBase, color, consumaEnerjetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double obtenerPreciofinal() {
        double plus = super.obtenerPreciofinal();
        if (carga > 30) {
            plus += 50;
        }
        return plus;
    }
}
