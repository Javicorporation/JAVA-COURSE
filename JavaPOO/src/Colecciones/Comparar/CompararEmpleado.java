package Colecciones.Comparar;

import Colecciones.Objetos.Empleado;

import java.util.Comparator;

public class CompararEmpleado implements Comparator<Empleado> {

    // metodo de comparar 2 empleados con la implementacion de Comparator
    @Override
    public int compare(Empleado o1, Empleado o2) {
        // para ordenar objetos pos su nombre String
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
