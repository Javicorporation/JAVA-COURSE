package Colecciones.Listas;

import java.util.ArrayList;
import java.util.List;

public class TestListas {
    public static void main(String[] args) {

        // los nombres de los tipos de lista empiezan con mayuscula

        List<Integer> listaDeNumeros = new ArrayList<>();
        List<String> listaDeStrig = new ArrayList<>();
        List<Double> listaDeDouble = new ArrayList<>();

        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);
        listaDeNumeros.add(5);

        for (int i : listaDeNumeros) {
            System.out.println(i);
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
