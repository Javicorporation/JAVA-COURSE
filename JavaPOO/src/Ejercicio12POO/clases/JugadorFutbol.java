package Ejercicio12POO.clases;

public class JugadorFutbol extends Jugador{

    public JugadorFutbol(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    // en las clase hijas van aimplementar los metodos de la clase padre abstracta

    @Override
    public void jugar() {
        System.out.println("el jugado de futbool "+ nombre + " "+apellido+ " tiene la edad de "+edad);
        System.out.println("y juaga muy bien");
    }
}
