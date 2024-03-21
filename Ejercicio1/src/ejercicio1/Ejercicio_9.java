
package ejercicio1;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        // ejercicio de exponente
        
        Scanner entrada = new Scanner(System.in);
        int base;
        int potencia;
        System.out.println("escriba una base: ");
        base = entrada.nextInt();
        System.out.println("escriba la potencia: ");
        potencia = entrada.nextInt();
        
        int Resultado = (int) Math.pow(base, potencia);
        System.out.println("el numero base "+base+ " con el exponente "+potencia+ " es igual a: "+Resultado);
    }
    
}
