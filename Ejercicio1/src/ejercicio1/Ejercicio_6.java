
package ejercicio1;

import java.util.Scanner;


public class Ejercicio_6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int añoActual;
        int añoNacim;
        
        System.out.print("escriba el año actual: ");
        añoActual = entrada.nextInt();
        System.out.print("escriba el año en que nació: ");
        añoNacim = entrada.nextInt();
        int edad;
        edad = añoActual-añoNacim;
        System.out.println("su edad es de: "+edad);
    }
    
}
