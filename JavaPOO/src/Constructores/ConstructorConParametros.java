package Constructores;

public class ConstructorConParametros {

    int numero1;
    String nombre;
    String apellido;


    // el contructor es el primero que se iniciaaliza y ejecuta
    // este constructor puede tener parametros pero de debe inicializar con this a las variables dentro del metodo
    public ConstructorConParametros(int numero1, String nombre, String apellido){
        this.numero1 = numero1;
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("");
        System.out.println("su id es "+numero1);
        System.out.println("su nombre es "+nombre);
        System.out.println("su apellido es "+apellido);

    }
}
