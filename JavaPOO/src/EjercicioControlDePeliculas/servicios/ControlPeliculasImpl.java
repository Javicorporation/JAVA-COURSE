package EjercicioControlDePeliculas.servicios;

import EjercicioControlDePeliculas.Clases.Peliculas;
import EjercicioControlDePeliculas.datos.IAccesoDatos;
import EjercicioControlDePeliculas.exceptions.AccesoDatosExcepciones;

import java.io.StringReader;
import java.util.List;

public class ControlPeliculasImpl implements IControlPeliculasDAO{

    private final IAccesoDatos accesoDatos;

    public ControlPeliculasImpl(IAccesoDatos accesoDatos) {
        this.accesoDatos = accesoDatos;
    }

    @Override
    public void agregarpeliculas(String tituloPelicula, String autor, String genero) {
        Peliculas pelicula = new Peliculas(tituloPelicula, autor, genero);
        boolean anexar = false;
        try {
            anexar = accesoDatos.comprobarSiExistearchivo(nombreRecurso);
            accesoDatos.escribirPelicula(pelicula,nombreRecurso,anexar);
        }catch (AccesoDatosExcepciones e){
            System.out.println("Error de acceso a datos ");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            List<Peliculas> pelicula = this.accesoDatos.ListarPeliculas(nombreRecurso);
            for (Peliculas p : pelicula) {
                System.out.println("");
                System.out.println("Pelicula: " + p.getTitulo());
                System.out.println("Autor: " + p.getAutor());
                System.out.println("Genero: " + p.getGenero());
            }
        }catch (AccesoDatosExcepciones e){
            e.printStackTrace(System.out);
            System.out.println();
        }
    }

    @Override
    public void buscarPelicula(String peliculaABuscar) {
        String resultado = null;
        try {
            resultado = this.accesoDatos.BuscarPelicula(nombreRecurso,peliculaABuscar);
        }catch (AccesoDatosExcepciones e){
            System.out.println("Error de acceso a datos ");
            e.printStackTrace(System.out);
        }
        if (resultado != null) {
            System.out.println("pelicula encontrada");
        }else {
            System.out.println("pelicula no encontrada");
        }
    }

    @Override
    public void iniciarControlPeliculas() {
        try {
            if (this.accesoDatos.comprobarSiExistearchivo(nombreRecurso)){
                accesoDatos.borrarPelicula(nombreRecurso);
                accesoDatos.crearPelicula(nombreRecurso);
            }else {
                accesoDatos.crearPelicula(nombreRecurso);
            }
        }catch (AccesoDatosExcepciones e){
            System.out.println("Error de acceso a datos ");
            e.printStackTrace(System.out);
        }

    }
}
