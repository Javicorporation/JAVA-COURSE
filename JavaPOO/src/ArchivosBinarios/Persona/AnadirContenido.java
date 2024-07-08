package ArchivosBinarios.Persona;

import java.io.*;

public class AnadirContenido extends ObjectOutputStream {

    public AnadirContenido(OutputStream in) throws IOException {
        super(in);
    }
    public void anadircontenido ()throws IOException,SecurityException{}

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }

}
