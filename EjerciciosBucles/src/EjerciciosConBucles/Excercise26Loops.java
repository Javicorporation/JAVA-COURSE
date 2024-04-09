package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise26Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        String cadena = "Hola Mundo";
        StringBuilder stringBuilder = new StringBuilder(cadena);
        StringBuilder cadenaInvertida = stringBuilder.reverse();

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida.toString());
    }
}
