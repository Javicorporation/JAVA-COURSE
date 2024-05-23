package Metodos;

import java.util.Scanner;

public class ClaseUsoDeMetodosConArgumentos {
    public static final Scanner getting = new Scanner(System.in);
    public static final String msgPedirCantidadN = "escriba la cantidad de numeros a ingresar: ";
    public static final String msgNumeroMayor = "el numero mayor es: ";
    public static final String msgNumeroMenor = "el numero menor es: ";

    public static int pedirNum(String message){
        System.out.print(message);
        return getting.nextInt();
    }

    public static int[] llenarArray(int cantidad){
        int[] array1 = new int[cantidad];
        for (int i = 0; i < array1.length ; i++) {
            array1[i] = (int) Math.floor(Math.random()*100+1);
        }
        return array1;
    }

    public static void imprimirArr(int[] array1){
        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }
    }


    public static int mayor (int[] arrayRam){
        int mayor = arrayRam[0];
        for (int i = 0; i < arrayRam.length; i++) {
            if (arrayRam[i] > mayor) {
                mayor = arrayRam[i];
            }
        }
        return mayor;
    }

    public static int menor(int[] arrayRam){
        int menor = arrayRam[0];
        for (int i = 0; i < arrayRam.length; i++) {
            if (arrayRam[i] < menor){
                menor = arrayRam[i];
            }
        }
        return menor;
    }

    public static void  buscarMayor(){

        int numCantidad = pedirNum(msgPedirCantidadN);
        int[] arrayx = llenarArray(numCantidad);
        imprimirArr(arrayx);
        int mayornum1 = mayor(arrayx);
        int menornum2 = menor(arrayx);
        System.out.println();
        System.out.println("el valor mayor es: "+mayornum1);
        System.out.println("el valor menor es: "+menornum2);

    }




}
