package EjercicioDeLambdas3.clases;

public class Pelicula {

    private String titulo;
    private String direcctor;
    private int estreno;
    private boolean chord;

    public Pelicula() {
    }

    public Pelicula(String titulo, String direcctor, int estreno, boolean chord) {
        this.titulo = titulo;
        this.direcctor = direcctor;
        this.estreno = estreno;
        this.chord = chord;
    }
    public Pelicula(String titulo, String direcctor, int estreno) {
        this.titulo = titulo;
        this.direcctor = direcctor;
        this.estreno = estreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirecctor() {
        return direcctor;
    }

    public void setDirecctor(String direcctor) {
        this.direcctor = direcctor;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public boolean isChord() {
        return chord;
    }

    public void setChord(boolean chord) {
        this.chord = chord;
    }


    @Override
    public String toString() {
        return "\nPelicula:" +
                "\ntitulo: " + titulo +
                "\ndirecctor: " + direcctor +
                "\nestreno: " + estreno +
                "\nchord: " + chord ;
    }
}
