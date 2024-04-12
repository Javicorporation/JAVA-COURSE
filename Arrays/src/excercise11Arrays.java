import java.util.Scanner;

public class excercise11Arrays {
    public static void main(String[] args){
        Scanner getting = new Scanner(System.in);

        int lengthN;
        int array1[];
        int contNumN = 0;
        int contNumP = 0;
        int arrayPlus[];
        int arrayNegative[];

        System.out.print("Write a length the array:");
        lengthN = getting.nextInt();

        array1 = new int[lengthN];

        for (int i = 0; i < array1.length; i++){
            System.out.print("write a nuumber: ");
            array1[i] = getting.nextInt();
        }
        for (int i = 0; i < array1.length; i++){
            if(array1[i] >= 0){
                contNumP++;
            } else if (array1[i] < 0) {
                contNumN++;
            }
        }
        arrayPlus = new int[contNumP];
        arrayNegative = new int[contNumN];

        for (int i = 0; i < array1.length;i++){
            if (array1[i] < 0){
                arrayNegative[i] = array1[i];
                System.out.print("the array positive is: "+arrayPlus[i]);
            }
            if (array1[i] >= 0) {
                arrayPlus[i] = array1[i];
                System.out.println("the array of negative is: "+arrayNegative[i]);
            }
        }



    }
}
