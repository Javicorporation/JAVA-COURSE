package EjercicioExcepciones;

public class TestExcepciones {
    public static void main(String[] args) {

        // ejemplo de obtener un numero de un array
        int[] numeros = {1,2,3,4};
        try {
            int numero = numeros[0];
            System.out.println("El resultado es: "+numero);
            // se pueden contatenar exceptions con un "or" o |
        }catch (Exception ex){
            System.out.println("La opcion no existe");
            ex.printStackTrace(System.out);
        }finally {
            // es el codigo que se ejecuta si o si
            System.out.println("hola");
        }
    }
}
