package ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Base4;

import ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Clases4.Metodos;
import ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Clases4.Product;

public class Ejecutador4 {

    Product product1 = new Product("juan", 100, 5);
    Product product2 = new Product("juan", 150, 5);
    Product product3 = new Product("juan", 200, 5);
    Product product9 = new Product("juan", 250, 5);

    public void presentar4(){
        Metodos metodos = new Metodos();
        metodos.applyDiscount(product1,60);
        System.out.println();
        metodos.applyDiscount(product2,70);
        System.out.println();
        metodos.applyDiscount(product3,80);
        System.out.println();
        metodos.applyDiscount(product9,90);

    }

}
