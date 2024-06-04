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


    public NumeroComplejos sumarNumeroC (NumeroComplejos numero){
        NumeroComplejos suma = new NumeroComplejos(valorReal + numero.getValorReal(), valorimagi + numero.getValorimagi());
        return suma;
    }

    public NumeroComplejos calcularNumeroC (NumeroComplejos numero){

        NumeroComplejos multiplicacion = new NumeroComplejos(      (valorReal* numero.getValorReal() - valorimagi * numero.getValorimagi())      ,(valorReal * numero.getValorimagi() + numero.getValorReal() * valorimagi ));
        return multiplicacion;
    }


    public boolean comprobarDualidad (NumeroComplejos numero){
        boolean igualdad = false;
        if ((valorReal == numero.getValorReal()) && (valorimagi == numero.getValorimagi())){
            igualdad = true;
        }
        return igualdad;
    }


    public NumeroComplejos multiplicarPorInt(int numero){
        NumeroComplejos multipliInt = new NumeroComplejos(valorReal* numero, valorimagi * numero);
        return multipliInt;
    }








}
