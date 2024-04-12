import java.util.Scanner;

public class Excercise12Arrays {
    public static void main(String[] args) {
        Scanner getting = new Scanner(System.in);
        
        int lengthN;
        int arrayMain[];
        int arrayPar[];
        int arrayImpa[];
        int contPar = 0, iPosit = 0;
        int contImpa = 0, iNegativ = 0;

        System.out.print("write a length of arraY: ");
        lengthN = getting.nextInt();
        
        arrayMain = new int[lengthN];
        
        for (int i = 0; i  < arrayMain.length;i++){
            System.out.print("write a number: ");
            arrayMain[i] = getting.nextInt();
        }

        for (int i = 0; i  < arrayMain.length;i++){
            if (arrayMain[i]%2 == 0) {
                contPar++;
            } else if (arrayMain[i]%2 == 1) {
                contImpa++;
            }
        }

        arrayPar = new int[contPar];
        arrayImpa = new int[contImpa];

        for (int i = 0; i  < arrayMain.length;i++){
            if (arrayMain[i]%2 == 0) {
                arrayPar[iPosit] = arrayMain[i];
                iPosit++;
            } else if (arrayMain[i]%2 == 1) {
                arrayImpa[iNegativ] = arrayMain[i];
                iNegativ++;
            }

        }

        System.out.println("par:");
        for (int i = 0; i  < arrayPar.length;i++){
            System.out.print(arrayPar[i]);
        }
        System.out.println("");
        System.out.println("impar:");
        for (int i = 0; i  < arrayImpa.length;i++){
            System.out.print(arrayImpa[i]);
        }
        
        
        
    }
}
