package Estaticos;

public class Humano {

    // los aatributos se manejan ifgual que los metodos, pero ten en cuenta en modificador de acceso
    private final String nombre ="Javier";
    private final String apellido ="Luca";
    public static int edad =18;
    public static String sexo = "Masculino";
    private double estatura = 1.80;

    public void presentar(){
        System.out.println("mi nombre es: "+nombre);
        System.out.println("mi apellido es: "+apellido);
        System.out.println("mi edad es: "+edad);
        System.out.println("mi sexo es: "+sexo);
        System.out.println("mi estatura es: "+estatura);
    }
    public void hablar(){
        System.out.println("holaaaaaa");
    }
    // anteriormente vimos metodos normales



    // pero que pasa si volvemos a estos metodos estaticos
    // pues el metodo pasaria de pertenecerle del objeto a la clase
    // o sea si ponemos static en un metodo o atributo este pasa a pertenecer a la clase
    public static  void pintar(){
        System.out.println("estoy pintando ");
    }

    public static  int saberEdad(int Fnc, int Fact){
        return Fact - Fnc;
    }



}
