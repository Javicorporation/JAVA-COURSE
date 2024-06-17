package Ejercicio10POO.clases;

// si el modificador de acceso es final, nos dara un error ya que
// no se pueden heredar los metodos de una clase final a sus hijas
public class  Figura {
    protected double tamano;

    public Figura(double tamano) {
        this.tamano = tamano;
    }

    public void dibujar(){
        System.out.println("dibujar figura");
    }
    public void pintar(){
        System.out.println("pintar figura");
    }
}
