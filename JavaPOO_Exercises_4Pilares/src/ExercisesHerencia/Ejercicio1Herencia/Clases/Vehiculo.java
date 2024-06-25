package ExercisesHerencia.Ejercicio1Herencia.Clases;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // los metodos que se van a heredar tienen que ser abtractos
    // Métodos Abstractos
    public abstract void acelerar();
    public abstract void frenar();


    // Métodos Concretos
    public void presentarDatos() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
    }
}
