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
        listaDeAlumnos.add(new Alumnos(4, "456789123", "Ana", "Martínez", "Biología", 6.5, 23));
        listaDeAlumnos.add(new Alumnos(5, "321654987", "Carlos", "Hernández", "Historia", 7.5, 21));
        listaDeAlumnos.add(new Alumnos(6, "654321789", "Sofía", "López", "Literatura", 8.0, 22));
        listaDeAlumnos.add(new Alumnos(7, "789123456", "Pedro", "Ramírez", "Filosofía", 7.8, 24));

        System.out.println("lista de alumnos: ");


        // convertimos en un flujo de elementos al arrayList por medio del stream
        listaDeAlumnos.stream().forEach(zzz -> System.out.println(" "+zzz));
    }
}
