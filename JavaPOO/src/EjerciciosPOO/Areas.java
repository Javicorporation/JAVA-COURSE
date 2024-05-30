package EjerciciosPOO;

import java.util.Scanner;

public class Areas {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirLado = "\nEscriba un lado del cuadrado: ";
    public static final String msgPedirRadio = "\nEscriba el radio del circulo: ";
    public static final String msgPedirBase = "\nEscriba la base: ";
    public static final String msgPedirAltura = "Escriba la altura: ";


    public void presentadorDeAreas(){
        int opcion;
        boolean salir = false;
        Areas areas = new Areas();

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
                    double resultado1 = areas.areaDeUnCuadrado();
                    System.out.println("el area del cuadrado es: "+resultado1);
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

    public double pedir(String message){
        boolean sali = false;
        double valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextDouble()){
                valor = getting.nextDouble();
                sali = true;
                break;
            }else {
                System.out.println("El numero decimal noo es valido.");
                getting.next();

            }
        }while (!sali);
        return valor;
    }

    public double areaDeUnCuadrado(){
        double lado = pedir(msgPedirLado);
        return lado * lado;
    }

    public double areaDeUnTriangulo(){
        double base = pedir(msgPedirBase);
        double altura = pedir(msgPedirAltura);
        return (base * altura)/2;
    }

    public double areaDeUnCirculo(){
        final double pi = 3.141516;
        double radio = pedir(msgPedirRadio);
        return  pi*(radio*radio);
    }

    public double areaDeUnRectangulo(){
        double base = pedir(msgPedirBase);
        double altura = pedir(msgPedirAltura);
        return base * altura;
    }
}
