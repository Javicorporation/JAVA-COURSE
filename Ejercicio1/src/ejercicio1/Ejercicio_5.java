package ejercicio1;

import java.util.Scanner;

public class Ejercicio_5 {

    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         int nota1, nota2, nota3, nota4, nota5;
         System.out.print("escribe la primera nota 1: ");
         nota1 = entrada.nextInt();
         System.out.print("escribe la primera nota 2: ");
         nota2 = entrada.nextInt();
         System.out.print("escribe la primera nota 3: ");
         nota3 = entrada.nextInt();
         System.out.print("escribe la primera nota 4: ");
         nota4 = entrada.nextInt();
         System.out.print("escribe la primera nota 5: ");
         nota5 = entrada.nextInt();
         double promedio;
         promedio =(nota1+nota2+nota3+nota4+nota5)/5;
         System.out.println("el promedio es: "+promedio);
         
    }
    
}
