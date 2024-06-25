package ExercisesHerencia.Ejercicio1Herencia.Metodos;

import ExercisesHerencia.Ejercicio1Herencia.Clases.Vehiculo;

public class Metodos {

    public void PresentarVehiculo(Vehiculo vehiculo) {
        System.out.println("\nDatos del vehiculo: ");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: "+ vehiculo.getModelo());
        System.out.println("Color: "+ vehiculo.getColor());
    }
}
