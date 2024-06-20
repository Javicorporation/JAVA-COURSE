package ExercisesEncapsulamiento.ejercicio3Encapsulamiento.Base3;

import ExercisesEncapsulamiento.ejercicio3Encapsulamiento.Clases.Termometro;

import java.util.Scanner;

public class Ejecutador {
    public static final Scanner getting = new Scanner(System.in);
    public final static String msgPedirTemp= "Escribe una temperatura: ";
    public final static String msgPedirSiONo= "quieres ingresar una nota: ";

    public double pedirDoublr(String message){
        System.out.print(message);
        return getting.nextDouble();
    }

    public String pedirstring(String message){
        System.out.print(message);
        return getting.next();
    }

    public void presentar(){
        //creamos una variable respuesta;
         String respuesta;
         // instanciamos un un objeto de la clase Termometro
        Termometro termometro = new Termometro();

        // loop para llenar una lista
        do {
            //
            respuesta = pedirstring(msgPedirSiONo);
            // si la respuesta es no se corta el loop
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
            // si la respuesta es si, pedimos una temperatura
            if (respuesta.equalsIgnoreCase("si")){
                double temperatura = pedirDoublr(msgPedirTemp);
                termometro.addTemperatures(temperatura);
                // si es distinta de si o no, se presenta el mensaje.
            }else {
                System.out.println("Respuesta inválida. Por favor, ingresa 'si' o 'no'.");
            }
        }while (true);

        for (double temperaturas: termometro.getTemperatures()){
            System.out.println(temperaturas);
        }
        System.out.println();
        double resultado = termometro.getMaxTemperature();
        System.out.println("El temperatura mas alta es: " + resultado);
    }
}
