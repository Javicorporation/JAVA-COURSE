package ExercisesPolimorfismo.Ejercicio2Polimorfismo.Metodos2;

import ExercisesPolimorfismo.Ejercicio2Polimorfismo.Clases2.Animal;
import ExercisesPolimorfismo.Ejercicio2Polimorfismo.Clases2.Perro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metodos {
    public static final Scanner getting = new Scanner(System.in);
    List<Animal> animales = new ArrayList<>();

    public static int pedirInt(String message){
        int valor =0;
        boolean loopInt;
        do {
            System.out.print(message);
            if (getting.hasNextInt()) {
                 valor = getting.nextInt();
                loopInt = true;
            }else{
                System.out.println("El valor ingresado no es un entero, intente de nuevo");
                loopInt = false;
                getting.next();
            }
        }while(!loopInt);
        return valor;
    }

    public static String pedirString(String message){
        String valor = "";
        boolean loopInt;
        do {
            System.out.print(message);
            if (getting.hasNext()) {
                valor = getting.next();
                loopInt = true;
            }else{
                System.out.println("El valor ingresado no es un texto, intente de nuevo");
                loopInt = false;
                getting.next();
            }
        }while(!loopInt);
        return valor;
    }

    public void agregarAnimales(){
        String nombre = pedirString("Escribe el nombre del animal: ");
        String raza = pedirString("Escribe la raza de tu animal: ");
        int edad = pedirInt("Escribe la raza de tu animal: ");
        Perro perro = new Perro(nombre,edad,raza);
        animales.add(perro);
    }

    public void listarAnimales(){
        if (animales.isEmpty()) {
            System.out.println("la lista esta vacia.");
        }else {
            for (Animal animal: animales){
                System.out.println("El nombre del animal es: "+animal.getNombre());
                System.out.println("La raza del animal es: "+animal.getRaza());
                System.out.println("La edad del animal es: "+animal.getEdad());
                System.out.println("");
            }
        }
    }
}
