package Ejercicio6POOrepaso.Clases;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarDinero(double valor) {
        this.saldo += valor;
    }

    public void retirarDinero(double valor) {
        this.saldo -= valor;
    }
}
