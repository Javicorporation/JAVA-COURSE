package condicionales;

import java.util.Scanner;

public class EjercicioCondicional22 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        System.out.print("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        numero3 = entrada.nextInt();

         int numeromayor = numero1;
         int numeromenor =numero1;
         int numeromedio = numero1;

        if (numero2 > numeromayor) {
            numeromayor = numero2;
            if (numero3 > numeromayor) {
                numeromayor = numero3;
            }
        }else if(numero2 > numeromedio && numero3 < numeromedio){
            numeromedio = numero2;
        } else if(numero3 > numeromedio && numero2 < numeromedio) {
            numeromedio = numero3;
        }else if (numero2 < numeromenor){
            numeromenor = numero2;
        } else if (numero3 < numeromenor) {
            numeromenor = numero3;
        }
        System.out.println("el numero mayor es: "+numeromayor);
        System.out.println("el numero medio es: "+numeromedio);
        System.out.println("el numero menor es: "+numeromenor);


    }
}
