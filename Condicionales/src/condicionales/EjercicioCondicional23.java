package condicionales;

import java.util.Scanner;

public class EjercicioCondicional23 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int coordenadaX;
        int coordenadaY;

        System.out.print("ingrese la coordenada X del plano carteciano: ");
        coordenadaX = entrada.nextInt();
        System.out.print("ingrese la coordenada Y del plano carteciano:  ");
        coordenadaY = entrada.nextInt();

        if (coordenadaX >= 0 && coordenadaY >= 0){
            System.out.println("Esta en el primer cuadrante");
        } else if (coordenadaX >= 0 && coordenadaY < 0) {
            System.out.println(" esta en el cuarto cuadrante");
        } else if (coordenadaY < 0 && coordenadaX < 0) {
            System.out.println("Esta en el tercer cuadrante");
        } else if (coordenadaX < 0 && coordenadaY >= 0) {
            System.out.println("Esta en el segundo cuadrante");

        }

    }
}
