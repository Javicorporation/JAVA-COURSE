package EjerciciosPOO;

import java.util.Scanner;

public class Heron {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgLado1 = "Escribe el primer lado: ";
    public static final String msgLado2 = "Escribe el segundo lado: ";
    public static final String msgLado3 = "Escribe el tercer lado: ";



    public static  void presentadorDeHeron(){
        hero();
    }

    public static double pedir (String message){
        System.out.print(message);
        return getting.nextDouble();
    }

    public static  void hero(){
        double lado1 = pedir(msgLado1);
        double lado2 = pedir(msgLado2);
        double lado3 = pedir(msgLado3);
        double areaP = (lado1 + lado2 + lado3)/2;
        double resultado = Math.sqrt(areaP*(areaP - lado1)*(areaP - lado2)*(areaP - lado3));
        System.out.println("el resultado del metodo Heron: "+resultado);
    }
}
