package EjercicioBanco.Basee;

import EjercicioBanco.Clases.Banco;
import EjercicioBanco.Clases.Metodos;

import java.util.Scanner;

public class Ejecutador1 {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirOP = "escribe una opcion: ";
    public static final String msgValorNoValido = "El valor ingresado no es valido. ";
    public static final String msgPediID = "Ingrese el id del usuario: ";

    Metodos metodos = new Metodos();
    public long pedirLong(String message){

        boolean loopLong;
        long valor = 0;
        do {
            System.out.print(message);
            if (getting.hasNextLong()) {
                valor = getting.nextLong();
                loopLong = true;
            }else {
                System.out.println("esta ingresando una cadena y no un valor entero,vuelva a ingresar");
                getting.next();
                loopLong = false;
            }
        }while (!loopLong);
        return valor;
    }

    public void presentar(){
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
                    id = pedirLong(msgPediID);
                    metodos.retirar(id);
                    break;
                case 2:
                    id = pedirLong(msgPediID);
                    metodos.depositar(id);
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
