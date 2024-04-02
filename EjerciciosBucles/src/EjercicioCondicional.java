import java.util.Scanner;

public class EjercicioCondicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.print("Ingese un numero: ");
        numero = entrada.nextInt();

        int i = 1;
        if (numero < 0) {
            System.out.println("el numero es negativo");
        } else if(numero > 0){
        while (i <= numero) {
            System.out.println(i);
            i++;
            }
        }else{
                System.out.println("lo que escribio no es un numero");
            }
    }
}
