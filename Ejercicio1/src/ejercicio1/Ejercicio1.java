package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int suma;
        int num1;
        int num2;
        int num3;
        
        System.out.print("escribe el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.print("escribe el primer numero: ");
        num2 = teclado.nextInt();
        
        System.out.print("escribe el primer numero: ");
        num3 = teclado.nextInt();
        
        suma = num1 + num2 + num3;
        System.out.print("el resultado es: "+suma);
    }
    
}
