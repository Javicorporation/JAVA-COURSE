package ExercisesPolimorfismo.Ejercicio2Polimorfismo.Clases2;

public class Pajaro extends Animal{

    public Pajaro(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println("dice coooooooo XD");


    }
}
