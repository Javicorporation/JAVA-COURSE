import java.util.Scanner;

public class Excercise6Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int elementsN;
        int array1[];
        boolean orde = false;
        boolean messy = false;
        boolean negative = false;


        System.out.print("Write a number of length: ");
        elementsN = getting.nextInt();
        if (elementsN < 0){
            System.out.println("The array with negative number does not exist.");
            System.exit(0);
        }
        array1= new int[elementsN];

        do {
            for (int i = 0; i < array1.length; i++){
                System.out.print("write a number: ");
                array1[i] = getting.nextInt();
            }

            for (int i=0; i < array1.length; i++){
                if (array1[i] < 0) {
                    negative = true;
                    break;
                } else {
                    negative = false;
                }
            }
            if (negative == true){
                System.out.println("value negative in array");
            }

        }while (negative == true);

        for (int i=0; i < (elementsN-1); i++){
            if (array1[i] < array1[i+1]) {
                orde = true;
            } else if (array1[i] > array1[i+1]) {
                messy = true;
            }
        }
        if (orde == true && messy == false){
            System.out.println("the arrays so order");
        } else if (orde == false && messy == true) {
            System.out.println("the arrays so messy");
        } else if (orde == true && messy == true) {
            System.out.println("the arrays so desordenado");
        }else {
            System.out.println("the arrays so iquals");
        }


    }
}
