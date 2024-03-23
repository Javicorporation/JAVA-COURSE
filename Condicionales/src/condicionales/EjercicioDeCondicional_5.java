
package condicionales;

import java.util.Scanner;

public class EjercicioDeCondicional_5 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("escriba un numero: ");
        numero = entrada.nextInt();
        
        
        if(numero < 0){
            System.out.println("el numero es negativo");
        
        }else if (numero >0) {
            System.out.println("el numero es positivo");
            
        }else if(numero == 0){
            System.out.println("el numero es "+ numero);
        }
    }
    
}
