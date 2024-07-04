package ExcerciseTryCatch1.Ejecutador;

public class Text {
    public static void main(String[] args) {


        try {
            int numero1 = 0;
            int numero = 2;

            int numero3 = numero / numero1;
                System.out.println("Bien");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
