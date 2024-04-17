import java.util.Scanner;

public class Excercise17Arrays {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int array1[], array2[], array3[];
        int length;

        System.out.print("write a number: ");
        length = getting.nextInt();

        array1 = new int[length];
        array2 = new int[length];
        array3 = new int[length*2];


        boolean isdes = false;
        while (!isdes){
            for (int i = 0; i< array1.length; i++) {
                System.out.print("write a number of position" + i + " of array 1: ");
                array1[i] = getting.nextInt();
            }



            isdes = true;
            for (int i = 0; i < array1.length-1; i++) {
                if (array1[i] > array1[i+1]) {
                    isdes = false;
                    break;
                }
            }
            if (isdes) {
                System.out.println("");
                System.out.println("en orden");;
            }else{
                System.out.println("en desorden");
            }
        }

        boolean isdest2 = false;
        while (!isdest2){
            for (int j = 0; j < array2.length; j++){
                System.out.print("Write a number of position "+j+"the array 2: ");
                array2[j] = getting.nextInt();
            }
            getting.nextLine();
            isdest2 = true;
             for (int j = 0; j < array2.length-1; j++){
                 if (array2[j] > array2[j+1]){
                     isdest2 = false;
                     break;
                 }
             }
            if (isdest2) {
                System.out.println("");
                System.out.println("en orden");
            }else {
                System.out.println("in desorden");
            }
        }


    }
}
