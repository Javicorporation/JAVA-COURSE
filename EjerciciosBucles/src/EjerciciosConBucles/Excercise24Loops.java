package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise24Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int i = 1;
        int numRamdon = (int) Math.random() * 50;
        int numero;

        do {
            System.out.print("ingrese el numero que usted cre que sea: ");
            numero = getting.nextInt();

            if (numRamdon < numero) {
                System.out.println("el numero es menor");
            }
            if (numRamdon > numero){
                System.out.println("el numero es mayor");
            }
            if (numRamdon == numero) {
                System.out.print("ganaste");
            }

        }while (numero != numRamdon);
    }
}
