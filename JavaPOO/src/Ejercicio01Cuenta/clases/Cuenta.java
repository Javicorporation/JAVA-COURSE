package Ejercicio01Cuenta.clases;

import java.util.Scanner;

public class Cuenta {
    public final Scanner getting = new Scanner(System.in);
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "\nCuenta: " +
                "\ntitular: " + titular +
                "\ncantidad: " + cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("error: ingresando cuenta");
        }else {
            this.cantidad+=cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0 ){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }

}

