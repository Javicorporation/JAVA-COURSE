import java.util.Scanner;

public class excercise5Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int negative = 0;
        int positive = 0;
        int par = 0;
        int impar = 0;
        int array1[];
        int number;

        System.out.print("write a leng: ");
        number = getting.nextInt();
        array1 = new int[number];

        for (int i=0; i < array1.length; i++){
            System.out.print("write a number: ");
            array1[i] = getting.nextInt();
        }

        for (int i=0; i < array1.length; i++){
            if (array1[i] < 0) {
                negative++;
            } if (array1[i] > 0) {
                positive++;
            } if (array1[i]%2 == 0 && array1[i] > 0) {
                par++;
            } if (array1[i]%2 == 1) {
                impar++;
            }
        }

        System.out.println("the negative is: "+negative);
        System.out.println("the positive is: "+positive);
        System.out.println("the par is: "+par);
        System.out.println("the impar is: "+impar);
        




    }
}
