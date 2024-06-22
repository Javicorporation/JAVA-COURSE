package EjercicioBanco.Clases;

import java.util.Scanner;

public class Banco {
    public static final Scanner getting = new Scanner(System.in);

    Cliente cliente1 = new Cliente("Juan",1,200);
    Cliente cliente2 = new Cliente("Maria",2,100);
    Cliente cliente3 = new Cliente("Carla",3, 300);


    public static int pedirOpcion(String message){
        int valor;
        do{
            System.out.print(message);
            if (getting.hasNextInt()) {
                valor = getting.nextInt();
                break;
            }else {
                System.out.println("El valor ingresado no es un entero");
                getting.next();
            }
        }while (true);
        return valor;
    }

    public static  long pedirId(String message){
        System.out.print(message);
        return getting.nextLong();
    }

    /*public void operar(){
        cliente1.Depositar(100);
        cliente2.Depositar(200);
        cliente3.Depositar(300);
        cliente3.retirar(150);
        cliente3.imprimir();
    }*/

    public void depositosTotales(){
        int t = cliente1.retornarmonto()+cliente2.retornarmonto()+ cliente3.retornarmonto();
        System.out.println("El total de dinero es: "+t);
    }




}
