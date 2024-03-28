package condicionales;

import java.util.Scanner;

public class EjercicionCondicional13 {
    public static  void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        char caracter;

        System.out.print("Escriba un caracter: ");
        caracter = entrada.next().charAt(0);

        if (Character.isUpperCase(caracter)){
            System.out.println("El caracter esta en mayusculas");
        } else if (Character.isLowerCase(caracter)) {
            System.out.println("El caracter esta en minuscula");
        }else{
            System.out.println("lo que escribio no es un caracter.");
        }
    }
}
