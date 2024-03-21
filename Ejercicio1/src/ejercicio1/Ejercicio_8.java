package ejercicio1;

import java.util.Scanner;

public class Ejercicio_8 {

    
    public static void main(String[] args) {
        // suma de caracteres
        
        Scanner entrada = new Scanner(System.in);
        
        char caracter1,caracter2;
        
        String resultado = "";
        
        System.out.print("ingrese un caracter: ");
        caracter1 = entrada.next().charAt(0);
        System.out.print("ingrese otro caracter: ");
        caracter2 = entrada.next().charAt(0);
        
        resultado += caracter1 +""+  caracter2;
        System.out.println("el resultado es: "+resultado);
    }
    
}
