package EjercicioDeBanco2.EjecutarBanco2;

import EjercicioDeBanco2.Clases2.Banco2;
import EjercicioDeBanco2.Metodos.Operaciones;

public class EjecutaddorBanco2 {

    public void presentar(){
        boolean loopMenu = false;
        int opcion;
        int id = 0;
        Banco2 banco = new Banco2();
        banco.guardar();

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Retirar");
            System.out.println("2. Depositar");
            System.out.println("3. Salir");
            opcion = Operaciones.pedirOpcionMenu("Escribe una opcion: ");
            switch (opcion) {
                case 1:
                    id = Operaciones.pedirId("Ingrese un ID del usuario: ");
                    System.out.println(" -- "+id);
                    banco.imprimirCliente();
                    break;
                case 2:
                    id = Operaciones.pedirId("Ingrese un ID del usuario: ");
                    System.out.println(" -- "+id);
                    banco.imprimirCliente();
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
