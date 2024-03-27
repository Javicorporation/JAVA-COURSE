package condicionales;

import java.util.Scanner;

public class EjercicioCondicional11 {
    public  static  void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String cadena1, cadena2;

        System.out.print("Escriba la primera cadena de texto: ");
        cadena1 = entrada.next();
        System.out.print("Escriba la segunda cadena de texto: ");
        cadena2 = entrada.next();

        if (cadena1.equals(cadena2)){
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");

        }


    }
}
