package ArchivosDeTexto.ArchivoDeTexto;

import java.io.*;

public class ArchivoText {
    File ArchivoConText;

    // metodo crear acrchivo
    public void crearArchivoConText() {
        ArchivoConText = new File("C:\\Users\\krchi\\OneDrive - Universidad de Guayaquil\\UG\\ArchivoConTexto.txt");
        try {
            if (ArchivoConText.createNewFile()) {
                System.out.println("Archivo creado con exito");
            }else {
                System.out.println("Fracaso");
            }
        }catch (IOException e){
            e.printStackTrace(System.out);
        }
    }


    // metodo eliminar achivo
    public void eliminarArchivoConText() {
        if (ArchivoConText.delete()) {
            System.out.println("Archivo eliminado con exito");
        }else {
            System.out.println("Fracaso");
        }

    }

    // metodo agregar texto a un archivo
    public void escribirEnElArchivo(){
        try {
            // creamos un aobjeto al que vamos a escribir
            FileWriter escritura = new FileWriter(ArchivoConText, true);
            //usamos el metodo escribir en un archivo
            escritura.write("Qholala");
            escritura.write("\nhshjdjfsd");
            escritura.write("\njuana");
            //este metodo cierra el proceso de escritura
            escritura.close();
            System.out.println("Se escribio en el archivo");
        }catch (IOException e){
            System.out.println("sucedio un error");
            e.printStackTrace(System.out);
        }
    }

    public void leerArchivoDeText(){
        String contenido = "";
        try {
            // creamos un objeto lector y le pasamos el archivo
            FileReader lector = new FileReader(ArchivoConText);
            // creamos un objeto que guarde por un momento el texto leido
            BufferedReader lectura = new BufferedReader(lector);
            // asignamos el contenido leido een una variable de texto
            contenido = lectura.readLine();
            // imprimimos el contenido con un bucle
            while (contenido != null){
                // .readLine solo lee una linea
                System.out.println(contenido);
                contenido = lectura.readLine();
            }
        }catch (IOException e){
            System.out.println("sucedio un error");
            e.printStackTrace(System.out);
        }
    }
}



