import java.util.Scanner;

public class Excercise9Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int lengthN;
        String arrayName[];
        int arrayAge[];

        System.out.print("Write a Length of array: ");
        lengthN = getting.nextInt();
        getting.nextLine();
        arrayName = new String[lengthN];
        arrayAge = new int[lengthN];


        for (int i = 0; i< arrayName.length; i++){
            System.out.print("Write a name "+(i+1)+": ");
            arrayName[i] = getting.nextLine();

            System.out.print("Write a age "+(i+1)   +": ");
            arrayAge[i] = getting.nextInt();
            getting.nextLine();
        }
        getting.close();

        for (int j = 0; j<arrayAge.length; j++){
            if (arrayAge[j]>= 18) {
                System.out.println("the age is: "+ arrayAge[j]);
            }
        }



    }
}
