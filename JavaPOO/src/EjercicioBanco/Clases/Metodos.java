package EjercicioBanco.Clases;

import java.util.Scanner;

public class Metodos {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgValorARetirar = "Escribe el valor a retirar: ";
    public static final String msgValorADepositrar = "Escribe el valor a depositar: ";

    Banco banco = new Banco();



    public void retirar(long id){
        String opcion;
        int valor;
        if (banco.cliente1.getId() == id) {
            System.out.println("su valor actual es de "+ banco.cliente1.getMonto());
            valor = Banco.pedirOpcion(msgValorARetirar);
            banco.cliente1.retirar(valor);
            System.out.println("su valor actual es de "+ banco.cliente1.getMonto());
        }
        if (banco.cliente2.getId() == id) {
            System.out.println("su valor actual es de "+ banco.cliente2.getMonto());
            valor = Banco.pedirOpcion(msgValorARetirar);
            banco.cliente2.retirar(valor);
            System.out.println("su valor actual es de "+ banco.cliente2.getMonto());
        }
        if (banco.cliente3.getId() == id) {
            System.out.println("su valor actual es de "+ banco.cliente3.getMonto());
            valor = Banco.pedirOpcion(msgValorARetirar);
            banco.cliente3.retirar(valor);
            System.out.println("su valor actual es de "+ banco.cliente3.getMonto());
        }
        if (banco.cliente1.getId() != id && banco.cliente2.getId() != id  && banco.cliente3.getId() != id){
            System.out.println("el valor no es valido, quieres ver los clientes que existen? (si/no)");
            opcion = getting.next();
            if (opcion.equalsIgnoreCase("si")) {
                banco.cliente1.imprimir();
                banco.cliente2.imprimir();
                banco.cliente3.imprimir();
            } else if (opcion.equalsIgnoreCase("no")) {
                System.out.println("Bueno");
            }
        }else {
            System.out.println("mal");
        }
    }

    public void depositar(long id){
        String opcion;
        int valor;
        switch ((int) id){
            case 1:
                System.out.println("el valor actual del monto a depositar: "+ banco.cliente1.getMonto());
                valor = (int) Banco.pedirId(msgValorADepositrar);
                banco.cliente1.Depositar(valor);
                System.out.println("el valor actual del monto a depositar: "+ banco.cliente1.getMonto());
                break;
            case 2:
                System.out.println("el valor actual del monto a depositar: "+ banco.cliente2.getMonto());
                valor = (int) Banco.pedirId(msgValorADepositrar);
                banco.cliente2.Depositar(valor);
                System.out.println("el valor actual del monto a depositar: "+ banco.cliente2.getMonto());
                break;
            case 3:
                System.out.println("el valor actual del monto a depositar: "+ banco.cliente3.getMonto());
                valor = (int) Banco.pedirId(msgValorADepositrar);
                banco.cliente3.Depositar(valor);
                System.out.println("el valor actual del monto a depositar: "+ banco.cliente3.getMonto());
                break;
            default:
                System.out.println("el valor no es valido, quieres ver los clientes que existen? (si/no)");
                opcion = getting.next();
                if (opcion.equalsIgnoreCase("si")) {
                    banco.cliente1.imprimir();
                    banco.cliente2.imprimir();
                    banco.cliente3.imprimir();
                } else if (opcion.equalsIgnoreCase("no")) {
                    System.out.println("Bueno");
                }
        }
    }



}
