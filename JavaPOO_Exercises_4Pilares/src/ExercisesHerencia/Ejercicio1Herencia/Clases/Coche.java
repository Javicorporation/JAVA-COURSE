package ExercisesHerencia.Ejercicio1Herencia.Clases;

public class Coche extends Vehiculo{

    private int numeroDePuertas;

    public Coche(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public void encenderAire(){}


}
