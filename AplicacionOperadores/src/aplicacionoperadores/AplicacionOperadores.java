package aplicacionoperadores;

import java.util.Scanner;

public class AplicacionOperadores {

    public static void main(String[] args) {
        int numero;
        int numero2;

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("escribe el primer numero: ");
        numero = teclado.nextInt();
        
        System.out.print("escribe el segundo numero: ");
        numero2 = teclado.nextInt();
        
        int suma = numero + numero2;
        int resta = numero - numero2;
        int multiplicacion = numero * numero2;
        int divicion = numero / numero2;
        
        System.out.println("la suma es: "+ suma);
        System.out.println("la resta es: "+ resta);
        System.out.println("la multiplicacion es: "+ multiplicacion);
        System.out.println("la divicion es: "+ divicion);
        
    }
    
}
