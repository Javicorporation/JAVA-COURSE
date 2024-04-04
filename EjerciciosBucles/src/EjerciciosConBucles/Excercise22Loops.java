package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise22Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        String passwordValid = "hola";
        String password;
        int intentos = 0;
        int opcion;
        int i = 1;
        double patrimonio = 100;
        double capital = 100;
        double valordeposito;
        double valorderetiro;


        do {
            System.out.print("Write a password: ");
            password = getting.next();
            if (password.equals(passwordValid)) {
                System.out.println("Write a option of menu");
                System.out.println("1. Depositar.");
                System.out.println("2. Retirar.");
                System.out.println("3. Consultar");
                System.out.println("4. Salir");
                System.out.print("Write a option: ");
                opcion  = getting.nextInt();

                switch (opcion){
                    case 1:
                        System.out.print("Ingese la cantida a depositar:");
                        valordeposito = getting.nextDouble();
                        capital = capital + valordeposito;
                        System.out.println("su capital es: "+capital);
                        break;
                    case 2:
                        System.out.print("Ingese la cantida a retirar:");
                        valorderetiro = getting.nextDouble();
                        capital = capital - valorderetiro;
                        System.out.println("su capital es: "+capital);
                        break;
                    case 3:
                        System.out.println("su capital es: "+ capital);

                        break;
                    case 4:
                        System.out.println("adios");
                        intentos = i;
                        break;
                }
            }

            i++;

            if (i > 3) {
                System.out.print("Exit password inalidas, exede los 3 intentos");
                 intentos = i;
            }

        }while (intentos == 0);


    }
}
