package ExcerciseTryCatch.Clases;

public class Test {
    public static void main(String[] args) {

        int resultado = 0;
        try {
            Division.dividir(2,0);
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("ya estaaaaa");
        }

    }
}
