package BubbleMethod;

import java.util.Scanner;

public class Excercise23BubbleStrings {
    // entendi
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int lengt;
        String arrayStri[];
        String box = "";

        System.out.print("Write a length: ");
        lengt = getting.nextInt();

        arrayStri = new String[lengt];

        for (int i = 0; i < arrayStri.length; i++){
            System.out.print("Write a string: ");
            arrayStri[i] = getting.next();
        }
        for (int i = 0 ; i < arrayStri.length-1; i++){
            for (int j= 0; j < arrayStri.length-1; j++){
                if (arrayStri[j].compareTo(arrayStri[j+1]) > 0) {
                    box = arrayStri[j];
                    arrayStri[j] = arrayStri[j+1];
                    arrayStri[j+1] = box;
                }
            }
        }


        for (int i = 0; i < arrayStri.length; i++){
            System.out.println(arrayStri[i]);
        }

    }
}
