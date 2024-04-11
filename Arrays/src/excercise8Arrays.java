import java.util.Scanner;

public class excercise8Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int lengthN;
        String array1[];

        System.out.print("Write of length the array: ");
        lengthN = getting.nextInt();
        array1 = new String[lengthN];
        getting.nextLine();

        for (int i = 0; i < array1.length; i++){
            System.out.print("write a String: ");
            array1[i] = getting.nextLine();
        }

        getting.close();

        int eva = array1[0].length();


        for (int i = 0; i < array1.length; i++){
            if (array1[i].length() > eva) {
                eva = array1[i].length();
            }
        }



        System.out.println("The strings in the array are:");
        for (String s : array1) {
            System.out.println(s);
        }
        System.out.println("the array with length evarege: "+eva);
    }
}
