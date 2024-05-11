package Matrix;

import java.util.Scanner;

public class Excercise14Matrix {
    public static  void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        int num4 = 3;
        int num3 = 2;

        String arrayName[] = new String[num4];
        int matrizSalary [][] = new int[num4][num3];
        int arraySalaryTtl[] = new int[num4];


        // ingreso de nombres y sueldos
        for (int i = 0; i < arrayName.length; i++){
            System.out.print("Write a name of employee: ");
            arrayName[i] = getting.next();
            for (int j = 0; j < matrizSalary[i].length; j++){
                System.out.print("write your salary: ");
                matrizSalary[i][j] = getting.nextInt();
            }
            System.out.println("");
        }

        // suma de filas

        for (int i = 0; i < arraySalaryTtl.length; i++){
            int additionSalary = 0;
            for (int j= 0; j < matrizSalary[i].length; j++){
                additionSalary = additionSalary + matrizSalary[i][j];
            }
            arraySalaryTtl[i] = additionSalary;
        }


        // print salary
        for (int i = 0; i < arraySalaryTtl.length; i++){
            System.out.println("the salary of employee "+arrayName[i]+"is: "+arraySalaryTtl[i]);
        }

        //print mayor salary
        int sueldoM = arraySalaryTtl[0];
        String nameSM = arrayName[0];
        for (int i = 0; i < arraySalaryTtl.length; i++){
            if (arraySalaryTtl[i] > sueldoM){
                sueldoM = arraySalaryTtl[i];
                nameSM = arrayName[i];
            }

        }

        System.out.println("\nthe employee with salary the higher salary is: "+ nameSM);
        System.out.println("the salary is: "+sueldoM);





    }
}
