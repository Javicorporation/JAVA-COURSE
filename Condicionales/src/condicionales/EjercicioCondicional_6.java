package condicionales;

import java.util.Scanner;

public class EjercicioCondicional_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3;
        
        double promedio;
        
        System.out.print("escriba la primera nota: ");
        nota1 = entrada.nextInt();
        
        System.out.print("escriba la primera nota: ");
        nota2 = entrada.nextInt();
        
        System.out.print("escriba la primera nota: ");
        nota3 = entrada.nextInt();
        
        promedio = (nota1+nota2+nota3)/3;
        
        if (promedio < 4) {
            System.out.println("Reprobado");
        } else if(promedio >= 4 && promedio < 7){
            System.out.println("Regular");
        }else if(promedio >= 7){
            System.out.println("Excelente");
        }
        
        
        
    }
    
}
