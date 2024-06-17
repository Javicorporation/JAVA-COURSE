package Ejercicio9POO.Ejecutador;

import Ejercicio9POO.Clases.Nutria;
import Ejercicio9POO.Clases.Perro;

public class base {
    public static void main(String[] args) {
        Nutria nutria = new Nutria("juan", 12, "salvaje");
        nutria.comer();
        System.out.println();
        nutria.nadar();

        Perro perro = new Perro("pablo", 2, "labrador");
        perro.comer();
        perro.ladrar();


    }
}
