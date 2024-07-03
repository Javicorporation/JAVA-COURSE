package EjercicioExcepciones;

public class TestExcepciones {
    public static void main(String[] args) {

        //dividir un numero entre 0

        int numero = 10;
        int numero2 = 1;

        try {
            int resultado = numero / numero2;
            System.out.println("la division es "+resultado);
        }catch (Exception e){
            System.out.println("ocurrio una Exception");
            e.printStackTrace(System.out);
            //System.out.println("Exception: "+e+e.getMessage()+" "+e.getCause());
        }
        // las excepciones indicas en donde te equivocaste
    }
}
