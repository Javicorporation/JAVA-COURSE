
package condicionales;

import java.util.Scanner;
public class Ejercicio_De_condicional3 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int numero3;
        
        System.out.print("escriba el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("escriba el segundo numero: ");
        numero2 = entrada.nextInt();
        System.out.print("escriba el tercer numero: ");
        numero3 = entrada.nextInt();
        
        
        if (numero1  > numero2 && numero1 > numero3) {
            System.out.println("el numero mayor es: "+numero1);            
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("el numero maayor es: "+ numero2);
        }
        else {
            System.out.println("el numero mayo es el numero: "+numero3);
        }
         
         
         
         
    }
    
    
}
