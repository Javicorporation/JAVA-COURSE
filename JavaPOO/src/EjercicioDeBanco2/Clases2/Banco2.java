package EjercicioDeBanco2.Clases2;

import java.util.ArrayList;
import java.util.List;

public class Banco2 {

    List<Cliente2> clientes = new ArrayList<>();

    Cliente2 cliente1 = new Cliente2("juan", "paz",1, 100);
    Cliente2 cliente2 = new Cliente2("Martha", "Mart",2, 100);
    Cliente2 cliente3 = new Cliente2("Luci", "Lasso",3, 100);

    public void guardar(){
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
    }

    public void imprimirCliente(){

        for (Cliente2 obj : clientes){
            System.out.println(obj);
        }
    }

//    public int Buscar(int id){
//        double valor = 0;
//        String opcion;
//        for (Cliente2 cliente : clientes){
//            if (cliente.getId() == id) {
//                valor = cliente.getId();
//            }else {
//                System.out.println("el valor no es valido, quieres ver los clientes que existen? (si/no)");
//                opcion = Operaciones.getting.next();
//                if (opcion.equalsIgnoreCase("si")) {
//                    imprimirCliente();
//                } else if (opcion.equalsIgnoreCase("no")) {
//                    System.out.println("Bueno");
//                }
//            }
//        }
//        return (int) valor;
//    }
}













