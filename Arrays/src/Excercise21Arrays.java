import java.util.Scanner;

public class Excercise21Arrays {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int length;
        int elementSearch;
        int array1[];

        System.out.print("write a lengt of array: ");
        length = getting.nextInt();
        array1 = new int[length];


        for (int i = 0; i < array1.length; i++){
            System.out.print("Write a number: ");
            array1[i] = getting.nextInt();
        }
        System.out.print("Element a search: ");
        elementSearch = getting.nextInt();
        getting.close();


        boolean encontrado = false;
        int i ;

        for (i = 0 ; i < length && encontrado == false ;i++){
            if (array1[i] == elementSearch){
                encontrado = true;
            }

        }
        if (encontrado == true) {
            System.out.println("encontrado in the position: "+(i-1));
        }
        if (encontrado == false) {
            System.out.println("element no  econtrado");
        }











    }
}
