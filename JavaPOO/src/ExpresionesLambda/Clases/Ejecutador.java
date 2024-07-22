package ExpresionesLambda.Clases;

import java.util.Arrays;

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

        Arrays.asList(1,2,3,4,5,6).forEach(System.out :: println);
    }
}
