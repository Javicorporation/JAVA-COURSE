package ExercisesHerencia.Ejercicio5Herencia.Clases5;

public class Perro extends Animal{
    private String altura;
    private String color;

    public Perro(String nombre, int edad, String raza, String altura, String color) {
        super(nombre, edad, raza);
        this.altura = altura;
        this.color = color;
    }

    public Perro(String altura, String color) {
        this.altura = altura;
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Ladra por 2 horas");
    }

    public void traerPelota(){
        System.out.println("Trae pelota");
    }
}
