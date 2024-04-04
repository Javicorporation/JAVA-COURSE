package EjerciciosConBucles;

import java.util.Scanner;

public class Excercise19Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int age1, age2, age3;
        int addition1 = 0;
        int addition2 = 0;
        int addition3 = 0;
        int average1 = 0;
        int average2 = 0;
        int average3 = 0;


        for (int i = 1; i <= 5; i++){
            System.out.print("Write age the group 1: ");
            age1 = getting.nextInt();
            addition1 = addition1+ age1;

        }
        System.out.println("");

        for (int j = 1; j <= 6; j++){
            System.out.print("Write age the group 2: ");
            age2 = getting.nextInt();
            addition2 = addition2+ age2;

        }

        System.out.println("");
        for (int h = 1; h <= 10; h++){
            System.out.print("Write age the group 3: ");
            age3 = getting.nextInt();
            addition3 = addition3+ age3;
        }

        average1 = addition1/5;
        average2 = addition2/6;
        average3 = addition3/10;

        System.out.println("the average the group 1 is: "+average1);
        System.out.println("the average the group 2 is: "+average2);
        System.out.println("the average the group 3 is: "+average3);

        if (average1 < average2 && average1 < average3) {
            System.out.println("the average minor is: "+ average1);
        }if (average2 < average1 && average2 < average3) {
            System.out.println("the average minor is: "+ average2);
        }if (average3 < average2 && average3 < average1) {
            System.out.println("the average minor is: "+ average3);
        }
    }
}
