package EjerccicioDeLambdas.ejecutador;

import EjerccicioDeLambdas.clases.Alumnos;

import java.util.ArrayList;
import java.util.List;

public class Ejecutador {

    public void ejecutador (){

        // cracion de lista
        List<Alumnos> listaDeAlumnos = new ArrayList<>();
        listaDeAlumnos.add(new Alumnos(1,"948494689","Juanin","carlo","fisic",7.0,21));
        listaDeAlumnos.add(new Alumnos(2, "123456789", "María", "Gómez", "MatemáticasT", 8.5, 22));
        listaDeAlumnos.add(new Alumnos(3, "987654321", "Luis", "Pérez", "Químic", 9.0, 20));
        listaDeAlumnos.add(new Alumnos(4, "456789123", "lna", "Martínez", "BiologíT", 6.5, 23));
        listaDeAlumnos.add(new Alumnos(5, "321654987", "Carlos", "Hernández", "Histori", 7.5, 21));
        listaDeAlumnos.add(new Alumnos(6, "654321789", "gofía", "López", "Literatura", 8.0, 22));
        listaDeAlumnos.add(new Alumnos(7, "789123456", "ledrolasger", "Ramírez", "FilosofíaT", 7.8, 42));

        System.out.println("lista de alumnos: ");


        // convertimos en un flujo de elementos al arrayList por medio del stream
        listaDeAlumnos.stream().forEach(zzz -> System.out.println(" "+zzz));

        // alumnos cuyo nombre empieza con L o G
        System.out.println("\n------------------");
        System.out.println("alumnos cuyo nombre empieza con L o G");
        listaDeAlumnos.stream()
                .filter(c -> c.getNombre().charAt(0) == 'L' || c.getNombre().charAt(0) == 'G')
                .forEach(c -> System.out.println(c.toString()));

        // alumnos cuyo nombre empieza con L o G, acepta mayusculas y minusculas
        System.out.println("\n------------------");
        System.out.println("alumnos cuyo nombre empieza con L o G");
        listaDeAlumnos.stream()
                .filter(c -> Character.toLowerCase(c.getNombre().charAt(0)) == 'l' || Character.toLowerCase(c.getNombre().charAt(0)) == 'g')
                .forEach(c -> System.out.println(c));

        // obtener el numero de alumnos de la lista
        System.out.println("\n------------------");
        System.out.println("numero de alumnos de la lista");
        System.out.println(listaDeAlumnos.stream().count());


        // obtener el alumno con menor edad de la lista
        System.out.println("\n------------------");
        System.out.println("alumno con menor edad de la lista");
        System.out.println(listaDeAlumnos.stream().min((a1,a2) -> a1.getEdad() - a2.getEdad()));
                                                      // se crean 2 variables y se restan

        // obtener el alumno con mayor edad de la lista
        System.out.println("\n------------------");
        System.out.println("alumno con mayor edad de la lista");
        System.out.println(listaDeAlumnos.stream().max((x,y) -> x.getEdad() -y.getEdad()));


        // obtener el nombre de los cursos que termina con t en la lista
        System.out.println("\n------------------");
        System.out.println("nombre de los cursos que termina con t en la lista");
        listaDeAlumnos.stream()
                .filter(c -> c.getNombreCurso().toLowerCase().endsWith("t"))
                .forEach(System.out::println);

        // obtener los alumnos que en el nombre del curso  contenga una a
        System.out.println("\n------------------");
        System.out.println("alumnos que en el nombre del curso  contenga una a");
        listaDeAlumnos.stream()
                .filter(c -> c.getNombreCurso().toLowerCase().contains("a"))
                .forEach(System.out::println);

        // obtener los alumnos que su nombre tenga mas de 10 caracteres
        System.out.println("\n------------------");
        System.out.println("alumnos que su nombre tenga mas de 10 caracteres");

        listaDeAlumnos.stream()
                .filter(c -> c.getNombre().length() > 10)
                .forEach(System.out::println);

    }
}
