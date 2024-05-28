package MetodoToString;

public class ToStringMetodo {

    public String nombre="javier";
    public int edad = 18;
    public String genero = "masculino";


    @Override
    public String toString() {
        return "ToStringMetodo{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public static void main (String[] args ){

        ToStringMetodo objeto = new ToStringMetodo();
        String datos = objeto.toString();
        System.out.println(datos);
    }
}
