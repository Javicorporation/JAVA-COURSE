package ExercisesEncapsulamiento.ejercicio4Encapsulamiento.Clases4;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void applyDiscount(double targetPrice){
        boolean loop1;
        do {
            if (price > targetPrice) {
                this.price*= 0.9;
                System.out.println("- "+price);
                loop1 = false;
            }else {
                System.out.println("A llegado a su descuento maximo");
                loop1 = true;
            }
        }while (!loop1);
    }

}
