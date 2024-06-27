package ExercisesHerencia.Ejercicio3Herencia.Base3;

import ExercisesHerencia.Ejercicio3Herencia.Clases3.Empleado;
import ExercisesHerencia.Ejercicio3Herencia.Clases3.EmpleadoMedioTiempo;
import ExercisesHerencia.Ejercicio3Herencia.Clases3.EmpleadoTiempoCompleto;
import ExercisesHerencia.Ejercicio3Herencia.Metodos3.Metodos;

public class Ejecutar3 {
    public void presentar(){
        Metodos metodos = new Metodos();
        EmpleadoMedioTiempo empleado1 = new EmpleadoMedioTiempo("Juan","Pull",1,500, 1, 300);
        EmpleadoMedioTiempo empleado2 = new EmpleadoMedioTiempo("maria","Pull",2,100, 1, 100);

        EmpleadoTiempoCompleto empleado3 = new EmpleadoTiempoCompleto("luan","Pull",1,500,"no");
        EmpleadoTiempoCompleto empleado4 = new EmpleadoTiempoCompleto("Martha","Pull",3,200,"no");

        System.out.println("el salari del empleado "+empleado1.getNombre()+" de medio tiempo es: "+empleado1.calcularPago());
        System.out.println("el salari del empleado "+empleado2.getNombre()+" de medio tiempo es: "+empleado2.calcularPago());
        System.out.println();
        System.out.println("el salari del empleado "+empleado3.getNombre()+" de tiempo completo es: "+empleado3.calcularPago());
        System.out.println("el salari del empleado "+empleado4.getNombre()+" de tiempo completo es: "+empleado4.calcularPago());

        metodos.mostarDatos(empleado1);
        metodos.mostarDatos(empleado2);
        metodos.mostarDatos(empleado3);
        metodos.mostarDatos(empleado4);

    }
}














