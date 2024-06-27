package ExercisesHerencia.Ejercicio5Herencia.Clases5;

public class Gato extends Animal{
    private String color;


    public Gato(String nombre, int edad, String raza, String color) {
        super(nombre, edad, raza);
        this.color = color;
    }

    public Gato(String color) {
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Maulla por 1 hora");
    }

    public void cazarRatones(){
        System.out.println("Casa ratones");
    }
}
