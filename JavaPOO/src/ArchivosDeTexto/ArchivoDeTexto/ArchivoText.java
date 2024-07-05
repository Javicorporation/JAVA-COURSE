package ArchivosDeTexto.ArchivoDeTexto;

import java.io.File;

public class ArchivoText {

    public void crearArchivo() {
        // creamos un objeto de la clase File con un nombre ramdon
        File archivo = new File("ArchivoDeTexto.txt");

        //ponemos un try catch para manejar las exceptions
        try {
            // ponemos un condicional para manejar el resultado la creaccion del archivo
            if (archivo.createNewFile()) {
                System.out.println("El archivo se creo con exito");
            }else {
                System.out.println("El archivo no se creo con exito o ya exsiste ");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        }
}



