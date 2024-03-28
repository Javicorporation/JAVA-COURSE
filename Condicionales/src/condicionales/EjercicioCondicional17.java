package condicionales;

import java.util.Scanner;

public class EjercicioCondicional17 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String cadena1;
        String cadena2;

        System.out.print("Ingese la primera cadena: ");
        cadena1 = entrada.next();
        System.out.print("Ingese la segundaa cadena: ");
        cadena2 = entrada.next();

        int longitudCadena1, longitudCadena2;

        longitudCadena1 = cadena1.length();
        longitudCadena2 = cadena2.length();

        if (longitudCadena1> longitudCadena2){
            System.out.println("la longitud e la cadena 1 es mayor");
        } else if (longitudCadena2 > longitudCadena1) {
            System.out.println("la longitud de la cadena 2 es mayor");
        }else {
            System.out.println("las cadenas son iguales");
        }

    }
}
