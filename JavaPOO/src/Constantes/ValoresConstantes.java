package Constantes;

public class ValoresConstantes {

    // las constantes no se pueden cambiar ya sean privados o publicos
    public final String  nombre= "pablo";
    public int edad = 11;


    public void mostrar(){
        edad = 18;
        System.out.println("mi nombre es " + nombre+" y tengo "+edad+" años");
    }
}
