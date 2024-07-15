package EjercicioDeListas.Ejecutador;

import EjercicioDeListas.Clases.Serie;
import EjercicioDeListas.Clases.VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class Ejecutador {
    public void ejecutador(){

        List<Serie> listaSerie = new ArrayList<>();
        List<VideoJuego> listaVideoJuego = new ArrayList<>();

        listaSerie.add(new Serie("Game of Thrones", 8, "fantasia", "David Benioff"));
        listaSerie.add(new Serie("Breaking Bad", 5, "drama", "Vince Gilligan"));
        listaSerie.add(new Serie("Friends", 10, "comedia", "Marta Kauffman"));
        listaSerie.add(new Serie("The Wire", 5, "drama", "David Simon"));


        listaVideoJuego.add(new VideoJuego("The Legend of Zelda", 30, "aventura", "Shigeru Miyamoto"));
        listaVideoJuego.add(new VideoJuego("Grand Theft Auto V", 60, "acción", "Sam Houser"));
        listaVideoJuego.add(new VideoJuego("Minecraft", 25, "sandbox", "Markus Persson"));
        listaVideoJuego.add(new VideoJuego("Fortnite", 0, "battle royale", "Epic Games"));

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






    }

}
