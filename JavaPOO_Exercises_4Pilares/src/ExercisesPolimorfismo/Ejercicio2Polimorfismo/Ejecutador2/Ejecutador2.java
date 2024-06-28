package ExercisesPolimorfismo.Ejercicio2Polimorfismo.Ejecutador2;

import ExercisesPolimorfismo.Ejercicio2Polimorfismo.Clases2.Animal;
import ExercisesPolimorfismo.Ejercicio2Polimorfismo.Clases2.Perro;
import ExercisesPolimorfismo.Ejercicio2Polimorfismo.Metodos2.Metodos;

public class Ejecutador2 {
    public void presentar(){
        Metodos metodos = new Metodos();
        boolean loopMenu = false;
        int opcion;

        do {
            System.out.println("---- MENU ----");
            System.out.println("1. Agregar animal");
            System.out.println("2. Listar animales");
            System.out.println("3. Salir");
            opcion = Metodos.pedirInt("Escribe una opcion: ");

            switch (opcion){
                case 1:
                    metodos.agregarAnimales();
                    break;
                case 2:
                    metodos.listarAnimales();
                    break;
                case 3:
                    System.out.println("gracias, adios");
                    loopMenu = true;
                    break;
                default:
                    System.out.println("el valor ingresado no se encuentra en el menu.");
            }
        }while (!loopMenu);
    }
}
