package EjercicioBanco.Clases;

import java.util.Scanner;

public class Banco {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirUser = "escribe el id del usuario que quieres utilizar: ";
    public static final String msgValorNoValido = "El valor ingresado no es valido.";
    public static final String msgPedirOP = "escribe una opcion: ";
    public static final String msgValorARetirar = "Escribe el valor a retirar: ";
    public static final String msgValorADepositrar = "Escribe el valor a depositar: ";

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
        }
        if (cliente2.getId() == id) {
            System.out.println("su valor actual es de "+ cliente2.getMonto());
            valor = pedirOpcion(msgValorARetirar);
            cliente2.retirar(valor);
            System.out.println("su valor actual es de "+ cliente2.getMonto());
        }
        if (cliente3.getId() == id) {
            System.out.println("su valor actual es de "+ cliente3.getMonto());
            valor = pedirOpcion(msgValorARetirar);
            cliente3.retirar(valor);
            System.out.println("su valor actual es de "+ cliente3.getMonto());
        }
        if (cliente1.getId() != id && cliente2.getId() != id  && cliente3.getId() != id){
            System.out.println("el valor no es valido, quieres ver los clientes que existen? (si/no)");
            opcion = getting.next();
            if (opcion.equalsIgnoreCase("si")) {
                cliente1.imprimir();
                cliente2.imprimir();
                cliente3.imprimir();
            } else if (opcion.equalsIgnoreCase("no")) {
                System.out.println("Bueno");
            }
        }else {
            System.out.println("mal");
        }
    }

    public void depositar(long id){
        String opcion;
        int valor = 0;
        switch ((int) id){
            case 1:
                System.out.println("el valor actual del monto a depositar: "+ cliente1.getMonto());
                valor = (int) pedirId(msgValorADepositrar);
                cliente1.Depositar(valor);
                System.out.println("el valor actual del monto a depositar: "+ cliente1.getMonto());
                break;
            case 2:
                System.out.println("el valor actual del monto a depositar: "+ cliente2.getMonto());
                valor = (int) pedirId(msgValorADepositrar);
                cliente2.Depositar(valor);
                System.out.println("el valor actual del monto a depositar: "+ cliente2.getMonto());
                break;
            case 3:
                System.out.println("el valor actual del monto a depositar: "+ cliente3.getMonto());
                valor = (int) pedirId(msgValorADepositrar);
                cliente3.Depositar(valor);
                System.out.println("el valor actual del monto a depositar: "+ cliente3.getMonto());
                break;
            default:
                System.out.println("el valor no es valido, quieres ver los clientes que existen? (si/no)");
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


    public void depositosTotales(){
        int t = cliente1.retornarmonto()+cliente2.retornarmonto()+ cliente3.retornarmonto();
        System.out.println("El total de dinero es: "+t);
    }




}
