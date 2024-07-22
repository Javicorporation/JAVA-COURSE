package ExpresionesLambda.Clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejecutador {
    public static void main(String[] args) {
        // Array.asList --> sirve para crear listas
//        for(Integer numero: Arrays.asList(1,2,3,4,5)){
//            System.out.println(numero+" ");
//        }

        // imprimir una lista utilizando expreciones lambda
//        Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
//                n -> System.out.println(n+" "));


//        tambien podemos hacerlo de esta manera

//        Arrays.asList(1,2,3,4,5,6).forEach(System.out :: println);


        // filtrar loas numero de una lista utilizando programacion normal
        // creamos la lista vacia
//        ArrayList<Integer> listaX = new ArrayList<>();
//        // usamos un for para agregar los datos de la lista arrays.asList
//        for(Integer numero : Arrays.asList(1,2,3,4,5,6,7,8,9)){
//            // si numero es mayor a 5
//            if (numero > 5) {
//                //guardamos eñ numero en la lista
//                listaX.add(numero);
//            }
//        }
//
//        // imprimimos la lista
//        for(Integer valor : listaX){
//            System.out.println(valor);
//        }


        //filtrar loas numero de una lista utilizando programacion funcional
                                         // casteamos el arrayList, osea llenamos el arrayList creado con Arrays.asList
        ArrayList<Integer> listamenor = (ArrayList<Integer>)Arrays.asList(1,2,3,4,5,6,7,8,9)
                // convertimos en un flujo de elementos al arrayList por medio del stream
                .stream()
                // filtro para obtener los numeros mayores a 5
                .filter(x -> x >5)
                // pone los elementos fitrados dentro de una nueva lista, dentro utilizamos una expresion lambda
                .collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
        listamenor.forEach(e -> System.out.println(e));

    }
}
