package Encapsulamiento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        //creamos una instancia de la clase
        Persona persona = new Persona();

        System.out.print("write a nomber: ");
        persona.setNombre(getting.next());
        System.out.print("write a apellido: ");
        persona.setApellido(getting.next());
        System.out.print("write a edad: ");
        persona.setEdad(getting.nextInt());
        System.out.print("write a altura: ");
        persona.setAltura(getting.nextDouble());


        System.out.println("su nombre es: "+persona.getNombre());
        System.out.println("su apellido es: "+persona.getApellido());
        System.out.println("su edad es: "+persona.getEdad());
        System.out.println("su altura es: "+persona.getAltura());

    }
}
