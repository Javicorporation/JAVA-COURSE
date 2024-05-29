package EjerciciosPOO;

import java.util.Scanner;

public class Perimetros {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirlado1 = "Escriba el primer lado: ";
    public static final String msgPedirlado2 = " Escribe el segundo lado: ";
    public static final String msgPedirlado3 = "Escribe el tercer lado: ";
    public static final String msgPedirRadio = "Escribe el radio: ";
    public static final String msgPedirBase = "Escribe la base: ";
    public static final String msgPedirAltura = "Escribe la altura: ";
    public static final String msgOpcion = "Escribe una opcion: ";


    public static double pedir(String message){
        System.out.println(message);
        return getting.nextDouble();
    }



    public static void presentador(){
        int opcion;
        boolean salir = false;

        do {
            System.out.println("\n-------- MENU -----------");
            System.out.println("1. Calcular Perimetros del un cuadrado");
            System.out.println("2. Calcular Perimetros del un triangulo");
            System.out.println("3. Calcular Perimetros del un circulo");
            System.out.println("4. Calcular Perimetros del un resctangulo");
            System.out.println("5. Salir");
            System.out.print(msgOpcion);
            if (getting.hasNextInt()){
                opcion = getting.nextInt();
            }else {
                System.out.println("El caracter ingresado no es valido, o no es un numero del menu");
                getting.next();
                continue;
            }

            switch (opcion){
                case 1:
                    double resultado1 = perimetroDeUnCuadrado();
                    System.out.print("el perimetro del cuadrado es: "+resultado1);
                    System.out.println(" ");
                    break;
                case 2:
                    double resultado2 = perimetroDeUnCuadrado();
                    System.out.print("el perimetro del cuadrado es: "+resultado2);
                    break;
                case 3:
                    double resultado3 = perimetroDeUnCuadrado();
                    System.out.print("el perimetro del cuadrado es: "+resultado3);
                    break;
                case 4:
                    double resultado4 = perimetroDeUnCuadrado();
                    System.out.print("el perimetro del cuadrado es: "+resultado4);
                    break;
                case 5:
                    System.out.println("adios");
                    salir = true;
                    break;
                default:
                    System.out.println("el valor ingresado no es un numero del menu");
            }
        }while (!salir);




    }






    public  static double perimetroDeUnCuadrado(){
        double lado1 = pedir(msgPedirlado1);
        double lado2 = pedir(msgPedirlado2);
        double resultado = lado1 + lado2;
        return resultado;
    }
}
