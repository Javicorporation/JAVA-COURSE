import java.util.Scanner;

public class Excercise4Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int number;
        float promedio = 0, suma = 0;
        int mayor = 0;
        int menor = 0;


        System.out.print("write a number of array: ");
        number = getting.nextInt();
        float array3[] = new float[number];



        for (int i = 0; i < array3.length; i++){
            System.out.print("write a age: ");
            array3[i] = getting.nextFloat();
            suma = suma + array3[i];
        }

        for (int i = 0; i < array3.length; i++){
            System.out.println("the arrays is: "+array3[i]);
        }


        System.out.println("");
        promedio = suma / number;
        System.out.println("the average is: "+promedio);

        for (int i = 0; i < array3.length; i++){
            if (array3[i] > promedio) {
                mayor++;
            } else if (array3[i] < promedio) {
                menor++;

            }
        }
        System.out.println("the age greate is: "+mayor);
        System.out.println("the age minor is: "+menor);

    }
}
