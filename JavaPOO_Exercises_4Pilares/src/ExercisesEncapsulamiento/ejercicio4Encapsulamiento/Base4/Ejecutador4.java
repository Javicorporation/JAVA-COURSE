package ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Base4;

import ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Clases4.Product;

public class Ejecutador4 {
    public void presentar4(){
        Product product = new Product("juan",100,5);
        product.applyDiscount(60);
    }
}
