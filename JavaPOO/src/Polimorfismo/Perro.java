package Polimorfismo;

public class Perro extends Animal{

    public Perro(String nombre, String rasa, int edad) {
        super(nombre, rasa, edad);
    }

    @Override
    public void realizarSonido() {
        System.out.println("el perro llamado "+getNombre()+" de la raza "+getRasa()+" tiene "+getEdad()+" años");
        System.out.println("El perro ladra");
    }
}
