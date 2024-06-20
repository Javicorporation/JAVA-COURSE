package EjercicioBanco.Clases;

import java.util.Scanner;

public class Banco {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirUser = "escribe el id del usuario que quieres utilizar: ";
    public static final String msgValorNoValido = "El valor ingresado no es valido.";
    public static final String msgPedirOP = "escribe una opcion: ";
    public static final String msgValorARetirar = "escribe el valor a retirar: ";


    Cliente cliente1 = new Cliente("Juan",1,200);
    Cliente cliente2 = new Cliente("Maria",2,100);
    Cliente cliente3 = new Cliente("Carla",3, 300);

    public Banco() {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.cliente3 = cliente3;
    }

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

    public long pedirId(String message){
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

    public void retirar(long id){
        String opcion;
        int valor;
        if (cliente1.getId() == id) {
            System.out.println("su valor actual es de "+ cliente1.getMonto());
           valor = pedirOpcion(msgValorARetirar);
            cliente1.retirar(valor);
            System.out.println("su valor actual es de "+ cliente1.getMonto());
        } else if (cliente2.getId() == id) {
            System.out.println("su valor actual es de "+ cliente2.getMonto());
            valor = pedirOpcion(msgValorARetirar);
            cliente2.retirar(valor);
            System.out.println("su valor actual es de "+ cliente2.getMonto());
        } else if (cliente3.getId() == id) {
            System.out.println("su valor actual es de "+ cliente3.getMonto());
            valor = pedirOpcion(msgValorARetirar);
            cliente3.retirar(valor);
            System.out.println("su valor actual es de "+ cliente3.getMonto());

        }else{
            System.out.println("el valor no es valido, quieres ver los clientes que existen?");
            opcion = getting.next();
            if (opcion.equalsIgnoreCase("si")) {
                cliente1.imprimir();
                cliente2.imprimir();
                cliente3.imprimir();
            } else if (opcion.equalsIgnoreCase("no")) {
                System.out.println("Bueno");
            }
        }
    }

    public void depositar(long id){}


    public void depositosTotales(){
        int t = cliente1.retornarmonto()+cliente2.retornarmonto()+ cliente3.retornarmonto();
        System.out.println("El total de dinero es: "+t);

    }




}
