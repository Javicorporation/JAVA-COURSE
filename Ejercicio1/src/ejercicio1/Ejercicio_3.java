package ejercicio1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int lado;
        int perimetro;
        
        System.out.print("escribe el lado: ");
        lado = entrada.nextInt();
        
        perimetro = lado * 4;
        
        System.out.println("el perimetro es: "+perimetro);
    }
    
}
