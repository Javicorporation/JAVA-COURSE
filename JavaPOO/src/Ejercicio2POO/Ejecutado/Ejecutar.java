package Ejercicio2POO.Ejecutado;

import Ejercicio2POO.Metodos.EcuacionSegGrad;

import java.util.Scanner;

public class Ejecutar {

    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirA = "Ingrese el valor de a: ";
    public static final String msgPedirB = "Ingrese el valor de b: ";
    public static final String msgPedirC = "Ingrese el valor de c: ";
    public static final String msgPregunta = "¿Desea continuar?";
    public static final String msgCantidadDeVeces = "Usted calculo la ecuacion: ";


    double a;
    double b;
    double c;
    boolean estado = false;
    String respuesta;
    EcuacionSegGrad raices;
    int contador = 0;
    boolean salirPedir = false;

    public Double pedirNum(String message){

        double valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextDouble()) {
                valor = getting.nextDouble();
                salirPedir = true;
                break;
            }else{
                System.out.println("el valor ingresado no es un numero decinal, ingrese un numero decimal valido.");
                getting.next();
            }
        }while (!salirPedir);
        return valor;
    }


    public Boolean seguir(String smsSeguir){
        if(smsSeguir.equalsIgnoreCase("SI")){
            contador++;
            estado = false;
        }else{
            contador++;
            System.out.println(msgCantidadDeVeces+ contador);
            estado = true;
        }

        return estado;
    }


    public void EjecutarCalculo() {
        do{
            a = pedirNum(msgPedirA);
            b = pedirNum(msgPedirB);
            c = pedirNum(msgPedirC);
            raices = new EcuacionSegGrad(a, b, c);
            raices.calcular();

            System.out.println();
            System.out.println(msgPregunta);
            respuesta = getting.next();
            estado = seguir(respuesta);

        }while (!estado);
    }







}
