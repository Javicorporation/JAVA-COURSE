package Ejercicio2POO.Metodos;

import java.util.Scanner;

public class EcuacionSegGrad {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirA = "Ingrese el valor de a: ";
    public static final String msgPedirB = "Ingrese el valor de b: ";
    public static final String msgPedirC = "Ingrese el valor de c: ";
    public static final String msgPregunta = "¿Desea continuar?";
    public static final String msgCantidadDeVeces = "Usted calculo la ecuacion: ";


    private double a;
    private double b;
    private double c;

    public EcuacionSegGrad(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Pedir(String message){
        System.out.println(message);
        return getting.nextDouble();
    }


    private  double OptenerDescriminante(){
        return Math.sqrt(Math.pow(b,2) - 4 * a * c);
    }


    private void OptenerRaices(){
        double descriminante1 = OptenerDescriminante();
        double x1 = -b + descriminante1/2*a;
        double x2 = -b - descriminante1/2*a;

        System.out.println("la solucion X1 es: "+x1);
        System.out.println("la solucion X2 es: "+x2);

    }

    private void OptenerRaiz(){
        double solucion0 = -b/2*a;
        System.out.println("la solucion X0 es: "+solucion0);

    }



    private boolean ComprobarSiTieneRaices(){
        return OptenerDescriminante() > 0;
    }


    private boolean ComprobarSiTieneRaiz(){

        return OptenerDescriminante() == 0;
    }


    public void calcular(){
        if (ComprobarSiTieneRaices()) {
            OptenerRaices();
        } else if (ComprobarSiTieneRaiz()) {
            OptenerRaiz();
        }else {
            System.out.println("no tiene solucionS");
        }
    }
}
