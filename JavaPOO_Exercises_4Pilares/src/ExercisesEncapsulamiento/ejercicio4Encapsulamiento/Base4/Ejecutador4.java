package ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Base4;

import ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Clases4.Product;

public class Ejecutador4 {
    String name = "juan";
    double price = 100;
    int monto = 5;
    Product product = new Product(name,price,monto);

    public void presentar4(){
        applyDiscount(60);
    }

    public void applyDiscount(double targetPrice){
        boolean loop;
        do {
            if (price > targetPrice) {
                price *= 0.9;
                System.out.println("- "+price);
                loop = false;
            }else {
                System.out.println("A llegado a su descuento maximo");
                loop = true;
            }
        }while (!loop);
    }
}
