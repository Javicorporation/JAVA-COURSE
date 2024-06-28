package ExercisesPolimorfismo.Ejercicio2Polimorfismo.Clases2;

public class Perro extends Animal{
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println("el ladra");

    }
}
