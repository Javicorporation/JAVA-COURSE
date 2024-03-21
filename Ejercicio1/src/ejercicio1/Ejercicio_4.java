package ejercicio1;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double base;
        double altura;
        double areaDelTriangulo;
        
        System.out.print("escriba la base: ");
        base = entrada.nextDouble();
        System.out.print("escribe la altura: ");
        altura = entrada.nextDouble();
        
        areaDelTriangulo = (base * altura)/2;
        System.out.println("el area del triangulo es: "+ areaDelTriangulo);
    }
    
}
