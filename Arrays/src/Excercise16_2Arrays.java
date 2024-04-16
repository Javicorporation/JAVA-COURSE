import java.util.ArrayList;
import java.util.Scanner;

public class Excercise16_2Arrays {
    public static  void main(String[] args){
        Scanner getting = new Scanner(System.in);

        ArrayList<Integer> arrayListMain = new ArrayList<>();
        int number;
        do {
            System.out.print("write a number: ");
            number = getting.nextInt();

            if (number == -1){
                System.out.println("EXIT");
                break;
            }else {
                arrayListMain.add(number);
            }
        }while (true);

        System.out.println("the array is: "+arrayListMain);

    }
}
