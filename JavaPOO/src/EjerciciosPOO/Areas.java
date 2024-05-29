package EjerciciosPOO;

import java.util.Scanner;

public class Areas {
    public final static Scanner getting = new Scanner(System.in);


    public  static double pedir(String message){
        System.out.println(message);
        return getting.nextInt();
    }




    public static void presentador2(){
        int opcion;
        boolean salir = false;

        do {
            System.out.println();
            System.out.println("-------- MENU -----------");
            System.out.println("1. Calcular Area de un cuadrado");
            System.out.println("2. Calcular Area de un triangulo");
            System.out.println("3. Calcular Area de un circulo");
            System.out.println("4. Calcular Area de un rectangulo");
            System.out.println("5. Salir");
            System.out.print("Escribe una opcion: ");
            if (getting.hasNextInt()){
                opcion = getting.nextInt();
            }else {
                System.out.println("el caracter ingresado no es valido");
                getting.next();
                continue;
            }

            switch (opcion){
                case 1:
                    double resultado1 = 0;

                    System.out.println("el area del cuadrado es: "+resultado1);
                    break;
                case 2:
                    double resultado2 = 0;
                    System.out.println("el area del un triangulo es: "+ resultado2);
                    break;
                case 3:
                    double resultado3 = 0;

                    System.out.println("el area del circulo es: "+resultado3);
                    break;
                case 4:
                    double resultado4 = 0;

                    System.out.println("el area del rectangulo es: "+resultado4);
                    break;
                case 5:
                    System.out.println("adios");
                    salir = true;
                    break;
                default:
                    System.out.println("el numero no esta en el menu.");


            }
        }while (!salir);





    }







}
