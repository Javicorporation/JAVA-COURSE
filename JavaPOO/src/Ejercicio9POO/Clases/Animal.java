package Ejercicio9POO.Clases;

public class Animal {
    // cuando vamos a heredar siempre por buenas practicas se usa protected
    protected String nombre;
    protected int edad;
    protected String rasa;

    // tambien se geneara un constructor
    public Animal(String nombre, int edad, String rasa) {
        this.nombre = nombre;
        this.edad = edad;
        this.rasa = rasa;
    }

    public void comer(){
        System.out.println("el animal come");
    }
}
