import java.util.Scanner;

public class Excercise14Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int lengthN;
        String arrayName[];
        double arrayHeigth[];


        System.out.print("Write a length of array: ");
        lengthN = getting.nextInt();
        arrayName = new String[lengthN];
        arrayHeigth = new double[lengthN];
        getting.nextLine();


        for (int i = 0; i < arrayName.length;i++){
            System.out.print("Write a name "+(i+1)+": ");
            arrayName[i] = getting.nextLine();

            System.out.print("Write a height "+(i+1)+": ");
            arrayHeigth[i] = getting.nextDouble();
            getting.nextLine();
        }
        double heigthGreater = arrayHeigth[0];
        double heigthMinor = arrayHeigth[0];
        String nameGreater = arrayName[0];
        String nameMinor = arrayName[0];


        for (int i = 0; i < arrayHeigth.length; i++){
            if (arrayHeigth[i] >= heigthGreater) {
                heigthGreater = arrayHeigth[i];
                nameGreater = arrayName[i];

            } else if (arrayHeigth[i] < heigthMinor) {
                heigthMinor = arrayHeigth[i];
                nameMinor = arrayName[i];
            }

        }
        System.out.println("greater: "+heigthGreater+" and name is: "+nameGreater);
        System.out.println("minor: "+heigthMinor+" and name is: "+nameMinor);








    }
}
