package condicionales;

import java.util.Scanner;

public class Condicionales {

    
    public static void main(String[] args) {
        // estructuras condicionales if - if else - else.
        char letra;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.print("Los carcteres validos son  A, B, C, Escriba un caracter: ");
        letra = entrada.next().charAt(0);
        
        if(letra == 'A'){
            System.out.println("escogio el carcter: "+letra);
        }else if (letra == 'B') {
            System.out.println("escogio el caracter: "+letra);
        } else if(letra == 'C'){
            System.out.println("escogio el caracter: "+letra);
        }else{
            System.out.println("no escogio ningun caracter valido");
        }
{}
    }
    
}
