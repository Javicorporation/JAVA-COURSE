package aplicacionvariables;

import java.util.Scanner;

public class AplicacionVariables {

    public static void main(String[] args) {
        /*
        // enterios   int: 1 - 2 - 3 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 0
        int numero1 = 1;
        System.out.println(numero1);
        // decimales  float: 1,2 - 2,5 - 7,8 
        
        float numero2;
        numero2 = 2.4f;
        System.out.println(numero2);
        
        
        
        // decimales largos double:  1,2 - 2,5 - 7,8
        double numero3;
        numero3 = 2.56;
        System.out.println(numero3);
        
        // cadena de caracteres String: "que mas ve"
        String cardena1;
        cardena1 = "holaaaa";
        System.out.println(cardena1);
        
        // caracteres Char: "a", "b", "A"
        char caracter;
        caracter ='A';
        System.out.println(caracter);
        
        
        // valores booleanos boolean; true - false
        boolean opcion;
        opcion = true;
        System.out.println(opcion);
        */
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        int edad;
        String genero;
        
        System.out.print("escribe tu nombre: ");
        nombre = teclado.nextLine();
        System.out.print("escribe tu edad: ");
        edad = teclado.nextInt();
        teclado.nextLine();
        System.out.print("escribe tu genero: ");
        genero = teclado.nextLine();
        
        
        System.out.println("el nombre es: "+ nombre);
        System.out.println("la edad es: "+ edad);
        System.out.println("el genero es: "+ genero);
        
        
    }
    
}
