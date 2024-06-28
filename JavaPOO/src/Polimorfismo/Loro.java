package Polimorfismo;

public class Loro extends Animal{

    public Loro(String nombre, String rasa, int edad) {
        super(nombre, rasa, edad);
    }

    @Override
    public void realizarSonido() {
        System.out.println("el loro llamado "+getNombre()+" de la raza "+getRasa()+" tiene "+getEdad()+" años");
        System.out.println("El loro Gritaa");
    }
}
