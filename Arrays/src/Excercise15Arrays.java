import java.util.Scanner;

public class Excercise15Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int lengthN;
        int array1[];

        System.out.print("write a length: ");
        lengthN = getting.nextInt();
        array1 = new int[lengthN];
        getting.nextLine();


        for (int i = 0; i < array1.length; i++){
            System.out.print("write a number: ");
            array1[i] = getting.nextInt();
        }

        System.out.println("this is the previous array");

        for (int i = 0; i < array1.length; i++){
            System.out.println("posicion: "+i+" tiene el valor: "+array1[i]);
        }

        int numnadrop;
        System.out.print("Write a number drop: ");
        numnadrop = getting.nextInt();
        getting.nextLine();
        getting.close();

        for(int i = numnadrop; i < 9; i++){
            array1[i] = array1[i+1];
        }

        for (int i = 0; i < 9; i++){
            System.out.println("posicion: "+i+" tiene el valor: "+array1[i]);
        }









    }
}
