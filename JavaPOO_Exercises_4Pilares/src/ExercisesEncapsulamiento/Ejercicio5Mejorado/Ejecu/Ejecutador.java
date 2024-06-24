package ExercisesEncapsulamiento.Ejercicio5Mejorado.Ejecu;

import ExercisesEncapsulamiento.Ejercicio5Mejorado.Clases.Empleado;
import ExercisesEncapsulamiento.Ejercicio5Mejorado.Metodos.Metodos;

public class Ejecutador {

    public void present(){
        Metodos metodos = new Metodos();
        Empleado empleado1 = new Empleado("juan", 1, 500, 4);
        Empleado empleado2 = new Empleado("Maria", 2, 1000, 5);


        metodos.addBono(empleado1,500);
        metodos.addBono(empleado1,100);
        metodos.addBono(empleado1,500);

        metodos.addBono(empleado1,300);
        metodos.addBono(empleado1,100);
        metodos.addBono(empleado1,160);

        metodos.imprimirArray(empleado1);
        metodos.imprimirTotal(empleado1);


    }
}
