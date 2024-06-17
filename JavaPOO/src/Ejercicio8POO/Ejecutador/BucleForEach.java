package Ejercicio8POO.Ejecutador;

import Ejercicio8POO.Clases.Persona;

public class BucleForEach {

    public void bucleForEachNormal(){
        int[] numeros = new int[3];

        numeros[0] = 21;
        numeros[1] = 22;
        numeros[2] = 23;


        for(int vas: numeros){
            System.out.print(vas+" ");
        }
    }

    public void forEachPersonas(){
        Persona[] personas = new Persona[4];

        personas[0] = new Persona("juan","luls", 12,"hombre");
        personas [1] = new Persona("carlo","mendez",21, "hombre");
        personas [3] = new Persona("juan","mendez",22, "hombre");
        personas [2] = new Persona("Mario","mendez",23, "hombre");

        for (Persona persona: personas){
            persona.mostrar();
            System.out.println();
        }



    }
}
