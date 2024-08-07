package ColeccionesComparable;

import Colecciones.Comparar.CompararEmpleado;
import Colecciones.Objetos.Empleado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListas {
    public static void main(String[] args) {

        // los nombres de los tipos de lista empiezan con mayuscula
        List<Empleado> listaDeEmpleados = new ArrayList<>();

        listaDeEmpleados.add(new Empleado("javier","carchi","mexico",24,200));
        listaDeEmpleados.add(new Empleado("c-ymaria","paz","mexico",23,300));
        listaDeEmpleados.add(new Empleado("b-juan","cali","mexico",27,400));
        listaDeEmpleados.add(new Empleado("a-elber","cochi","mexico",21,500));

        //Collections.sort(listaDeEmpleados);

        for (Empleado empleado : listaDeEmpleados){
            System.out.println(empleado);
        }




    }

    /*
    add(E e):
    Agrega el elemento especificado al final de la lista.

    add(int index, E element):
    Inserta el elemento especificado en la posición especificada en la lista.

    get(int index):
    Devuelve el elemento en la posición especificada en la lista.


    set(int index, E element):
    Reemplaza el elemento en la posición especificada con el elemento especificado.

    remove(int index):
    Elimina el elemento en la posición especificada en la lista.

    remove(Object o):
    Elimina la primera ocurrencia del elemento especificado de la lista, si está presente.

    size():
    Devuelve el número de elementos en la lista.

    isEmpty():
    Devuelve true si la lista no contiene elementos.

    contains(Object o):
    Devuelve true si la lista contiene el elemento especificado.

    clear():
    Elimina todos los elementos de la lista.

    indexOf(Object o):
    Devuelve el índice de la primera aparición del elemento especificado en la lista, o -1 si la lista no contiene el elemento.

    lastIndexOf(Object o):
    Devuelve el índice de la última aparición del elemento especificado en la lista, o -1 si la lista no contiene el elemento.

    subList(int fromIndex, int toIndex):
    Devuelve una vista de la porción especificada de la lista, desde el índice fromIndex, inclusivo, hasta el índice toIndex, exclusivo.

    toArray():
    Devuelve una matriz que contiene todos los elementos de la lista en la secuencia adecuada (de primer a último elemento).

    toArray(T[] a):
    Devuelve una matriz que contiene todos los elementos de la lista en la secuencia adecuada; el tipo de tiempo de ejecución de la matriz devuelta es el del array especificado.
*/
}
