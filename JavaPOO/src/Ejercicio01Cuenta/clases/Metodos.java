package Ejercicio01Cuenta.clases;

import Ejercicio4POO.Clases.Cajero;

public class Metodos {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("juan");
        Cuenta cuenta2 = new Cuenta("Maria",300);

        cuenta1.ingresar(300);
        cuenta2.ingresar(400);

        cuenta1.retirar(500);
        cuenta2.retirar(100);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }

}
