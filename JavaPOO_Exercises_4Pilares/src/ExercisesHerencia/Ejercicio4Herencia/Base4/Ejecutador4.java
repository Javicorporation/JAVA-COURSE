package ExercisesHerencia.Ejercicio4Herencia.Base4;

import ExercisesHerencia.Ejercicio4Herencia.Clases4.Circulo;
import ExercisesHerencia.Ejercicio4Herencia.Clases4.Rectangulo;

public class Ejecutador4 {
    public void presentar(){
        Circulo c1 = new Circulo("circulo1", "verde", 3.00);
        Circulo c2 = new Circulo("Circulo2", "blanco", 1.00);

        Rectangulo rectangulo1 = new Rectangulo("rectangulo 1", "azul", 2.5,4.0);
        Rectangulo rectangulo2 = new Rectangulo("rectangulo 2", "rojo", 1.5,2.0);

        System.out.println("el area del circulo 1 es "+c1.calcularArea());
        System.out.println("el perimetro del circulo 2 es "+c2.calcularPerimetro());
        System.out.println("");
        System.out.println("el area del rectangulo 1 es "+rectangulo1.calcularArea());
        System.out.println("el perimetro del rectangulo 2 es "+rectangulo2.calcularPerimetro());
    }
}
