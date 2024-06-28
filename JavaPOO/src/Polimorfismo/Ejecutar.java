package Polimorfismo;

public class Ejecutar {
    public static void main (String[] args){

        Perro perro = new Perro("juan","salchicha",2);
        perro.realizarSonido();

        Gato gato = new Gato("mimi", "montes",3);
        gato.realizarSonido();

        Loro loro = new Loro("nose", "nose", 4);
        loro.realizarSonido();
    }
}
