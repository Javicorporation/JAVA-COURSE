package EjercicioDeBanco2.Clases2;


import EjercicioDeBanco2.Metodos.Operaciones;

import java.util.ArrayList;
import java.util.List;

public class Banco2 {

    private String nombre;
    private String apellido;
    private int id;
    private double monto;

    List<Cliente2> clientes = new ArrayList<>();
    Operaciones opear = new Operaciones();

    public void crearCliente(){
        Cliente2 cliente1 = new Cliente2("juan", "paz",1, 100);
        Cliente2 cliente2 = new Cliente2("Martha", "Mart",1, 100);
        Cliente2 cliente3 = new Cliente2("Luci", "Lasso",1, 100);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
    }


    public Cliente2 BuscarClienteARetirar (int id){
        double valor = 0;
        for(Cliente2 cliente : clientes){
            if (cliente.getId() == id) {
                System.out.println("Su valor actual es: "+cliente.getMonto());
                valor = Operaciones.pedirDouble("Escribe el valor a depositar");
                opear.retirar(valor);
                System.out.println("Su valor actual es: "+cliente.getMonto());
            }
        }
        System.out.println("Cliente no encontrado");
        return null;
    }

    public Cliente2 BuscarClienteADepositar (int id){
        double valor = 0;
        for(Cliente2 cliente : clientes){
            if (cliente.getId() == id) {
                System.out.println("Su valor actual es: "+cliente.getMonto());
                valor = Operaciones.pedirDouble("Escribe el valor a depositar");
                opear.depositar(valor);
                System.out.println("Su valor actual es: "+cliente.getMonto());
            }
        }
        System.out.println("Cliente no encontrado");
        return null;
    }

}
