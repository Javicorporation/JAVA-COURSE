package Ejercicio10POO.clases;

public class FiguraCerrada extends Figura{
    public FiguraCerrada(double tamano) {
        super(tamano);
    }


    @Override
    public void dibujar(){
        System.out.println("se dibujo la figura cerrada");
    }


    @Override
    public void pintar(){
        System.out.println("se pinto la figura cerrada");
        System.out.println("su tamano es: "+tamano);
    }
}
