package EjercicioBanco.Basee;

import EjercicioBanco.Clases.Banco;

import java.util.Scanner;

public class Ejecutador1 {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirOP = "escribe una opcion: ";
    public static final String msgValorNoValido = "El valor ingresado no es valido. ";
    public static final String msgPediID = "Ingrese el id del usuario: ";

    public void presentar(){
        Banco banco = new Banco();
        int opcion;
        boolean loopmen = false;
        long id;

        do{
            System.out.println("--- MENU ---");
            System.out.println("1. Retirar");
            System.out.println("2. Depositar");
            System.out.println("3. Salir");
            opcion = Banco.pedirOpcion(msgPedirOP);

            switch (opcion){
                case 1:
                    System.out.print(msgPediID);
                    id = getting.nextInt();
                    banco.depositar(id);
                    break;
                case 2:
                    System.out.print(msgPediID);
                    id = getting.nextInt();
                    banco.retirar(id);
                    break;
                case 3:
                    System.out.println("Gracias, Bye");
                    loopmen= true;
                    break;
                default:
                    System.out.println(msgValorNoValido);
            }
        }while (!loopmen);

    }
}
