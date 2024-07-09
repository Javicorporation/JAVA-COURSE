package EjercicioControlDePeliculas.datos;

import EjercicioControlDePeliculas.Clases.Peliculas;
import EjercicioControlDePeliculas.exceptions.AccesoDatosExcepciones;
import EjercicioControlDePeliculas.exceptions.EscrituraDatosExceptions;
import EjercicioControlDePeliculas.exceptions.LecturaDatosExceptions;
import com.sun.security.jgss.GSSUtil;

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
            throw new LecturaDatosExceptions("Error al leer el archivo");
        }
        return peliculas;
    }

    @Override
    public void escribirPelicula(Peliculas pelicula, String nombreArchivo, boolean anexarUnir) throws EscrituraDatosExceptions {
        File archivo = new File(nombreArchivo);
        try {
            // FileWriter sirve para esribir en un archivo, PrintWriter recibe lo que vamos a escribir
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo,anexarUnir));
            // imprimimos los datos de un archivo
            salida.println(pelicula.toString());
            salida.close();
            System.out.println();
            System.out.println("Se a añadido la pelicula "+pelicula);
            System.out.println();
        }catch (Exception e){
            e.printStackTrace(System.out);
            throw new EscrituraDatosExceptions("No se a podido escribir la pelicula: "+e.getMessage())  ;
        }

    }

    @Override
    public String BuscarPelicula(String nombreArchivo, String buscar) throws LecturaDatosExceptions {
        File archivo = new File(nombreArchivo);
        String resultado = null;

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 0;
            while (linea != null){
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    System.out.println("");
                    resultado = "El pelicula con el titulo es: "+linea+" fue encontrada";
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        }catch (IOException e){
            e.printStackTrace(System.out);
            throw new LecturaDatosExceptions("Error al buscar el archivo");
        }
        return resultado;
    }

    @Override
    public void crearPelicula(String nombrePelicula) throws AccesoDatosExcepciones {
        File archivo = new File(nombrePelicula);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se a creado el archivo");

        }catch (Exception e){
            e.printStackTrace(System.out);
            throw  new AccesoDatosExcepciones("Error al crear el archivo");
        }
    }

    @Override
    public void borrarPelicula(String nombrePelicula) throws AccesoDatosExcepciones {
        File archivo = new File(nombrePelicula);
        if (archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se a borrado el archivo.");
    }
}
