package ArchivosDeTexto.Test;

import ArchivosDeTexto.ArchivoDeTexto.ArchivoText;

public class Test {
    public static void main(String[] args) {
        ArchivoText archivoText = new ArchivoText();
        archivoText.crearArchivoConText();
        //archivoText.eliminarArchivoConText();
        archivoText.escribirEnElArchivo();
        archivoText.leerArchivoDeText();
    }
}
