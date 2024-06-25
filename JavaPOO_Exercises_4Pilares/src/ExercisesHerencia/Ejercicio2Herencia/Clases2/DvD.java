package ExercisesHerencia.Ejercicio2Herencia.Clases2;

public class DvD extends Medio{

    private int duracion;

    public DvD(String titulo, String autor, boolean prestado,int duracion) {
        super(titulo, autor, prestado);
        this.duracion = duracion;
    }

    public DvD() {
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void prestar() {
        if (getPrestado() == true){
            System.out.println("Esta prestado");
        }else {
            System.out.println("Esta disponible");
        }
    }

    @Override
    public void devolver() {
        if (getPrestado() == true) {
            System.out.println("Ya fue devuelto");
        }else {
            System.out.println("Aun no esta devuelto.");
        }

    }
    public void reproducir(){
        System.out.println("Reproduciendo dvD");
    }
}
