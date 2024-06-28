package Polimorfismo;

public abstract class Animal {
    private String nombre;
    private String rasa;
    private int edad;

    public Animal(String nombre, String rasa, int edad) {
        this.nombre = nombre;
        this.rasa = rasa;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void realizarSonido();
}
