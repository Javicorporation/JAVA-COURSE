package EjercicioDeListas.Ejecutador;

import EjercicioDeListas.Clases.Serie;
import EjercicioDeListas.Clases.VideoJuego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutador {
    public final Scanner getting = new Scanner(System.in);

    public void ejecutador(){

        List<Serie> listaSerie = new ArrayList<>();
        List<VideoJuego> listaVideoJuego = new ArrayList<>();
        int opcion = 0;
        boolean loopMenu = false;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Agregar Serie");
            System.out.println("2. Agregar Video Juego");
            System.out.println("3. Salir");
            System.out.println("Escribe una opcion:");
            opcion = getting.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Titulo: ");
                    String nombre = getting.next();
                    System.out.print("Numero de temporadas: ");
                    int numTemp = getting.nextInt();
                    System.out.print("Genero: ");
                    String genero = getting.next();
                    System.out.print("Creador: ");
                    String creador = getting.next();
                    listaSerie.add(new Serie(nombre,numTemp,genero,creador));
                    break;
                case 2:
                    System.out.print("Titulo: ");
                    String nombreV = getting.next();
                    System.out.print("Numero de temporadas: ");
                    int horasEstimV = getting.nextInt();
                    System.out.print("Genero: ");
                    String generoV = getting.next();
                    System.out.print("Creador: ");
                    String campania = getting.next();
                    listaVideoJuego.add(new VideoJuego(nombreV,horasEstimV,generoV,campania));
                    break;
                case 3:
                    loopMenu = true;
                    break;
                default:
                    System.out.println("La opcion no esta dismonible");
            }
        }while (!loopMenu);

//        listaSerie.add(new Serie("Game of Thrones", 8, "fantasia", "David Benioff"));
//        listaSerie.add(new Serie("Breaking Bad", 1, "drama", "Vince Gilligan"));
//        listaSerie.add(new Serie("Friends", 10, "comedia", "Marta Kauffman"));
//        listaSerie.add(new Serie("The Wire", 5, "drama", "David Simon"));
//
//        listaVideoJuego.add(new VideoJuego("The Legend of Zelda", 30, "aventura", "Shigeru Miyamoto"));
//        listaVideoJuego.add(new VideoJuego("Grand Theft Auto V", 60, "acción", "Sam Houser"));
//        listaVideoJuego.add(new VideoJuego("Minecraft", 25, "sandbox", "Markus Persson"));
//        listaVideoJuego.add(new VideoJuego("Fortnite", 0, "battle royale", "Epic Games"));

        // entregamos los elemento de la lista de series
        for (int i = 0; i < listaSerie.size(); i++) {
            listaSerie.get(i).entregar();
        }

        for (int j = 0; j < listaVideoJuego.size(); j++) {
            listaVideoJuego.get(j).entregar();

        }

        // contamos el numero de articulos entregados
        int entregado = 0;
        for (int i = 0; i < listaSerie.size(); i++) {
            if (listaSerie.get(i).comprobarArticuloExistente()) {
                entregado ++;
                listaSerie.get(i).devolver();
            }
        }

        for (int i = 0; i < listaVideoJuego.size(); i++) {
            if (listaVideoJuego.get(i).comprobarArticuloExistente()) {
                entregado++;
                listaVideoJuego.get(i).devolver();
            }
        }
        System.out.println("Hay " + entregado + " articulos entregados");
        System.out.println("");


        // averiguamos la serie mayor de una lista
        Serie serieMayor = listaSerie.get(0);
        VideoJuego videoJuegoMayor = listaVideoJuego.get(0);

        for (int i = 0; i < listaSerie.size(); i++) {
            if (listaSerie.get(i).compareTo(serieMayor) == Serie.mayor) {
                serieMayor = listaSerie.get(i);
            }
        }

        for (int i = 0; i < listaVideoJuego.size(); i++) {
            if (listaVideoJuego.get(i).compareTo(videoJuegoMayor) == VideoJuego.mayor) {
                videoJuegoMayor = listaVideoJuego.get(i);
            }
        }

        // averiguamos la serie o video juego menor de una lista

        VideoJuego videoJuegoMenor = listaVideoJuego.get(0);
        Serie serieMenor = listaSerie.get(0);

        for (int i = 0; i < listaVideoJuego.size(); i++) {
            if (listaVideoJuego.get(i).compareTo(videoJuegoMenor) == Serie.menor) {
                videoJuegoMenor = listaVideoJuego.get(i);
            }
        }

        for (int i = 0; i < listaSerie.size(); i++) {
            if (listaSerie.get(i).compareTo(serieMenor) == Serie.menor) {
                serieMenor = listaSerie.get(i);
            }
        }

        System.out.println("articulos Mayores");
        System.out.println("---------------------");
        System.out.println(serieMayor);
        System.out.println(videoJuegoMayor);
        System.out.println("\nArticulos Menores");
        System.out.println("----------------------");
        System.out.println(serieMenor);
        System.out.println(videoJuegoMenor);











    }

}
