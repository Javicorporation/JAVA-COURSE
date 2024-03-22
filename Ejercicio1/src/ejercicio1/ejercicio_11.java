package ejercicio1;

import java.util.Scanner;


public class ejercicio_11 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1;
        double nota2;
        double nota3;
        int potencia;
        double promedio ;
        double resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la primera nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        nota3 = entrada.nextDouble();
        System.out.print("Su promedio a que potencia quiere que sea calculada: ");
        potencia = entrada.nextInt();
        
        resultado = (nota1 + nota2 + nota3)/3;
        
        promedio = Math.pow(resultado, potencia);
        
        System.out.println("el promedio es: "+ promedio);
        
    }
    
}
