package Polimorfismo;

public class Gato extends Animal{

    public Gato(String nombre, String rasa, int edad) {
        super(nombre, rasa, edad);
    }

    @Override
    public void realizarSonido() {
        System.out.println("el gato llamado "+getNombre()+" de la raza "+getRasa()+" tiene "+getEdad()+" años");
        System.out.println("El gato maulla");
    }
}
