package EjercicioControlDePeliculas.Ejecutador;

import EjercicioControlDePeliculas.servicios.ControlPeliculasImpl;
import EjercicioControlDePeliculas.servicios.IControlPeliculasDAO;

import java.util.Scanner;

public class Ejecutador {
    IControlPeliculasDAO controPeli = new ControlPeliculasImpl();
    public Scanner getting = new Scanner(System.in);
    public void presentar(){
        boolean loopMenu;
        int opcion;

        do {
            System.out.println("Menu");
            System.out.println("1. Iniciar control de peliculas");
            System.out.println("2. Agregar pelicula");
            System.out.println("3. Listar peliculas");
            System.out.println("4. Eliminar pelicula");
            System.out.println("5. Buscar pelicula");
            System.out.println("6. Salir");
            System.out.print("Digite una opcion: ");
            opcion = getting.nextInt();
            switch(opcion){
                case 1:
                    controPeli.iniciarControlPeliculas();
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Digite el nombre de la pelicula: ");
                    String nombre = getting.nextLine();
                    System.out.print("Digite el autor de la pelicula: ");
                    String autor = getting.nextLine();
                    System.out.print("Digite el genero de la pelicula: ");
                    String genero = getting.nextLine();
                    controPeli.agregarpeliculas(nombre, autor, genero);
                    System.out.println("Pelicula agregada con exito");
                    break;
                case 3:
                    System.out.println();
                    controPeli.listarPeliculas();
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Digite el nombre de la pelicula a buscar: ");
                    String nombrePelicula = getting.nextLine();
                    controPeli.buscarPelicula(nombrePelicula);
                    System.out.println("Pelicula encontrada con exito");
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Adios");
                    opcion = 6;
                    break;
                default:
                    System.out.println("Opcion no valida, vuelve a intentar.");
            }

        }while (opcion != 6);
    }
}
