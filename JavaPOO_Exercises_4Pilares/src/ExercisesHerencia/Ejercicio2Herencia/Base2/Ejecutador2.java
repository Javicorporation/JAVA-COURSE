package ExercisesHerencia.Ejercicio2Herencia.Base2;

import ExercisesHerencia.Ejercicio2Herencia.Clases2.DvD;
import ExercisesHerencia.Ejercicio2Herencia.Clases2.Libro;

public class Ejecutador2 {
    public void presentar(){

        Libro libro1 = new Libro("libro1", "bablo",true, 100);
        Libro libro2 = new Libro("libro1", "bablo",true, 100);
        Libro libro3 = new Libro("libro1", "bablo",true, 100);

        DvD dvD1 = new DvD("accion", "lucia", false, 2);
        DvD dvD2 = new DvD("accion", "lucia", false, 2);
        DvD dvD3 = new DvD("accion", "lucia", false, 2);

        libro1.leePaginas();
        libro1.devolver();
    }
}
