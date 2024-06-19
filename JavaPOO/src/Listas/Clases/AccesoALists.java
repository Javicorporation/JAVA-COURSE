package Listas.Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AccesoALists {
    public final Scanner getting = new Scanner(System.in);
    public static final String msgPorIndex = "Ingrese un indice: ";
    public static final String msgTexto = "Ingrese un texto: ";

    public List<String> diasDeLaSemana = new ArrayList<>();
    public List<Integer> numeros = new ArrayList<>();

    public int pedirInt(String message){
        System.out.print(message);
        return getting.nextInt();
    }
    public String pedirString(String message){
        System.out.print(message);
        return getting.next();
    }

    public void Recuperar(){
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miercoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sabado");
        diasDeLaSemana.add("Domingo");

        // obtener por medio del index
        int indice = pedirInt(msgPorIndex);
        getting.nextLine();
        System.out.print("el indice es: "+diasDeLaSemana.get(indice));
        System.out.println();

        // poner en un un dato segun el indice
        int indice2 = pedirInt(msgPorIndex);
        String texto = pedirString(msgTexto);
        System.out.println("Lod datos ingresados son: "+indice2+" y "+texto);
        diasDeLaSemana.set(indice2,texto);

        for(String dias: diasDeLaSemana){
            System.out.println(dias);
        }


    }

    // ordenar una lista con Collections y sort
    public void Modificar(){
        numeros.add(935);
        numeros.add(267);
        numeros.add(543);
        numeros.add(343);
        numeros.add(54);
        Collections.sort(numeros);
        for (int numer:numeros){
            System.out.println(numer);
        }
    }


}
