package ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Base2;

import ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2.Book;

import java.util.Scanner;

public class Ejecutador2 {
    public static Scanner getting = new Scanner(System.in);
    public static String msgNombre = "Escribe el nombre del libro: ";
    public static String msgAutor = "Escribe el autor: ";
    public static String msgEstado = "Escribe el estado del libro: ";

    public String pedirString(String message){
        System.out.print(message);
        return getting.next();
    }

    public void presentar(){
        String title = pedirString(msgNombre);
        String author = pedirString(msgAutor);
        String status = pedirString(msgEstado);
        Book book = new Book(title,author,status);
        String estadoActual = book.getStatus();
        String resultado = book.changeStatu(estadoActual);

        System.out.println("El estado actual del libro es: " + resultado);

    }
}
