package condicionales;

import java.util.Scanner;

public class EjercicioCondicional19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int dia, mes;

        System.out.print("ingrese el dia: ");
        dia = entrada.nextInt();

        System.out.print("ingese el mes: ");
        mes = entrada.nextInt();

        if (dia == 25 && mes == 12) {
            System.out.println("Es navidad");
        } else if (dia >= 1 && dia <=31 && mes < 12) {
            System.out.println("es un dia normal");
        } else if (dia <= 0 || dia > 31 && mes < 1 || mes >12) {
            System.out.println("la fecha ingresada no es valida");
        }

    }
}
