package condicionales;

import java.util.Scanner;

public class Ejercicio_De_Condicional_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int sueldo;
        
        System.out.print("escribe tu sueldo: ");
        sueldo = entrada.nextInt();
        
        int aumento = sueldo +1500;
        if (sueldo >= 3000) {
            System.out.println("su sueldo es de: "+aumento);
        } else if(sueldo < 3000) {
            System.out.println("su sueldo no tiene aumento: "+sueldo);
        }
        
    }
    
}
