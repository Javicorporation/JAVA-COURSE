package Encapsulamiento;

public class Persona {

    //vamos a poder acceder a los atributos depemdiendo el encapsulamiento
    // si el modificador de acceso es privado esos atributos solo perteneceran a la clase donde se los crea
    private int edad;
    private String nombre;
    private String apellido;
    private double altura;

    // si el modificador de acceso es publico, se podra acceser a los atributos desde cualquier clase
    public String sexo;


    // para poder acceder a esos atributos privados desde otras clase
    // podemos utilizar los setters y los getters
    // set = establecer
    // get = optener

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido( String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }
}
