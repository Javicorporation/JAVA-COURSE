package Ejercicio12POO.clases;

public abstract class Jugador {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Jugador(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // creamos un metod abstracto, el detalle es que estos medodos no usan llaves
    // un metodo abstracto no se puede implementar en su clase padre(osea el mismo) sino en sus hijas
    public abstract void jugar();

    public void estoyHablando(){
        System.out.println("Estoy hablando");
    }
}
