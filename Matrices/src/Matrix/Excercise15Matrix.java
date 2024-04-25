package Matrix;

import java.util.Scanner;

public class Excercise15Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int num3 = 3;
        int num4 = 4;

        String nameCity[] = new String[num4];
        double temper[][] = new double[num4][num3];
        double meditemper[] = new double[num4];

        for (int i = 0; i < nameCity.length; i++){
            System.out.print("Write a name of the city: ");
            nameCity[i] = getting.next();
            for (int j = 0; j < temper[i].length; j++){
                System.out.print("Write a temperature: ");
                temper[i][j] = getting.nextDouble();
            }
        }

        for (int i = 0; i < meditemper.length ; i++){
            double additionTemp = 0;
            for (int j = 0; j < temper[i].length ; j++){
                additionTemp = additionTemp + temper[i][j];
            }
            meditemper[i] = additionTemp;
        }

        System.out.println("present temperature:");
        for (int i = 0; i < meditemper.length; i++){
            System.out.println("\nthe employee with temper the higher temper is: "+nameCity[i]+" the temper is: "+meditemper[i]);
        }

        double digger = meditemper[0];
        String name = nameCity[0];
        for (int i = 0; i < meditemper.length; i++){
            if (meditemper[i] > digger) {
                digger = meditemper[i];
                name = nameCity[i];
            }
        }
        System.out.println("");
        System.out.println(digger);
        System.out.println(name);

    }
}
