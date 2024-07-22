package Ejercicio02Personas.Clases;

public class Persona {

    private final static char SEXO_DEF = 'H';
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, String apellido, int edad, int dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
}
