import java.util.Scanner;

public class Excercise9Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        String array[] = new String[4];

        array[0] = "hola";
        array[1] = "holaa";
        array[2] = "holaaa";
        array[3] = "holaaaa";

        for (int i = 0; i< array.length; i++){
            System.out.println(array[i].length());

        }

    }
}
