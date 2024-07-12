package EjercicioDeListas.Clases;

public interface Entregables {

    boolean equals(VideoJuego videoJuego);

    boolean equals(Serie serie);

    public void entregar();
    public void devolver();
    public boolean comprobarArticuloExistente();
    public int compareTo(Object object);
}
