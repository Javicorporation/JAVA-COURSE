package EjerciciosPOO;

import java.util.Scanner;

public class Areas {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirLado = "\nEscriba un lado del cuadrado: ";
    public static final String msgPedirRadio = "\nEscriba el radio del circulo: ";
    public static final String msgPedirBase = "\nEscriba la base: ";
    public static final String msgPedirAltura = "Escriba la altura: ";

    public  static double pedir(String message){
        System.out.print(message);
        return getting.nextDouble();
    }

    public static void presentadorDeAreas(){
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
                    double resultado11 = areaDeUnCuadrado();
                    System.out.println("el area del cuadrado es: "+resultado11);
                    break;
                case 2:
                    double resultado2 = areaDeUnTriangulo();
                    System.out.println("el area del un triangulo es: "+ resultado2);
                    break;
                case 3:
                    double resultado3 = areaDeUnCirculo();

                    System.out.println("el area del circulo es: "+resultado3);
                    break;
                case 4:
                    double resultado4 = areaDeUnRectangulo();

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

    public static double areaDeUnCuadrado(){
        double lado = pedir(msgPedirLado);
        return 4 * lado;
    }

    public static double areaDeUnTriangulo(){
        double base = pedir(msgPedirBase);
        double altura = pedir(msgPedirAltura);
        return (base * altura)/2;
    }

    public static double areaDeUnCirculo(){
        final double pi = 3.141516;
        double radio = pedir(msgPedirRadio);
        return  pi*(radio*radio);
    }

    public static double areaDeUnRectangulo(){
        double base = pedir(msgPedirBase);
        double altura = pedir(msgPedirAltura);
        return base * altura;
    }
}
