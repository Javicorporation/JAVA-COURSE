package Ejercicio10POO.clases;

public class FiguraAbierta extends Figura{

    public FiguraAbierta(double tamano) {
        super(tamano);
    }

    @Override
    public void dibujar(){
        System.out.println("se dibijo la figura abierta");
    }

    @Override
    public void pintar(){
        System.out.println("se pinto la digura abierta");
        System.out.println("su tamano es: "+tamano);
    }
}
