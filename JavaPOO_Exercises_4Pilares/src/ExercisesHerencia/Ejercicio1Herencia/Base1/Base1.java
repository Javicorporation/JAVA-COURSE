package ExercisesHerencia.Ejercicio1Herencia.Base1;

import ExercisesHerencia.Ejercicio1Herencia.Clases.Coche;
import ExercisesHerencia.Ejercicio1Herencia.Clases.Motosicleta;

public class Base1 {
    public static void main(String[] args) {
        Coche coche = new Coche("Mazda", "ZUV","verde");
        coche.frenar();
        coche.acelerar();

        Motosicleta moto = new Motosicleta("toyota", "QLS","azul");
        moto.frenar();
        moto.acelerar();

        coche.presentarDatos();
        System.out.println();
        moto.presentarDatos();
    }
}
