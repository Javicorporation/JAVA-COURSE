package EjerccicioDeLambdas.ejecutador;

import EjerccicioDeLambdas.clases.Alumnos;

import java.util.ArrayList;
import java.util.List;

public class Ejecutador {

    public void ejecutador (){

        // cracion de lista
        List<Alumnos> listaDeAlumnos = new ArrayList<>();
        listaDeAlumnos.add(new Alumnos(1,"948494689","Juanin","carlo","fisica",7.0,21));
        listaDeAlumnos.add(new Alumnos(2, "123456789", "María", "Gómez", "Matemáticas", 8.5, 22));
        listaDeAlumnos.add(new Alumnos(3, "987654321", "Luis", "Pérez", "Química", 9.0, 20));
        listaDeAlumnos.add(new Alumnos(4, "456789123", "lna", "Martínez", "Biología", 6.5, 23));
        listaDeAlumnos.add(new Alumnos(5, "321654987", "Carlos", "Hernández", "Historia", 7.5, 21));
        listaDeAlumnos.add(new Alumnos(6, "654321789", "gofía", "López", "Literatura", 8.0, 22));
        listaDeAlumnos.add(new Alumnos(7, "789123456", "ledro", "Ramírez", "Filosofía", 7.8, 42));

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

        // obtener el alumno con menor edad de la lista
        System.out.println("\n------------------");
        System.out.println("alumno con menor edad de la lista");
        System.out.println(listaDeAlumnos.stream().max((x,y) -> x.getEdad() -y.getEdad()));
    }
}
