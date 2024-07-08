package ArchivosBinarios.Tests;

import ArchivosBinarios.Persona.Persona;

import java.io.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Test test = new Test();
        //test.escribirinario();
        test.leerbinario();

    }

    // metodo para scribir en un archivo binario
    public void escribirinario(){
        // creamos una instancia de la clase persona
        Persona persona;
        try {
            // implementamos un objeto de fileOutputStream y le pasamos el nombre del archivo binario
            FileOutputStream archivo = new FileOutputStream("archivo.bin");
            // creamos un objetos para hacer la escritura
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            escritura.writeObject(new Persona("juan", "lopez", 21));
            escritura.writeObject(new Persona("maria", "luz", 22));
            escritura.writeObject(new Persona("carlos", "lopez", 23));
            System.out.println("Objeto creado");
            //no olvidar del Close
            escritura.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    // metodo para leer un archivo binario por consola.
    private void leerbinario() throws ClassNotFoundException{
        Persona persona;
        try {
            FileInputStream archivo = new FileInputStream("archivo.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            while (true){
                persona =(Persona) lectura.readObject();
                persona.mostrarDatos();
            }
        }catch (EOFException ei){
            return;
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    private void anadirBinario(){}

}


