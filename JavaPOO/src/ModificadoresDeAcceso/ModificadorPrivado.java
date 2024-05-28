package ModificadoresDeAcceso;

public class ModificadorPrivado {

    public int edad;
    public String nombre;


    // si el constructor es privado causara un problema al instanciar la clase en otra clase
    private ModificadorPrivado (int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public void describir(){
        System.out.println(nombre+" tiene la edad de "+edad);
    }


    // esta metodo tiene el modificador de acceso privado, por lo que perteneces solo a esta clase
    private void consejo(){
        System.out.println("ser educado");
    }
    // pero, se puede usar desde un metodo publico en la misma clase.




    // este metodo tiene el modificador de acceso publico, por lo que se puede acceder desde otra clase
    public void hablar(){
        consejo();
        System.out.println("holaaaaaaa");
    }
}
