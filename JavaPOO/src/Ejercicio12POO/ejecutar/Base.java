package Ejercicio12POO.ejecutar;

import Ejercicio12POO.clases.JugadorBasquet;
import Ejercicio12POO.clases.JugadorFutbol;

public class Base {
    public static void main(String[] args) {
        JugadorFutbol jugadorFutbol = new JugadorFutbol("juan", "pablo",45);
        JugadorBasquet jugadorBasquet = new JugadorBasquet("lian", "plo",23);

        jugadorFutbol.jugar();
        jugadorBasquet.jugar();
    }
}
