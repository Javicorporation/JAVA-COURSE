package ExercisesHerencia.Ejercicio2Herencia.Clases2;

public class Libro extends Medio{

    private int numerodePaginas;

    public Libro(String titulo, String autor, boolean prestado, int numerodePaginas) {
        super(titulo, autor, prestado);
        this.numerodePaginas = numerodePaginas;
    }

    public Libro() {
    }

    public int getNumerodePaginas() {
        return numerodePaginas;
    }

    public void setNumerodePaginas(int numerodePaginas) {
        this.numerodePaginas = numerodePaginas;
    }

    @Override
    public void prestar() {
        if (getPrestado() == true) {
            System.out.println("Esta prestado");
        }else {
            System.out.println("esta disponible");
        }
    }

    @Override
    public void devolver() {
        if (getPrestado() == true) {
            System.out.println("Ya fue devuelto.");
        }else {
            System.out.println("Aun no esta devuelto");
        }
    }

    public void leePaginas(){
        System.out.println("Esta leyendo");
    }
}
