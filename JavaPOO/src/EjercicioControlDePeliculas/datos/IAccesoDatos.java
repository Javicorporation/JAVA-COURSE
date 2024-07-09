package EjercicioControlDePeliculas.datos;

import EjercicioControlDePeliculas.Clases.Peliculas;
import EjercicioControlDePeliculas.exceptions.AccesoDatosExcepciones;
import EjercicioControlDePeliculas.exceptions.EscrituraDatosExceptions;
import EjercicioControlDePeliculas.exceptions.LecturaDatosExceptions;

import java.util.List;

public interface IAccesoDatos {


    // creamos los metodos abstractos necesarios para implementarlo en otra clase
    // el throws es para lanzar un aexception a un metodo especifico
    public boolean comprobarSiExistearchivo(String nombreArchivo) throws AccesoDatosExcepciones;
    public List<Peliculas> ListarPeliculas(String  nombreArchivo) throws LecturaDatosExceptions;
    public void escribirPelicula(Peliculas pelicula, String nombreArchivo,boolean anexarUnir) throws EscrituraDatosExceptions;
    public String BuscarPelicula(String nombreArchivo, String buscar) throws LecturaDatosExceptions;
    public void crearPelicula(String nombrePelicula) throws AccesoDatosExcepciones;
    public void borrarPelicula(String nombrePelicula) throws AccesoDatosExcepciones;
}
