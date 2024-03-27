package condicionales;

import java.util.Scanner;

public class EjercicioCondicional12 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double resultado;
        System.out.println("1. Calcular el area de un triangulo");
        System.out.println("2. Calcular area circulo");
        System.out.println("3. Calcular area trapecio");
        System.out.println("4. Calcualr area cuadrado");
        System.out.println("5. salir");

        System.out.print(" escribe una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                int base;
                int altura;
                System.out.print("Escribe la base: ");
                base = entrada.nextInt();
                System.out.print("Escribe la altura: ");
                altura = entrada.nextInt();
                resultado = (base* altura)/2;
                System.out.println("La area del triangulo es: "+resultado);
                break;
            case 2:
                double radio;
                double pi =3.141516;
                System.out.print("Escribe el radio: ");
                radio = entrada.nextDouble();
                resultado = pi * Math.pow(radio, 2);
                System.out.println("El area del circulo es: "+resultado);

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                System.out.println("Adios, bay");
                break;
        }
    }
}
