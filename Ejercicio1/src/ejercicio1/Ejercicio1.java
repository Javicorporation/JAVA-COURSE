package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        float superficie;
        float lado;
        
        System.out.print("escribe el lado del cuadrado: ");
        lado = teclado.nextFloat();
        superficie = lado * lado;
        System.out.println("la superficie es: "+ superficie);
        
    }
    
}
