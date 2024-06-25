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

    public void encenderAire(){
        System.out.println("Aire encendido");
    }
    public void acelerar(){
        System.out.println("Acelerando el auto");
    }
    public void frenar(){
        System.out.println("Frenando el auto");
    }
    public void presentarDatos(){
        System.out.println("nombre:"+ this.marca);
        System.out.println("modelo:"+ this.modelo);
        System.out.println("color:"+ this.color);
        encenderAire();
    }
}
