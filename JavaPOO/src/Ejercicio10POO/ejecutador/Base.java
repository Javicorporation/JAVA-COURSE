package Ejercicio10POO.ejecutador;

import Ejercicio10POO.clases.FiguraAbierta;
import Ejercicio10POO.clases.FiguraCerrada;

public class Base {
    public static void main(String[] args){
        FiguraCerrada figuraCerrada = new FiguraCerrada(12.9);
        figuraCerrada.dibujar();
        figuraCerrada.pintar();

        FiguraAbierta figuraAbierta = new FiguraAbierta(15.9);
        figuraAbierta.dibujar();
        figuraAbierta.pintar();
    }
}
