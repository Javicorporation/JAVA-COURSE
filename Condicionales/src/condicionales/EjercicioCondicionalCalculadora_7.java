package condicionales;

import java.util.Scanner;


public class EjercicioCondicionalCalculadora_7 {

    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("MENU");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Raiz cuadrada");
        System.out.println("6. Raiz cubica");
        System.out.println("7. Potencia");
        System.out.println("8. Porcentaje");
        System.out.println("9. Salir");

        System.out.print("escribe una opcion: ");
        opcion = entrada.nextInt();

        if (opcion == 9){
            System.out.print("Adios");
            return;
        } else if (opcion < 1 || opcion > 9) {
            System.out.print("No escogiste ningún número del menú");
            return;
        }

        int numero1;
        int numero2;
        System.out.print("Escribe el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Escribe el segundo numero: ");
        numero2 = entrada.nextInt();


        switch (opcion) {
            case 1:
                int suma = numero1 + numero2;
                System.out.printf("La suma de %d y %d es: %d", numero1, numero2, suma);
                break;
            case 2:
                int resta = numero1 - numero2;
                System.out.printf("La resta de %d y %d es: %d", numero1, numero2, resta);
                break;

            case 3:
                int multiplicacion = numero1 * numero2;
                System.out.printf("La multiplicacion de %d y %d es: %d", numero1, numero2, multiplicacion);
                break;

            case 4:
                int divicion = numero1 / numero2;
                System.out.printf("La divicion de %d y %d es: %d", numero1, numero2, divicion);
                break;

            case 5:
                double raizCuadrada = Math.sqrt(numero1);
                System.out.printf("La raiz cuadrada de %d es: %.2f", numero1, raizCuadrada);
                double raizCuadrada2 = Math.sqrt(numero2);
                System.out.printf("La raiz cuadrada 2 de %d es: %.2f", numero2, raizCuadrada2);
                break;

            case 6:
                double raizCubica = Math.cbrt(numero1);
                System.out.printf("La raiz cubica de %d es: %.2f", numero1, raizCubica);
                double raizCubica2 = Math.cbrt(numero2);
                System.out.printf("La raiz cubica 2 de %d es: %.2f", numero2, raizCubica2);
                break;

            case 7:
                double potencia = Math.pow(numero1, numero2);
                System.out.printf("La potencia de %d y %d es: %.2f", numero1, numero2, potencia);
                break;

            case 8:
                int porcentaje = numero1 % numero2;
                System.out.printf("El porcentaje de %d y %d es: %d", numero1, numero2, porcentaje);
                break;
        }
        
        
    }
    
}
