package Listas.Clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// metodos de las listas
/**
 int size(): ------ determina la cantidad de elementos en una lista.
 void add(int index, E element):  ------ agrega un elemento en una posición específica.
 boolean isEmpty():  ------ comprueba si la lista está vacía.
 void clear():  ------ elimina todos los elementos de la lista.
 boolean contains(Object o):  ------ devuelve el valor true si el objeto o está en la lista.
 boolean add(E e):  ------ agrega el elemento especificado al final de la lista.
 boolean remove(Object o):  ------ elimina la primera aparición de un elemento específico.
 E get(int index):  ------ devuelve el elemento en el índice indicado.
 E set(int index, E element):  ------ reemplaza o inserta un elemento en el índice especificado.
 Object[] toArray():  ------ devuelve un array con los elementos de la lista.
 List<E> subList(int fromIndex, int toIndex):  ------ captura todos los elementos dentro del intervalo definido.
 default void replaceAll(UnaryOperator<E> operator):  ------ método estándar en Java 8 que aplica operadores de Java a cada elemento y sustituye el resultado por dicho elemento.
 */


public class Listas {

    // convertir un array en una lista con el metodo .add
    public void convertirArrayEnList(){
        String[] arrayColores ={"negro", "marron", "azul", "gris"};
        System.out.println("Array: "+ Arrays.toString(arrayColores));

        List<String> coloresList = new ArrayList<>();
        for (String color:arrayColores){
            coloresList.add(color); //  <----- aqui
        }
        System.out.println("List: "+coloresList);

    }

    // convertimos una lista en eun array y utilizamos ToArray
    public void ConvertirListAArray(){
        List<String> flores = new ArrayList<>();
        flores.add("Rosa");
        flores.add("Tulipan");
        flores.add("Gardenia");
        flores.add("Flor de muerto");
        System.out.println("Lista "+flores);
        // usamos toArray para convertir una lista en un array y el parametro especifica que se ceara un nuevo array de tipo String y pasaremos su tamaño
        String[] flores1 = flores.toArray(new String[flores.size()]);
        System.out.println("Array: "+Arrays.toString(flores1));

    }


}
