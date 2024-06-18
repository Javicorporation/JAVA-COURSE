package Ejercicio12POO.clases;

public class JugadorBasquet extends Jugador{
    public JugadorBasquet(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void jugar() {
        System.out.println("el jugado de basquet "+ nombre + " "+apellido+ " tiene la edad de "+edad);
        System.out.println("y juaga muy bien");
    }
}
