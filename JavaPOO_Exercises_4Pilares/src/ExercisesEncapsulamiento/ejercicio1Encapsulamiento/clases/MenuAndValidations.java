package ExercisesEncapsulamiento.ejercicio1Encapsulamiento.clases;

import java.util.Scanner;

public class MenuAndValidations {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgOpcion = "ingrese una opcion: ";
    public static final String msgNombre = "ingrese su nombre: ";
    public static final String msgId = "ingrese su id: ";
    public static final String msgNota = "ingrese la cantidad de notas: ";

    public String pedirString(String message){
        System.out.print(message);
        return getting.next();
    }

    public int pedirInt (String message){
        boolean loopPedInt;
        int valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextInt()) {
                loopPedInt = true;
                valor = getting.nextInt();
            }else {
                System.out.println("el numero no es un entero, porfavor ingrese un entero");
                getting.next();
                loopPedInt = false;
            }
        }while (!loopPedInt);
        return valor;
    }

    public void presentar(){
        boolean loopMenu = false;
        int opcion;
        String nombre;
        int id;
        int cantidadNotas = 0;
        Estudiante estudiante;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. agregar una nota");
            System.out.println("2. salir");
            opcion = pedirInt(msgOpcion);
            switch (opcion){
                case 1:
                    nombre = pedirString(msgNombre);
                    id = pedirInt(msgId);
                    cantidadNotas = pedirInt(msgNota);
                    estudiante = new Estudiante(nombre, id);
                    estudiante.addGrade(cantidadNotas);
                    System.out.println("las notas son:");
                    estudiante.presentarNotas();
                    break;
                case 2:
                    System.out.println("gracias por participar");
                    loopMenu= true;
                    break;
                default:
                    System.out.println("el valor no se encuentra en el menu");
            }
        }while (!loopMenu);
    }
}
