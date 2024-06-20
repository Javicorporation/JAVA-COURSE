package ExercisesEncapsulamiento.ejercicio3Encapsulamiento.Base3;

import ExercisesEncapsulamiento.ejercicio3Encapsulamiento.Clases.Termometro;

import java.util.Scanner;

public class Ejecutador {
    public static final Scanner getting = new Scanner(System.in);
    public final String msgPedirTemp= "Escribe una temperatura: ";
    public final String msgPedirSiONo= "quieres ingresar una nota: ";


    public double pedirDoublr(String message){
        System.out.print(message);
        return getting.nextDouble();
    }

    public String pedirstring(String message){
        System.out.print(message);
        return getting.next();
    }



    public void presentar(){
        //boolean loop;
         String respuesta;
        Termometro termometro = new Termometro();
        do {
            respuesta = pedirstring(msgPedirSiONo);
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
            if (respuesta.equalsIgnoreCase("si")){
                double temperatura = pedirDoublr(msgPedirTemp);
                termometro.addTemperatures(temperatura);
            }else {
                System.out.println("Respuesta inválida. Por favor, ingresa 'si' o 'no'.");
            }
        }while (true);
    }
}
