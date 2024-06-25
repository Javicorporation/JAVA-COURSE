package ExercisesHerencia.Ejercicio1Herencia.Base1;

import ExercisesHerencia.Ejercicio1Herencia.Clases.Coche;
import ExercisesHerencia.Ejercicio1Herencia.Clases.Motosicleta;
import ExercisesHerencia.Ejercicio1Herencia.Metodos.Metodos;

public class Base1 {
    public static void main(String[] args) {
        Metodos met = new Metodos();

        Coche coche = new Coche("Mazda", "ZUV","verde",4);
        Coche coch1 = new Coche("xxxxx", "ZUV","verde",4);
        Coche coch2 = new Coche("zzzzzz", "ZUV","verde",4);
        Coche coch3 = new Coche("kkkkk", "ZUV","verde",4);

        coche.frenar();
        coche.acelerar();
        Motosicleta moto = new Motosicleta("toyota", "QLS","azul", "basica");
        moto.frenar();
        moto.acelerar();

        //presentar los datos del vehiculo que escogemos
        moto.presentarDatos();
        System.out.println();
        coche.presentarDatos();

        // metodo para imprimir los datos de un objeto especifico
        met.PresentarVehiculo(coch2);


    }
}
