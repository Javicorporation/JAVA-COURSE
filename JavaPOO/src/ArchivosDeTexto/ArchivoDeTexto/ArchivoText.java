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
            FileWriter escritura = new FileWriter(ArchivoConText);
            //usamos el metodo escribir en un archivo
            escritura.write("QUEEEEEEEEEEEEEEEEEEEEEEEEEE pasa");
            escritura.write("\nQUEEEEEEEEEEEEEEEEEEEEEEEEEE pasa");
            //este metodo cierra el proceso de escritura
            escritura.close();
            System.out.println("Se escribio en el archivo");
        }catch (IOException e){
            System.out.println("sucedio un error");
            e.printStackTrace(System.out);
        }
    }
}



