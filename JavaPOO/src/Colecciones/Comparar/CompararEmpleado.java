package Colecciones.Comparar;

import Colecciones.Objetos.Empleado;

import java.util.Comparator;

public class CompararEmpleado implements Comparator<Empleado> {

    @Override
    public int compare(Empleado empl1, Empleado empl2) {

            // para ordenar objetos pos su nombre String

            //return o1.getNombre().compareTo(o2.getNombre());

            // ordemanos por medio de la edad
            int resultado = 0;
            if (empl1.getEdad() > empl2.getEdad()) {
                resultado = 1;
            }else if(empl1.getEdad() < empl2.getEdad()) {
                resultado = -1;
            }else {
                resultado = 0;
            }
            return resultado;

    }
}
