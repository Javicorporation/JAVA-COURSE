package EjercicioPOO9.Clases;

public class BebidaMineral extends Bebida{
    private String nombreManantial;


    public BebidaMineral(String nombre, double precio, double cantidad, String marca,String nombreManantial) {
        super(nombre, precio, cantidad, marca);
        this.nombreManantial = nombreManantial;
    }

    public String getNombreManantial() {
        return nombreManantial;
    }

    public void setNombreManantial(String nombreManantial) {
        this.nombreManantial = nombreManantial;
    }

    @Override
    public String toString() {
        return super.toString()+"\nManantial: " + nombreManantial;
    }
}
