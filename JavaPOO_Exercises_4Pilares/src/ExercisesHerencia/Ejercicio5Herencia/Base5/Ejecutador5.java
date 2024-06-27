package ExercisesHerencia.Ejercicio5Herencia.Base5;

import ExercisesHerencia.Ejercicio5Herencia.Clases5.Gato;
import ExercisesHerencia.Ejercicio5Herencia.Clases5.Perro;

public class Ejecutador5 {
    public void ejecutar(){
        Perro perro1 = new Perro("Luci", 2, "Chihuahua", "0.40","negro");
        Perro perro2 = new Perro("Lopi", 3, "MWW", "0.35","amarillo");
        Gato gato1 = new Gato("Pepa", 4, "Salvaje", "Gris");
        Gato gato2 = new Gato("juan", 3, "Montes", "blanco");

        perro1.hacerSonido();
        perro2.traerPelota();
        System.out.println();
        gato1.cazarRatones();
        gato2.hacerSonido();
    }
}
