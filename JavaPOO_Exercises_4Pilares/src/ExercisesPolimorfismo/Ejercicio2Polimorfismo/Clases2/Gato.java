package ExercisesPolimorfismo.Ejercicio2Polimorfismo.Clases2;

public class Gato extends Animal{


    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad, raza);
    }

    @Override
    public void hacerSonido() {
        System.out.println("el maulla");
    }
}
