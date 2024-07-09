package EjercicioControlDePeliculas.datos;

import EjercicioControlDePeliculas.Clases.Peliculas;
import EjercicioControlDePeliculas.exceptions.AccesoDatosExcepciones;
import EjercicioControlDePeliculas.exceptions.EscrituraDatosExceptions;
import EjercicioControlDePeliculas.exceptions.LecturaDatosExceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements  IAccesoDatos{

    // implementamos los metodos de la Intefaz IAccesoDatos


    // metodo de comprobar si el archivo existe
    @Override
    public boolean comprobarSiExistearchivo(String nombreArchivo) throws AccesoDatosExcepciones {
        //creamos un archivo por  medio de la libreria File
        File archivo = new File(nombreArchivo);
        //si el archivo existe, retornaria un true y si no se queda en false
        return archivo.exists();
        // el return tendria una funcion igual a esta
        /*
        if (archivo.exists()) {
            return true;
        }else {
            return false;
        }*/
    }


    // metodo de listar peliculas
    @Override
    public List<Peliculas> ListarPeliculas(String nombreArchivo) throws LecturaDatosExceptions {
        File archivo = new File(nombreArchivo);   // creamos un archivo y le pasamos el parametro
        List<Peliculas> peliculas = new ArrayList<>();   // creamos una lista de peliculas
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));   // creamos un buffer para leer el archivo
            String contenidoTit;
            String contenidoAut = "";
            String contenidoGen = "";

            contenidoTit = entrada.readLine();
            while ((contenidoTit != null) && (contenidoAut != null) && (contenidoGen != null)) {
                Peliculas pelicula = new Peliculas(contenidoTit, contenidoAut, contenidoGen);
                peliculas.add(pelicula);
                contenidoTit = entrada.readLine();
                contenidoAut = entrada.readLine();
                contenidoGen = entrada.readLine();
            }
            entrada.close();
        }catch (IOException e){
            e.printStackTrace(System.out);
        }
        return peliculas;
    }

    @Override
    public void escribirPelicula(Peliculas pelicula, String nombreArchivo, boolean anexarUnir) throws EscrituraDatosExceptions {

    }

    @Override
    public String BuscarPelicula(String nombreArchivo, String buscar) throws LecturaDatosExceptions {
        return "";
    }

    @Override
    public void crearPelicula(String nombrePelicula) throws AccesoDatosExcepciones {

    }

    @Override
    public void borrarPelicula(String nombrePelicula) throws AccesoDatosExcepciones {

    }
}
