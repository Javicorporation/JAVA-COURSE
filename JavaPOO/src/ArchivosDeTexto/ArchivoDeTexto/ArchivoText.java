package ArchivosDeTexto.ArchivoDeTexto;

import java.io.File;

public class ArchivoText {

    public void crearArchivo() {
        // creamos un objeto de la clase File con un nombre ramdon
        // en una ruta relativa.
        //File archivo = new File("ArchivoDeTexto.txt");
        // en una ruta absoluta.
        File archivo = new File("C:\\Users\\krchi\\OneDrive - Universidad de Guayaquil\\UG\\ArchivoDeTexto.txt");


        //metodos de la clase File
        //h
        System.out.println("Nombre del archivo: " + archivo.getName());
        //h
        System.out.println("Ruta del archivo: " + archivo.getAbsolutePath());
        //h
        System.out.println("El archivo es: " + archivo.exists());
        //h
        System.out.println("se puede escribir en el archivo: " + archivo.canWrite());
        //h
        System.out.println("se puede leer en el archivo: " + archivo.canRead());
        //h
        System.out.println("es un archivo: " + archivo.isFile());
        //h
        System.out.println("es un directorio? " + archivo.isDirectory());
        //h
        System.out.println("Cual es la longitud del archivo: "+archivo.length());

    }
}



