import java.util.Scanner;

public class Excercise20Arrays {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int length;
        int array1[];
        int sumPar= 0, promPar = 0, contPar = 0;
        int sumImpa = 0, promImpa = 0, contImpar = 0;


        System.out.print("write a length of array: ");
        length = getting.nextInt();
        array1 = new int[length];

        for (int i = 0; i < array1.length; i++){
            System.out.print("Write a number: ");
            array1[i] = getting.nextInt();
        }

        for (int i = 0; i < array1.length; i++){
            if (array1[i]%2 == 0) {
                sumPar = sumPar + array1[i];
                contPar++;
            }
            if (array1[i]%2 == 1) {
                sumImpa = sumImpa + array1[i];
                contImpar++;
            }

        }

        promPar = sumPar / contPar;
        promImpa = sumImpa / contImpar;

        System.out.println("par: "+promPar);
        System.out.println("impar: "+promImpa);

    }
}
