package Constructores;

import java.util.Scanner;

public class ConstructorConParametrosYArray {

    int[] array;
    //int NLength;


    //contructor
    ConstructorConParametrosYArray(int NLength){
        //this.NLength = NLength;

        // existen 2 puntos de vista:
        // si pasas como longitud de array this.Nlength estaras asignando el valor que esta fuera del metodo
        // y no el que estas pasando como parametro
        Scanner getting = new Scanner(System.in);
        array = new int[NLength];
        for (int i = 0; i < NLength; i++) {
            System.out.print("Ingrese un valor: ");
            array[i] = getting.nextInt();
        }
    }

    // metodo normal
    public void inprimir(){
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor: " + array[i]);

        }

    }
}
