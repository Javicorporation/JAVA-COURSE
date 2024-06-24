package ExercisesEncapsulamiento.Ejercicio5Mejorado.Metodos;

import ExercisesEncapsulamiento.Ejercicio5Mejorado.Clases.Empleado;

public class Metodos {

    // metodo pra agregar un bono segun el empleado que elijamos
    public void addBono(Empleado empleado, double bono){
        if (empleado.getIndex() < empleado.getBonos().length) { // si 0 < 5
            empleado.getBonos()[empleado.getIndex()] = bono;    // array[i] = 50
            empleado.setIndex(empleado.getIndex() + 1);         // i++
        }else{
            System.out.println("No hay espaciooo para "+bono);
        }
    }

    // imprime el total de los bonos de un empleado especifico
    public void imprimirTotal(Empleado empleado){
        double total = 0;
        // con un for each
        for (double bono : empleado.getBonos()) {
            total += bono;
        }
        // asi se aria con un for normal
//        for (int i = 0; i < empleado.getBonos().length; i++) {
//            total = total + empleado.getBonos()[i];
//        }
        System.out.println("Total: " + total);
    }


    // imprime el array de un empleado especifico.
    public void imprimirArray(Empleado empleado){
        System.out.println("Los bonos son: "+empleado.getNombre());
        for(double bono : empleado.getBonos()){
            System.out.println(bono+" ");
        }
    }
}
