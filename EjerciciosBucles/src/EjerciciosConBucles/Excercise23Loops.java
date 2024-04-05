package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise23Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        boolean continuar = true;
        int opcion;
        int number1, number2;
        int suma, resta, multi, divis;

        do {
            System.out.println("OPCIONES");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. divicion");
            System.out.println("5. salir");
            System.out.print("Escriba una opcion: ");
            opcion = getting.nextInt();


            switch (opcion){
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    number1 = getting.nextInt();
                    System.out.print("ingrese el segundo numero: ");
                    number2 = getting.nextInt();
                    suma = number1 + number2;
                    System.out.println("el resultadoo de la suma es: "+suma);
                    break;
                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    number1 = getting.nextInt();
                    System.out.print("ingrese el segundo numero: ");
                    number2 = getting.nextInt();
                    resta = number1 - number2;
                    System.out.println("el resultadoo de la resta es: "+resta);
                    break;
                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    number1 = getting.nextInt();
                    System.out.print("ingrese el segundo numero: ");
                    number2 = getting.nextInt();
                    multi = number1 * number2;
                    System.out.println("el resultadoo de la multiplicacion es: "+multi);
                    break;
                case 4:
                    System.out.print("Ingrese el primer numero: ");
                    number1 = getting.nextInt();
                    System.out.print("ingrese el segundo numero: ");
                    number2 = getting.nextInt();
                    divis = number1 + number2;
                    System.out.println("el resultadoo de la division es: "+divis);
                    break;
                case 5:
                    System.out.println("chaoooooooo");
                    continuar = false;
                    break;
            }

        }while (continuar);
    }
}
