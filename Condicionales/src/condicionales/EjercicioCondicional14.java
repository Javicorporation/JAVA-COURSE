package condicionales;

import java.util.Scanner;

public class EjercicioCondicional14 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        char caracter1,caracter2,caracter3;
        int resultado;

        System.out.print("Ingrese el primer caracter: ");
        caracter1 = entrada.next().charAt(0);
        System.out.print("Ingrese el segundo caracter: ");
        caracter2 = entrada.next().charAt(0);
        System.out.print("Ingrese el tercer caracter: ");
        caracter3 = entrada.next().charAt(0);

        resultado = caracter1+caracter2+caracter3;
        if(resultado >= 300){
            System.out.println("suma exitosa");
        } else if (resultado < 300) {
            System.out.println("suma fallida");
        }

    }
}
