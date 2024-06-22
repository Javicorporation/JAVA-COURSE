package ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Clases4;

public class Metodos {
    public void applyDiscount(Product product, double targetPrice){
        boolean loop;
        do {
            if (product.getPrice() > targetPrice) {
                product.setPrice(product.getPrice() * 0.9);
                System.out.println("- "+ product.getPrice());
                loop = false;
            }else {
                System.out.println("El descuento llego al su maximo");
                loop = true;
            }
        }while (!loop);
    }
}
