package EjerciciosConBucles;

import java.util.Scanner;

public class EExcercise17Loops {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int amountPoints;
        int pointX;
        int pointY;
        int countC1 = 0;
        int countC2 = 0;
        int countC3 = 0;
        int countC4 = 0;


        System.out.print("Write a number of points: ");
        amountPoints = getting.nextInt();

        for (int i = 1; i<= amountPoints ;i++){
            System.out.print("Write a number of points X: ");
            pointX = getting.nextInt();
            System.out.print("Write a number of points Y: ");
            pointY = getting.nextInt();

            if (pointY >= 0 && pointX >= 0){
                countC1++;
            } else if (pointY >= 0 && pointX < 0) {
                countC2++;
            } else if (pointY < 0 && pointX < 0) {
                countC3++;
            } else if (pointY < 0 && pointX >= 0) {
                countC4++;
            }
        }
        System.out.println("points on the quadrant 1: "+countC1);
        System.out.println("points on the quadrant 2: "+countC2);
        System.out.println("points on the quadrant 3: "+countC3);
        System.out.println("points on the quadrant 4: "+countC4);



    }

}
