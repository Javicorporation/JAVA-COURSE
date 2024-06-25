package ExercisesHerencia.Ejercicio2Herencia.Clases2;

public abstract class Medio {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Medio(String titulo, String autor, boolean prestado) {
        titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
    }

    public Medio() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public abstract void prestar();
    public abstract void devolver();
}
