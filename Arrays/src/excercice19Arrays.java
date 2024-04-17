import java.util.Scanner;

public class excercice19Arrays {

    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);

        int length;
        int array1[], array2[], array3[];

        System.out.print("write a length of arrays: ");
        length = getting.nextInt();
        array1 = new int[length];
        array2 = new int[length];
        array3 = new int[array1.length+array2.length];

        for (int i = 0; i < array1.length; i++){
            System.out.print("write a number of array 1: ");
            array1[i] = getting.nextInt();
        }
        for (int i = 0; i < array2.length; i++){
            System.out.print("write a number of array 2: ");
            array2[i] = getting.nextInt();
        }
        getting.close();

        int ara12 = 0;
        int ara3 = 0;

        while (ara12 < array1.length){
            for (int k = 0; k < 3; k++){
                array3[ara3] = array1[ara12+k];
                ara3++;
            }
            for (int k = 0; k < 3; k++){
                array3[ara3] = array2[ara12 +k];
                ara3++;
            }
            ara12 +=3;
        }
        System.out.println("");
        for (int i = 0; i < array3.length; i++){
            System.out.println("the array 3 is: "+array3[i]);
        }

    }

}
