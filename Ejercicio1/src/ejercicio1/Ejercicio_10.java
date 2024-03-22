
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author krchi
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // calcular la  raiz cubica de un nummero
        
        Scanner entrada = new Scanner(System.in);
        
        double raiz;
        double numero;
        System.out.print("escribe un numero: ");
        numero = entrada.nextDouble();
        
        raiz = Math.cbrt(numero);
        System.out.println("la  raiz cubica de "+numero+" es: "+raiz);
    }
    
}
