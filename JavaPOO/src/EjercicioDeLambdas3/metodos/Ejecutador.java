package EjercicioDeLambdas3.metodos;

import EjercicioDeLambdas3.clases.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejecutador {

    public void ejecutar(){

        List<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(new Pelicula("E.t","Steven Spielberg",2002));
        listaPeliculas.add(new Pelicula("Jurassic Park", "Steven Spielberg", 2019));
        listaPeliculas.add(new Pelicula("Juanin", "Jacintoo", 1979));
        listaPeliculas.add(new Pelicula("El Padrino", "Francis Ford Coppola", 1990));
        listaPeliculas.add(new Pelicula("El Señor de los Anillos", "Peter Jackson", 2010));


//        Obtener un sublistado con las películas estrenadas en el siglo XXI (a partir del año 2000)
        System.out.println();
        System.out.println("Obtener un sublistado con las películas estrenadas en el siglo XXI (a partir del año 2000");
        List<Pelicula> peliculasSiglo21 = listaPeliculas.stream()
                .filter(vari -> vari.getEstreno() >= 2000)
                .collect(Collectors.toList());
        peliculasSiglo21.forEach(c -> System.out.println(c));

//        Mostrar por pantalla, separados por comas, los títulos de las películas de Steven Spielberg
        System.out.println();
        System.out.println("Mostrar por pantalla, separados por comas, los títulos de las películas de Steven Spielberg\n");

        String peliculasDeSteven = listaPeliculas.stream()
                .filter(c -> c.getDirecctor().equalsIgnoreCase("Steven Spielberg"))
                .map(t -> t.getTitulo())
                .collect(Collectors.joining(", ","Estas son las peliculas",""));
        System.out.println(peliculasDeSteven);


//        Obtener un sublistado con los nombres de las películas, ordenados alfabéticamente
        System.out.println();
        System.out.println("");

//        Mostrar por pantalla el estreno más reciente
        System.out.println();
        System.out.println("");

    }
}
