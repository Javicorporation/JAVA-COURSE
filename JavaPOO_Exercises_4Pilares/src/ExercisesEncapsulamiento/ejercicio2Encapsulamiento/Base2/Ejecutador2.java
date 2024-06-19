package ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Base2;

import ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2.Book;
import ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2.BookDisponible;
import ExercisesEncapsulamiento.ejercicio2Encapsulamiento.Clases2.BookPrestado;

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

        // vamos a cambiar la estructura de el programa
        String title = pedirString(msgNombre);
        String author = pedirString(msgAutor);
        String status = pedirString(msgEstado);
        Book book = null;

        if (status.equalsIgnoreCase("prestado")){
            book = new BookPrestado(title,author);
        }else if(status.equalsIgnoreCase("disponible")){
            book = new BookDisponible(title,author);
        }

        String nuevoStatus = pedirString("ingrese el nuevo estado del libro: ");
        book.changeStatu(nuevoStatus);
        System.out.println(book);





        //Book book = new Book(title,author,status);
        //book.changeStatu(book.getStatus());

    }
}
