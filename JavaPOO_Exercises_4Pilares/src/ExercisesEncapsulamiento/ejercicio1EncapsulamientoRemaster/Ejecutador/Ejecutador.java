package ExercisesEncapsulamiento.ejercicio1EncapsulamientoRemaster.Ejecutador;

import ExercisesEncapsulamiento.ejercicio1EncapsulamientoRemaster.Clasess.Estudiantes;

import java.util.Scanner;

public class Ejecutador {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgOpcion = "Escribe una opcion: ";
    public static final String msgPedirNombre = "Escribe tu nombre: ";
    public static final String msgPedirNota = "Escribe una nota: ";
    public static final String msgPedirId = "Escribe una ID: ";


    public String pedirString(String message){
        System.out.print(message);
        return getting.next();
    }
    public int pedirInt(String message){
        boolean loopInt;
        int valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextInt()){
                valor = getting.nextInt();
                loopInt = true;
            }else{
                System.out.println("El valor no es un entero");
                getting.next();
                loopInt = false;
            }
        }while (!loopInt);
        return valor;
    }



    public void presentar(){
        boolean loopMenu = false;
        boolean loopdesic = false;
        String desicion = "";
        // inicializamos la variables que inicializamos en el costructor
        int opcion;
        String nombre;
        int id;
        int nota=0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Agregar una nota");
            System.out.println("2. Salir");
            opcion = pedirInt(msgOpcion);
            switch (opcion){
                case 1:
                    // primero le asignamos valores a las variables
                    nombre = pedirString(msgPedirNombre);
                    id = pedirInt(msgPedirId);
                    Estudiantes estudiantes = new Estudiantes(nombre, id); //inicializamos el objeto con la variable
                    nota = pedirInt(msgPedirNota);
                    estudiantes.agregarNota(nota);

                    do {
                        System.out.print("Quieres agregar otra nota?: ");
                        desicion = getting.next();
                        if (desicion.equalsIgnoreCase("si")){
                            nota = pedirInt(msgPedirNota);
                            estudiantes.agregarNota(nota);
                            loopdesic = false;
                        }else {
                            System.out.println("ok");
                            loopdesic = true;
                        }
                    }while (!loopdesic);

                    /////////////////
                    System.out.println("las notas son: ");
                    estudiantes.presentarNotas();
                    System.out.println("El promedio es: "+estudiantes.calcularNota());
                    break;
                case 2:
                    System.out.println("Gracias por salir.");
                    loopMenu = true;
                    break;
                default:
                    System.out.println("La opcion no esta en el menu.");
            }
        }while (!loopMenu);


    }
}
