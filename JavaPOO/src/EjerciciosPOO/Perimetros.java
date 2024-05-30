package EjerciciosPOO;

import java.util.Scanner;

public class Perimetros {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirlado1 = "Escriba el primer lado: ";
    public static final String msgPedirlado2 = "Escribe el segundo lado: ";
    public static final String msgPedirlado3 = "Escribe el tercer lado: ";
    public static final String msgPedirRadio = "Escribe el radio: ";
    public static final String msgPedirBase = "Escribe la base: ";
    public static final String msgPedirAltura = "Escribe la altura: ";
    public static final String msgOpcion = "Escribe una opcion: ";

    // si creamos un metodo metodo static no podemos instancialo en un metodo de instanciacion
    public double pedir(String message){ // a este metodo pedir validamos que ingrese un decimal
        boolean sali = false;
        double valor = 0;
        do {
            if (getting.hasNextDouble()) {
                valor = getting.nextDouble();
                sali = true;
                break;
            }else {
                System.out.println("El numero decimal noo es valido.");
                getting.next();
                continue;
            }
        }while (!sali);
        return valor;
    }



    public void presentadorDePerimetros(){
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

            // validacion de ingreso de numeros
            if (getting.hasNextInt()){   // uso de hasNextInt
                opcion = getting.nextInt();  // se guarda el numero
            }else {
                System.out.println("El caracter ingresado no es valido, o no es un numero del menu");
                getting.next(); // para no validar el numero
                continue;
            }

            switch (opcion){
                case 1:
                    double resultado1 = perimetroDeUnCuadrado();
                    System.out.print("el perimetro del cuadrado es: "+resultado1);
                    break;
                case 2:
                    double resultado2 = perimetrosDeUnTriangulo();
                    System.out.print("el perimetro del triangulo es: "+resultado2);
                    break;
                case 3:
                    double resultado3 = perimetroDeUnCirculo();
                    System.out.print("el perimetro del circulo es: "+resultado3);
                    break;
                case 4:
                    double resultado4 = perimetroDeUnRectangulo();
                    System.out.print("el perimetro del rectangulo es: "+resultado4);
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


    public double perimetroDeUnCuadrado(){
        double lado1 = pedir(msgPedirlado1);
        double lado2 = pedir(msgPedirlado2);
        return lado1 + lado2;
    }

    public double perimetrosDeUnTriangulo(){
        double lado1 = pedir(msgPedirlado1);
        double lado2 = pedir(msgPedirlado2);
        double lado3 = pedir(msgPedirlado3);
        return lado1 + lado2 + lado3;
    }

    public double perimetroDeUnCirculo(){
        final double pi = 3.1416;
        double radio = pedir(msgPedirRadio);
        return 2 * pi * radio;
    }

    public double perimetroDeUnRectangulo(){
        double base = pedir(msgPedirBase);
        double altura = pedir(msgPedirAltura);
        return 2*(altura+base);
    }
}
