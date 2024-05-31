package Ejercicio2POO.Ejecutado;

import Ejercicio2POO.Metodos.EcuacionSegGrad;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        boolean estado = true;
        String respuesta;
        EcuacionSegGrad raices;
        int contador = 0;

        for (int i = 0; estado; i++) {
            System.out.print("Digite el primer numero: ");
            a = sc.nextDouble();
            System.out.print("Digite el segundo numero: ");
            b = sc.nextDouble();
            System.out.print("Digite el tercer numero: ");
            c = sc.nextDouble();

            raices = new EcuacionSegGrad(a, b, c);
            raices.calcular();

            System.out.println();
            System.out.println("desea continuar: ");
            respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("si")) {
                contador++;
                estado = true;

            }else{
                contador++;
                System.out.println("la cantidad de veces que uso la ecueacion es: "+ contador);
                estado = false;
            }
        }

    }
}
