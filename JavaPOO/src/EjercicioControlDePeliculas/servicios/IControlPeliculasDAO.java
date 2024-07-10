package EjercicioControlDePeliculas.servicios;

public interface IControlPeliculasDAO {

    String nombreRecurso = "peliculas.txt";

    public void agregarpeliculas(String tituloPelicula, String autor, String genero);
    public void listarPeliculas();
    public void buscarPelicula(String peliculaABuscar);
    public void iniciarControlPeliculas();
}
