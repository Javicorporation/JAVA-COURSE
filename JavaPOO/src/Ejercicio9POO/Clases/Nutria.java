package Ejercicio9POO.Clases;

public class Nutria extends Animal{

    public Nutria(String nombre, int edad, String rasa) {
        super(nombre, edad, rasa);
    }

    @Override
    public void comer(){
        System.out.println("la nutria come");
        System.out.println("su nombre es: "+nombre);
        System.out.println("su edad es: "+edad);
        System.out.println("su rasa es: "+rasa);

    }
    public void nadar(){
        System.out.println("la nutria nada");
    }
}
