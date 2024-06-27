package ExercisesHerencia.Ejercicio3Herencia.Metodos3;

import ExercisesHerencia.Ejercicio3Herencia.Clases3.Empleado;

public class Metodos {
    public void mostarDatos(Empleado empleado){
        System.out.println();
        System.out.println("id: "+empleado.getId());
        System.out.println("nombre: "+empleado.getNombre());
        System.out.println("apellido: "+empleado.getApellido());
        System.out.println("Salario: "+empleado.getSalario());
    }
}
