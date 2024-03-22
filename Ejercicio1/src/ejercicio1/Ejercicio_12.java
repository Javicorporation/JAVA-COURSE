package ejercicio1;

import java.util.Scanner;


public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ejercicio final
        
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        
        
        System.out.print("escriba el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("escriba el segundo numero: ");
        numero2 = entrada.nextInt();
        
        int mayor = Math.max(numero2, numero1);
        int menor = Math.min(numero1, numero2);
        
        System.out.println("el numero mayor es: "+ mayor);
        System.out.println("el numero menor es: "+menor);
       
    }
    
}
