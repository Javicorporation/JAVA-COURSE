package ExcerciseTryCatch1.Ejecutador;

public class Text {
    public static void main(String[] args) {


        try {
            double numero1 = 0.9;
            int numero = 2;
            if(numero == numero1){
                System.out.println("Bien");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
