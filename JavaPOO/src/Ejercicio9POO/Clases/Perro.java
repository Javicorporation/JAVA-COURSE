package Ejercicio9POO.Clases;

public class Perro extends Animal{


    // en la clase hija o subclase por buenas practica se implementa un contructor super
    public Perro(String nombre, int edad, String rasa) {
        super(nombre, edad, rasa);
    }

    // el @override siempre va encima de metodos heredados
    @Override
    public void comer(){
        System.out.println("el perro come procan");
        System.out.println("su nombre es: "+nombre);
        System.out.println("su edad es: "+edad);
        System.out.println("su rasa es: "+rasa);
    }
    public void ladrar(){
        System.out.println("el perro ladra");
    }
}
