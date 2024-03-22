package condicionales;

import java.util.Scanner;

public class Condicional_Switch {

    public static void main(String[] args) {
        // ejercicio de condicional switch
        
        Scanner entrada = new Scanner(System.in);
        
        char camino;
        
        System.out.println("esctiba un caracter: ");
        camino = entrada.next().charAt(0);
        
        switch (camino) {
            case 'A':
                System.out.println("estas en el camino "+camino);
                break;
                
            case 'B':
                System.out.println("estas en el camino "+camino);
                break;
                
            case 'C':
                System.out.println("estas en el camino "+camino);
                break;
            default:
                System.out.println("no estas en ningun camino, " + camino+ " es un camino no valido");
        }
    }
    
}
