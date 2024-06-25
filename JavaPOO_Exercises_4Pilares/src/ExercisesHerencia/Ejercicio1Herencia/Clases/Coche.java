package ExercisesHerencia.Ejercicio1Herencia.Clases;

public class Coche extends Vehiculo{
    private int numeroDePuertas;

    public Coche(String marca, String modelo, String color, int numeroDePuertas) {
        super(marca, modelo, color);
        this.numeroDePuertas = numeroDePuertas;
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


    // Métodos Abstractos
    @Override
    public void acelerar(){
        System.out.println("Acelerando el auto");
    }

    @Override
    public void frenar(){
        System.out.println("Frenando el auto");
    }


    // Métodos Concretos
    // Este método sobrescribe la implementación concreta de Vehiculo para añadir información específica del coche
    @Override
    public void presentarDatos(){
        super.presentarDatos(); // Llama al método presentarDatos de la clase base Vehiculo para reutilizar el código que imprime la marca, modelo y color, evitando duplicación de código.
        System.out.println("encender puertas "+ this.numeroDePuertas);
        encenderAire();
    }
}
