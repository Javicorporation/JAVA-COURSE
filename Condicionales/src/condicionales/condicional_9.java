package condicionales;

import java.util.Scanner;

public class condicional_9 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. salir");
        double valorDepositar;
        double valorRetiro;
        double patrimonio = 900;
        int opcion;
        System.out.print("elija una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                System.out.print("ingrese el valor a depositar: ");
                valorDepositar = entrada.nextDouble();
                patrimonio = patrimonio + valorDepositar;
                System.out.println("su patrimonio es de: "+patrimonio);
                break;
            case 2:
                System.out.print("ingrese el valor a retirar: ");
                valorRetiro = entrada.nextDouble();

                if(valorRetiro > patrimonio ){
                    System.out.println("el valor que intenta reirar es mas que el patrimonio que tiene");
                } else if (valorRetiro < patrimonio) {
                    patrimonio = patrimonio - valorRetiro;
                    System.out.println("su patrimonio que le queda es de : "+patrimonio);
                }
                break;
            case 3:
                System.out.println("Su patrimonio es de: "+patrimonio);
                break;
            case 4:
                System.out.println("adios");
                break;
            default:
                System.out.println("escogio una opcion no valida");

        }


    }
}
