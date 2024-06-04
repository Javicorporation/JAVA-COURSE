package Ejercicio5POO.Clases;

import java.util.Scanner;

public class NumeroComplejos {
    static  final Scanner getting = new Scanner(System.in);
    private double valorReal;
    private double valorimagi;

    public NumeroComplejos(double valorReal, double valorimagi) {
        this.valorReal = valorReal;
        this.valorimagi = valorimagi;
    }

    public double getValorReal() {
        return valorReal;
    }

    public double getValorimagi() {
        return valorimagi;
    }

    public double pedirDouble(String message){
        boolean loopValDoub;
        double valor = 0;
        do {
            System.out.println(message);
            if (getting.hasNextDouble()){
                valor = getting.nextDouble();
                loopValDoub = true;
            }else {
                System.out.println("el valor ingresado no en un valor entero.");
                getting.next();
                loopValDoub = false;
            }
        }while (!loopValDoub);
        return  valor;
    }








}
