package EjercicioDeBanco2.EjecutarBanco2;

import EjercicioDeBanco2.Clases2.Banco2;
import EjercicioDeBanco2.Metodos.Operaciones;

public class EjecutaddorBanco2 {

    public void presentar(){
        Banco2 banco2 = new Banco2();
        boolean loopMenu = false;
        int opcion;
        int id = 0;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Retirar");
            System.out.println("2. Depositar");
            System.out.println("3. Salir");
            opcion = Operaciones.pedirIntMenu("Escribe una opcion: ");
            switch (opcion) {
                case 1:
                    id = Operaciones.pedirIntMenu("Ingrese un ID del usuario: ");
                    banco2.BuscarClienteARetirar(id);
                    break;
                case 2:
                    id = Operaciones.pedirIntMenu("Ingrese un ID del usuario: ");
                    banco2.BuscarClienteADepositar(id);
                    break;
                case 3:
                    System.out.println("Gracias por participar.");
                    loopMenu = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (!loopMenu);



    }

}
