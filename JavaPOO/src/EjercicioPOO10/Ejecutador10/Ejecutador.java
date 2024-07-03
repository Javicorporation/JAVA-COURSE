package EjercicioPOO10.Ejecutador10;

import EjercicioPOO10.Clases10.Electrodomesticos;
import EjercicioPOO10.Clases10.Lavadora;
import EjercicioPOO10.Clases10.Television;

import java.util.Scanner;

public class Ejecutador {
    public static final Scanner getting = new Scanner(System.in);
    public void presentar(){
        int opcion = 0;
        Electrodomesticos electrodomesticoss[] = new Electrodomesticos[3];

        for (int i = 0; i < electrodomesticoss.length;){
            System.out.println("\nDeigite una opcion");
            System.out.println("1. Agregar Electrodomestico");
            System.out.println("2. Agregar Lavadora");
            System.out.println("3. Agregar Television");
            System.out.print("Escribe una opcion: ");
            opcion = getting.nextInt();
            System.out.println();
            if (opcion == 1 || opcion == 2 || opcion == 3) {
                switch (opcion){
                    case 1:
                        System.out.print("Ingrese un color: ");
                        String color = getting.next();
                        System.out.print("Ingrese el consumo energetico: ");
                        char consumoEnergetico = getting.next().charAt(0);
                        System.out.print("Ingrese el precio: ");
                        double precioBase = getting.nextDouble();
                        System.out.print("Ingrese el peso: ");
                        double peso = getting.nextDouble();
                        electrodomesticoss[i] = new Electrodomesticos(precioBase,color,consumoEnergetico,peso);
                        i++;
                        break;
                    case 2:
                        System.out.print("Ingrese un color de la lavadora: ");
                        String colorLav = getting.next();
                        System.out.print("Ingrese el consumo energetico de la lavadora: ");
                        char consumoEnergeticoLav = getting.next().charAt(0);
                        System.out.print("Ingrese el precio de la lavadora: ");
                        double precioBaseLav = getting.nextDouble();
                        System.out.print("Ingrese el peso de la lavadora: ");
                        double pesoLav = getting.nextDouble();
                        System.out.print("Ingrese la carga de la lavadora: ");
                        int cargaLav = getting.nextInt();
                        electrodomesticoss[i] = new Lavadora(precioBaseLav,colorLav,consumoEnergeticoLav,pesoLav,cargaLav);
                        i++;

                        break;
                    case 3:
                        System.out.print("Ingrese un color de la television: ");
                        String colorTel = getting.next();
                        System.out.print("Ingrese el consumo energetico de la television: ");
                        char consumoEnergeticoTel = getting.next().charAt(0);
                        System.out.print("Ingrese el precio de la television: ");
                        double precioBaseTel = getting.nextDouble();
                        System.out.print("Ingrese el peso de la television: ");
                        double pesoTel = getting.nextDouble();
                        System.out.print("Ingrese la resolucion de la television: ");
                        int resolucion = getting.nextInt();
                        System.out.print("el televisor tiene sincronizador TDT?: ");
                        boolean sincronizadorTDT= getting.hasNextBoolean();
                        electrodomesticoss[i] = new Television(precioBaseTel,colorTel,consumoEnergeticoTel,pesoTel,resolucion,sincronizadorTDT);
                        i++;
                        break;
                    default:
                        System.out.println("el valor ingresado no es valido");
                        break;
                }
            }
        }
        // calcular la suma de los electrodomesticos
        double sumaElectr = 0;
        double sumaLavadora = 0;
        double sumaTelevision = 0;
        for (int i = 0; i < electrodomesticoss.length; i++) {
            if (electrodomesticoss[i] instanceof Electrodomesticos){
                sumaElectr += electrodomesticoss[i].obtenerPreciofinal();
            }
            if (electrodomesticoss[i] instanceof Lavadora){
                sumaLavadora += electrodomesticoss[i].obtenerPreciofinal();
            }
            if (electrodomesticoss[i] instanceof Television){
                sumaTelevision += electrodomesticoss[i].obtenerPreciofinal();
            }
        }
        System.out.println();
        System.out.println("la suma del precio de Electrodomesticos es: "+sumaElectr);
        System.out.println("la suma del precio de Lavadoras es: "+sumaLavadora);
        System.out.println("la suma del precio de Televisores es: "+sumaTelevision);

    }
}
